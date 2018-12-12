/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.utils;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * JVM Time Utility
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class JVMTimeUtils {
	private JVMTimeUtils(){
		throw new IllegalStateException("Utility class");
	}
	
	public static long getJVMStartTime() {
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
		return runtimeBean.getStartTime();
	}

	public static long getJVMUpTime() {
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
		return runtimeBean.getUptime();
	}
}
