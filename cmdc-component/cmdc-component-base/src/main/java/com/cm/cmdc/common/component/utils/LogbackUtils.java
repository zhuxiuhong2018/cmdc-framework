/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.utils;

import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.FileAppender;

/**
 * Logback Utility
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class LogbackUtils {

	private static Logger logger = LoggerFactory.getLogger(LogbackUtils.class);

	private LogbackUtils(){
		throw new IllegalStateException("Utility class");
	}
	
	public static boolean updateSystemPropertyWithLogbackFileName() {
		try {
			Iterator<Appender<ILoggingEvent>> it = ((LoggerContext) LoggerFactory
					.getILoggerFactory()).getLogger("ROOT")
					.iteratorForAppenders();
			while (it.hasNext()) {
				Appender<ILoggingEvent> appender = it.next();
				if (appender instanceof AsyncAppender) {
					AsyncAppender async = (AsyncAppender) appender;
					Iterator<Appender<ILoggingEvent>> asyncIt = async
							.iteratorForAppenders();
					while (asyncIt.hasNext()) {
						Appender<ILoggingEvent> asyncRef = asyncIt.next();
						if (asyncRef instanceof FileAppender) {
							String fileName = ((FileAppender<ILoggingEvent>) asyncRef)
									.getFile();
							System.setProperty("logging.file", fileName);
							return true;
						}
					}
				} else if (appender instanceof FileAppender) {
					String fileName = ((FileAppender<ILoggingEvent>) appender)
							.getFile();
					System.setProperty("logging.file", fileName);
					return true;
				}
			}
		} catch (Exception e) {
			logger.warn("can not init admin logger file.", e);
		}

		return false;
	}
}
