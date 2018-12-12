/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.i18n;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * @author zhuxiuhong
 * @since 2018
 */
@Component
public class I18nUtils {
  @Resource
  private MessageSource messageSource;

  /**
   * 
   * @param key
   * @return String
   */
  public String getMessage(String key) {
    return getMessage(key, null);
  }

  /**
   * 
   * @param key
   * @param args
   * @return String
   */
  public String getMessage(String key, String[] args) {
    return getMessage(key, args, null);
  }

  /**
   * 
   * @param key
   * @param args
   * @param request
   * @return String
   */
  public String getMessage(String key, String[] args, HttpServletRequest request) {
    return getMessage(key, args, null, request);
  }

  /**
   * 
   * @param key
   * @param args
   * @param defaultMessage
   * @param request
   * @return String
   */
  public String getMessage(String key, String[] args, String defaultMessage,
      HttpServletRequest request) {
    Locale locale = null;
    if (null == request) {
      locale = Locale.getDefault();
    } else {
      locale = request.getLocale();
    }
    return getMessageByLocale(key, args, defaultMessage, locale);
  }

  /**
   * 
   * @param key
   * @param args
   * @param locale
   * @return String
   */
  public String getMessageByLocale(String key, String[] args, Locale locale) {
    return getMessageByLocale(key, args, null, locale);
  }

  /**
   * 
   * @param key
   * @param args
   * @param defaultMessage
   * @param locale
   * @return String
   */
  public String getMessageByLocale(String key, String[] args, String defaultMessage,
      Locale locale) {
    if (null == locale) {
      locale = Locale.getDefault();
    }
    if (null == defaultMessage) {
      return messageSource.getMessage(key, getArgsMessage(args, locale), locale);
    } else {
      return messageSource.getMessage(key, getArgsMessage(args, locale),
          messageSource.getMessage(defaultMessage, null, locale), locale);
    }
  }

  /**
   * 
   * @param args
   * @param locale
   * @return Object[]
   */
  private Object[] getArgsMessage(String[] args, Locale locale) {
    if (null == args || args.length == 0) {
      return args;
    }
    List<String> msgs = new ArrayList<String>();
    for (String arg : args) {
      if (null != arg) {
        msgs.add(messageSource.getMessage(arg, null, locale));
      }
    }
    return msgs.toArray();
  }
}
