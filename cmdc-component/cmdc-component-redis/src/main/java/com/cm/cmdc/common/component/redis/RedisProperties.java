/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * redis配置属性类
 * 
 * @author zhuxiuhong
 * @since 2018
 */
@Component(value = "redisPropertiesFactory")
public class RedisProperties {
	private String maxRedirects;
	private String maxTotal;
	private String maxIdle;
	private String minIdle;
	private String maxWaitMillis;
	private String minEvictableIdleTimeMillis;
	private String numTestsPerEvictionRun;
	private String timeBetweenEvictionRunsMillis;
	private String testOnBorrow;
	private String timeout;
	private String usePool;
	private String nodes;
	private String password;

	@Autowired
	private Environment env;

	/**
	 * 初始化redis配置
	 * 
	 * @Methods Name redisProperties
	 * @Create In 2018年1月16日 By songjie
	 * @return RedisProperties
	 */
	@Bean
	public RedisProperties redisProperties() {
		RedisProperties properties = new RedisProperties();
		maxRedirects = env.getProperty("default.redis.maxRedirects");
		maxTotal = env.getProperty("default.redis.maxTotal");
		maxIdle = env.getProperty("default.redis.maxIdle");
		minIdle = env.getProperty("default.redis.minIdle");
		maxWaitMillis = env.getProperty("default.redis.maxWaitMillis");
		minEvictableIdleTimeMillis = env
				.getProperty("default.redis.minEvictableIdleTimeMillis");
		numTestsPerEvictionRun = env
				.getProperty("default.redis.numTestsPerEvictionRun");
		timeBetweenEvictionRunsMillis = env
				.getProperty("default.redis.timeBetweenEvictionRunsMillis");
		testOnBorrow = env.getProperty("default.redis.testOnBorrow");
		timeout = env.getProperty("default.redis.timeout");
		usePool = env.getProperty("default.redis.usePool");
		nodes = env.getProperty("default.redis.nodes");
		
		password = env.getProperty("default.redis.password", "");

		properties.setMaxRedirects(maxRedirects);
		properties.setMaxTotal(maxTotal);
		properties.setMaxIdle(maxIdle);
		properties.setMinIdle(minIdle);
		properties.setMaxWaitMillis(maxWaitMillis);
		properties.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		properties.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
		properties
				.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		properties.setTestOnBorrow(testOnBorrow);
		properties.setTimeout(timeout);
		properties.setUsePool(usePool);
		properties.setNodes(nodes);
		properties.setPassword(password);
		
		return properties;
	}

	/**
	 * @return the maxRedirects
	 */
	public String getMaxRedirects() {
		return maxRedirects;
	}

	/**
	 * @param maxRedirects
	 *            the maxRedirects to set
	 */
	public void setMaxRedirects(String maxRedirects) {
		this.maxRedirects = maxRedirects;
	}

	/**
	 * @return the maxTotal
	 */
	public String getMaxTotal() {
		return maxTotal;
	}

	/**
	 * @param maxTotal
	 *            the maxTotal to set
	 */
	public void setMaxTotal(String maxTotal) {
		this.maxTotal = maxTotal;
	}

	/**
	 * @return the maxIdle
	 */
	public String getMaxIdle() {
		return maxIdle;
	}

	/**
	 * @param maxIdle
	 *            the maxIdle to set
	 */
	public void setMaxIdle(String maxIdle) {
		this.maxIdle = maxIdle;
	}

	/**
	 * @return the minIdle
	 */
	public String getMinIdle() {
		return minIdle;
	}

	/**
	 * @param minIdle
	 *            the minIdle to set
	 */
	public void setMinIdle(String minIdle) {
		this.minIdle = minIdle;
	}

	/**
	 * @return the maxWaitMillis
	 */
	public String getMaxWaitMillis() {
		return maxWaitMillis;
	}

	/**
	 * @param maxWaitMillis
	 *            the maxWaitMillis to set
	 */
	public void setMaxWaitMillis(String maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}

	/**
	 * @return the minEvictableIdleTimeMillis
	 */
	public String getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	/**
	 * @param minEvictableIdleTimeMillis
	 *            the minEvictableIdleTimeMillis to set
	 */
	public void setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	/**
	 * @return the numTestsPerEvictionRun
	 */
	public String getNumTestsPerEvictionRun() {
		return numTestsPerEvictionRun;
	}

	/**
	 * @param numTestsPerEvictionRun
	 *            the numTestsPerEvictionRun to set
	 */
	public void setNumTestsPerEvictionRun(String numTestsPerEvictionRun) {
		this.numTestsPerEvictionRun = numTestsPerEvictionRun;
	}

	/**
	 * @return the timeBetweenEvictionRunsMillis
	 */
	public String getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	/**
	 * @param timeBetweenEvictionRunsMillis
	 *            the timeBetweenEvictionRunsMillis to set
	 */
	public void setTimeBetweenEvictionRunsMillis(
			String timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	/**
	 * @return the testOnBorrow
	 */
	public String getTestOnBorrow() {
		return testOnBorrow;
	}

	/**
	 * @param testOnBorrow
	 *            the testOnBorrow to set
	 */
	public void setTestOnBorrow(String testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	/**
	 * @return the timeout
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * @param timeout
	 *            the timeout to set
	 */
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return the usePool
	 */
	public String getUsePool() {
		return usePool;
	}

	/**
	 * @param usePool
	 *            the usePool to set
	 */
	public void setUsePool(String usePool) {
		this.usePool = usePool;
	}

	/**
	 * @return the nodes
	 */
	public String getNodes() {
		return nodes;
	}

	/**
	 * @param nodes
	 *            the nodes to set
	 */
	public void setNodes(String nodes) {
		this.nodes = nodes;
	}

	/**
	 * 是否配置默认mq
	 * 
	 * @return
	 */
	public boolean validQueue() {
		return true;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
