/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.service.core.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * CoreConfig
 * @author zhuxiuhong
 * @since 2018
 */
@Configuration
@EnableHystrix
@EnableFeignClients(basePackages = { "com.cm.cmdc.**.feign.**",
		"com.cm.cmdc.**.api.**" })
@Import({ SwaggerConfig.class })
@ComponentScan(basePackages = { "com.cm.cmdc" })
public class CoreConfig {

}
