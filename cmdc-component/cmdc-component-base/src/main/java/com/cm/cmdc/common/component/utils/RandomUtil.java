package com.cm.cmdc.common.component.utils;

import java.util.Random;

public class RandomUtil {
	private RandomUtil() {
	}

	public static int getRandomNum() {
		return (int) ((Math.random() * 0xffffff) % 0xffffff);
	}

	public static int getRandomNum(int max) {
		return (int) ((Math.random() * 0xffffff) % max);
	}

	public static int getRandomNum(int min, int max) {
		if (max < 5) {
			max = 5;
		}
		
		if (min > max) {
			min = max - 1;
		}

		return (int) ((Math.random() * 0xffffff) % (max + 1 - min)) + min;
	}

	public static String getRandomString(int length) { // length表示生成字符串的长度
		String base = "abcdefghijkmnrstuvwxyz0123456789ABCDEFGHJKLMNPQRSTUVWXYZ";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
}
