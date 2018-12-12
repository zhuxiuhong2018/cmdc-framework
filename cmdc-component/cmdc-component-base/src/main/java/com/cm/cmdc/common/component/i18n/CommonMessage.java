/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.i18n;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

/**
 * @author zhuxiuhong
 * @since 2018
 */
@Component
public class CommonMessage {
	@Value("${cmdc.config.i18n.basenames:}")
	private String basenames;
	  
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:messages/exception-framework", "classpath:messages/exception");
		messageSource.setUseCodeAsDefaultMessage(true);
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(0);
		messageSource.addBasenames("classpath:messages/exception-framework");
	    messageSource.addBasenames("classpath:messages/exception");
	    if(StringUtils.isBlank(basenames)){
	    	return messageSource;
	    }
		String[] basenameArr = basenames.split(",");
		if(null == basenameArr || basenameArr.length == 0){
			return messageSource;
		}
		for(String basename : basenameArr){
			if(StringUtils.isNotBlank(basename.trim())){
				messageSource.addBasenames("classpath:"+basename.trim());
			}
		}
		return messageSource;
	}

}
