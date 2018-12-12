/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.component.redis;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

/**
 * redis配置类
 * 
 * @author zhuxiuhong
 * @since 2018
 */
@Configuration
public class RedisConfig {
	@Autowired
	private RedisProperties redisProperties;

	/**
	 * redis集群配置
	 * 
	 * @return RedisClusterConfiguration
	 */
	@Bean
	public RedisClusterConfiguration redisClusterConfiguration() {
		RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
		if (isEmpty(redisProperties.getNodes())) {
			return redisClusterConfiguration;
		}
		String[] nodes = redisProperties.getNodes().split(",");
		if (null != nodes && nodes.length > 0) {
			List<RedisNode> nodeList = getNodeList(nodes);
			redisClusterConfiguration.setClusterNodes(nodeList);
		}

		if (!isEmpty(redisProperties.getMaxRedirects())) {
			redisClusterConfiguration.setMaxRedirects(Integer
					.valueOf(redisProperties.getMaxRedirects()));
		}
		return redisClusterConfiguration;
	}

	/**
	 * 连接池配置
	 * 
	 * @return JedisPoolConfig
	 */
	@Bean
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		if (!isEmpty(redisProperties.getMaxTotal())) {
			jedisPoolConfig.setMaxTotal(Integer.valueOf(redisProperties
					.getMaxTotal()));
		}
		if (!isEmpty(redisProperties.getMaxIdle())) {
			jedisPoolConfig.setMaxIdle(Integer.valueOf(redisProperties
					.getMaxIdle()));
		}
		if (!isEmpty(redisProperties.getMaxWaitMillis())) {
			jedisPoolConfig.setMaxWaitMillis(Long.valueOf(redisProperties
					.getMaxWaitMillis()));
		}
		if (!isEmpty(redisProperties.getMinEvictableIdleTimeMillis())) {
			jedisPoolConfig.setMinEvictableIdleTimeMillis(Long
					.valueOf(redisProperties.getMinEvictableIdleTimeMillis()));
		}
		if (!isEmpty(redisProperties.getNumTestsPerEvictionRun())) {
			jedisPoolConfig.setNumTestsPerEvictionRun(Integer
					.valueOf(redisProperties.getNumTestsPerEvictionRun()));
		}
		if (!isEmpty(redisProperties.getTimeBetweenEvictionRunsMillis())) {
			jedisPoolConfig
					.setTimeBetweenEvictionRunsMillis(Long
							.valueOf(redisProperties
									.getTimeBetweenEvictionRunsMillis()));
		}
		if (!isEmpty(redisProperties.getTestOnBorrow())) {
			if ("true".equals(redisProperties.getTestOnBorrow())) {
				jedisPoolConfig.setTestOnBorrow(true);
			} else if ("false".equals(redisProperties.getTestOnBorrow())) {
				jedisPoolConfig.setTestOnBorrow(false);
			}
		}
		return jedisPoolConfig;
	}

	/**
	 * jedis连接工厂
	 * 
	 * @return JedisConnectionFactory
	 */
	@Bean
	public JedisConnectionFactory jedisConnectionFactory(
			RedisClusterConfiguration redisClusterConfiguration,
			JedisPoolConfig jedisPoolConfig) {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(
				redisClusterConfiguration, jedisPoolConfig);
		if (!isEmpty(redisProperties.getTimeout())) {
			jedisConnectionFactory.setTimeout(Integer.valueOf(redisProperties
					.getTimeout()));
		}
		
		if(!StringUtils.isBlank(redisProperties.getPassword())) {
			/**
			 *  设置 redis密码.
			 */
			jedisConnectionFactory.setPassword(redisProperties.getPassword());
		}
		
		return jedisConnectionFactory;
	}

	/**
	 * 获取RedisTemplate
	 * 
	 * @param jedisConnectionFactory
	 * @return RedisTemplate
	 */
	@SuppressWarnings("rawtypes")
	@Bean
	public RedisTemplate redisTemplate(
			JedisConnectionFactory jedisConnectionFactory) {
		RedisTemplate<?, ?> redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(jedisConnectionFactory);
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
		
		RedisSerializer stringSerializer = new StringRedisSerializer();
	    redisTemplate.setKeySerializer(stringSerializer);
	    redisTemplate.setValueSerializer(stringSerializer);
	    redisTemplate.setHashKeySerializer(stringSerializer);
	    redisTemplate.setHashValueSerializer(stringSerializer);

		return redisTemplate;
	}

	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return boolean
	 */
	public boolean isEmpty(String str) {
		if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str.trim())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 获取节点列表
	 * 
	 * @param nodes
	 * @return List<RedisNode>
	 */
	private List<RedisNode> getNodeList(String[] nodes) {
		List<RedisNode> nodeList = new ArrayList<RedisNode>();
		if (null == nodes || nodes.length == 0) {
			return nodeList;
		}
		for (String node : nodes) {
			if (isEmpty(node)) {
				continue;
			}
			RedisNode redisNode = getRedisNode(node);
			if(null != redisNode){
				nodeList.add(redisNode);
			}
		}
		return nodeList;
	}

	/**
	 * 获取节点
	 * 
	 * @param node
	 * @return RedisNode
	 */
	private RedisNode getRedisNode(String node) {
		String[] nodeObj = node.trim().split(":");
		if (null == nodeObj || nodeObj.length <= 1 || nodeObj[0] == null || nodeObj[1] == null) {
			return null;
		}
		String host = nodeObj[0].trim();
		String port = nodeObj[1].trim();
		int nPort = 0;
		try {
			nPort = Integer.valueOf(port);
		} catch (Exception e) {
			return null;
		}
		if (isEmpty(host) || isEmpty(port)) {
			return null;
		}
		return new RedisNode(host, nPort);
	}
}
