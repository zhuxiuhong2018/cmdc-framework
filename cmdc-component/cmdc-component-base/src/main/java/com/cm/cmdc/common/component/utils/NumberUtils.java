package com.cm.cmdc.common.component.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtils {

	protected static final Logger logger = LoggerFactory.getLogger(NumberUtils.class);

	public static int ObjctToInteger(Object obj) {
		if (obj == null) {
			return 0;
		}

		int ret = 0;
		try {
			if (obj.getClass().equals(Integer.class) || obj.getClass().equals(int.class)) {
				ret = (Integer) obj;
			} else if (obj.getClass().equals(Long.class) || obj.getClass().equals(long.class)) {
				ret = ((Long) obj).intValue();
			} else if (obj.getClass().equals(Short.class) || obj.getClass().equals(short.class)) {
				ret = ((Short) obj).intValue();
			} else {
				ret = Integer.parseInt("" + obj);
			}

		} catch (Exception e) {

		}
		return ret;

	}

}
