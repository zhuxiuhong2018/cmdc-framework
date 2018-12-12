/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Exception Utility
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class ExceptionUtil {

	private ExceptionUtil() {
	}

	public static String getErrorInfoFromException(Exception e) {
		try {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			return "\r\n" + sw.toString() + "\r\n";
		} catch (Exception e2) {
			return "bad getErrorInfoFromException";
		}
	}
}
