/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.utils;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.UUID;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import com.cm.cmdc.common.constant.CommonConstant;
import com.cm.cmdc.common.exception.CommonException;
import com.fasterxml.jackson.core.type.TypeReference;
/**
 * 常用工具类
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class BeanUtil {
	private static final Logger logger = LoggerFactory.getLogger(BeanUtil.class);

	private BeanUtil() {
	}

	/**
	 * 将空元素移除, 并检查List是否为空,
	 * 
	 * @Methods Name validateList
	 * @Create In 2018年3月17日 By zhuxiuhong
	 * @param list
	 *          void
	 */
	public static void trimList(List<?> list) throws CommonException {

		if (!CollectionUtils.isEmpty(list)) {
			// 从列表尾部将空元素删除.
			for (int i = list.size() - 1; i >= 0; i--) {
				Object obj = list.get(i);
				if (obj == null) {
					list.remove(i);
					continue;
				}
				// 检查是否为 String 是否为空.
				if (String.class.isAssignableFrom(obj.getClass()) && StringUtils.isBlank((String) obj)) {
					list.remove(i);
				}
			}
		}
	}

	public static void trimAndValidateList(List<?> list, String errorMsg) throws CommonException {
		trimList(list);
		// 删除空元素后, 再检查 列表是否为空.
		if (CollectionUtils.isEmpty(list)) {
			throw new CommonException(errorMsg);
		}
	}

	/**
	 * 根据 sslEnabled 拼接 url 地址.
	 * 
	 * @Methods Name concatURL
	 * @Create In 2018年3月23日 By zhuxiuhong
	 * @param ip
	 * @param port
	 * @param sslEnabled
	 * @return String
	 */
	public static String concatURL(String ip, String port, String sslEnabled) {
		StringBuilder builder = new StringBuilder();

		if (Boolean.valueOf(sslEnabled)) {
			builder.append("https://");
		} else {
			builder.append("http://");
		}

		builder.append(ip);

		if (StringUtils.isNotBlank(port)) {
			builder.append(":");
			builder.append(port);
		}

		return builder.toString();
	}

	/**
	 * 获取按批量阈值，执行次数
	 */
	public static int getBatchSizeOfThreshold(List<?> list, int maxBatchInsertNum) {
		int len = list.size();
		return len % maxBatchInsertNum == 0 ? len / maxBatchInsertNum : (len / maxBatchInsertNum + 1);
	}

	public static int getBatchSizeOfThreshold(List<?> list) {
		return getBatchSizeOfThreshold(list, CommonConstant.MAX_BATCH_INSERT_VALUE);
	}

	/**
	 * 获取分割后的SubList
	 */
	public static List<?> getSubList(List<?> list, int i, int batchNum, int maxBatchInsertNum) {
		if ((i * maxBatchInsertNum) > list.size()) {
			return null;
		}

		int endPost = (i + 1) * maxBatchInsertNum;
		if (endPost > list.size()) {
			endPost = list.size();
		}

		return list.subList(i * maxBatchInsertNum, endPost);
	}

	public static List<?> getSubList(List<?> list, int i, int batchNum) {
		return getSubList(list, i, batchNum, CommonConstant.MAX_BATCH_INSERT_VALUE);
	}

	/**
	 * 去掉对象中有 String 类型字段前后的空格.
	 * 
	 * @Methods Name trimObject
	 * @Create In 2018年4月9日 By zhuxiuhong
	 * @param mainObj
	 *          void
	 */
	public static <T extends Serializable> void trimObject(T mainObj, Class<?> topSupperClass) {
		if (mainObj == null) {
			return;
		}
		Class<?> type = mainObj.getClass();

		/**
		 * 递归调用, 去掉 String类型 字段的前后空格
		 */
		trimObject(mainObj, type, 4, topSupperClass);
	}

	/**
	 * 递归调用, 去掉 String类型 字段的前后空格.
	 * 
	 * @Methods Name trimObject
	 * @Create In 2018年4月9日 By zhuxiuhong
	 * @param mainObj
	 * @param type
	 * @param level
	 *          void
	 */
	private static <T extends Serializable> void trimObject(T mainObj, Class<?> type, int level, Class<?> topSupperClass) {
		if (level <= 0) {
			return;
		}

		if (type.equals(topSupperClass) || type.isPrimitive() || type.equals(Object.class)) {
			return;
		}

		/**
		 * 字段列表.
		 */
		Field[] fields = type.getDeclaredFields();
		if (fields == null || fields.length <= 0) {
			return;
		}

		for (Field field : fields) {
			if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers())
					|| !field.getType().equals(String.class)) {
				// 不处理 static 及 final 类型. 及非 String 类型.
				continue;
			}

			/**
			 * 只处理 String 类型.
			 */
			if (!trimField(mainObj, type, field)) {
				// 处理失败了.
				return;
			}
		}

		/**
		 * 处理父类.
		 */
		trimObject(mainObj, type.getSuperclass(), level - 1, topSupperClass);
	}

	/**
	 * trim单个字段.
	 * 
	 * @Methods Name trimField
	 * @Create In 2018年4月9日 By zhuxiuhong
	 * @param mainObj
	 * @param type
	 * @param field
	 * @return boolean
	 */
	private static <T extends Serializable> boolean trimField(T mainObj, Class<?> type, Field field) {
		boolean isAccessible = field.isAccessible();
		try {
			field.setAccessible(true);
			String val = (String) field.get(mainObj);
			if (val != null) {
				field.set(mainObj, val.trim());
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			logger.error("trimObject: 读取{}字段{}失败. 错误信息为:{}", type.getName(), field.getName(), e);
			return false;
		} finally {
			field.setAccessible(isAccessible);
		}
		return true;
	}

	/**
	 * 判断两个 String 是否相等.
	 * 
	 * @Methods Name isSameString
	 * @Create In 2018年4月9日 By zhuxiuhong
	 * @param str0
	 * @param str1
	 * @return boolean
	 */
	public static boolean isSameString(String str0, String str1) {
		if (StringUtils.isBlank(str0)) {
			return StringUtils.isBlank(str1);
		}

		if (StringUtils.isBlank(str1)) {
			return false;
		}

		return str0.equals(str1);
	}

	/**
	 * 获取 uuid
	 * 
	 * @return String
	 */
	public static String getUUID() {
		return StringUtils.replace(UUID.randomUUID().toString(), "-", "");
	}

	/**
	 * 对象 拷贝
	 * 
	 * @param source
	 * @param target
	 * @throws BeansException
	 */
	public static <S extends Serializable, T extends Serializable> void copyProperties(S source, T target,
			String... ignoreProperties) throws BeansException {
		BeanUtils.copyProperties(source, target, ignoreProperties);
	}

	/**
	 * 
	 * @param obj
	 * @param valueTypeRef
	 * @return
	 */
	public static <T> T convertJsonMapToObject(Object obj, TypeReference<T> valueTypeRef) {
		String data = JsonUtil.toJson(obj);
		if (StringUtils.isBlank(data)) {
			logger.error("JsonUtil.toJson(obj) == empty String ");
			return null;
		}
		// json反序列化
		try {
			return JsonUtil.getObjectMapper().readValue(data, valueTypeRef);
		} catch (IOException e) {
			logger.error("convertJsonMapToObject Error: ", e.getMessage());
			throw new CommonException(e.getMessage());
		}
	}
}
