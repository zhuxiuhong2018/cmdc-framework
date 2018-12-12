package com.cm.cmdc.common.component.utils;

import org.apache.commons.lang3.StringUtils;

/***
 * String 工具类.
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class StringUtil {
	private StringUtil() {
	}

	public static boolean isBlank(String str) {
		return StringUtils.isBlank(str);
	}

	public static boolean isSameString(String str0, String str1) {
//		if (str0 == null && str1 == null) {
//			return true;
//		}

		if (str0 == null || str1 == null) {
			return false;
		}

		return str0.equals(str1);
	}

	public static final char UNDERLINE = '_';

	/**
	 * 驼峰转换成 下划线 方式.
	 * 
	 * @param param
	 * @return
	 */
	public static String toUnderline(String param) {
		if (isBlank(param)) {
			return "";
		}

		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				if (i > 0) {
					sb.append(UNDERLINE);
				}
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * 下划线方式 ---> 驼峰方式.
	 * 
	 * @param param
	 * @return
	 */
	public static String underlineToCamel(String param) {
		if (isBlank(param)) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		int i = -1;
		while ((i++) < len) {
			char c = param.charAt(i);
			if (c == UNDERLINE) {
				if ((i + 1) == len) {
					break;
				}
				if (Character.isLowerCase(param.charAt(i + 1))) {
					sb.append(Character.toUpperCase(param.charAt(i + 1)));
					i++;
				} else {
					sb.append(c);
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
