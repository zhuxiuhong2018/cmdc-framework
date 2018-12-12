package com.cm.cmdc.common.component.rabbitmq;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.util.StringUtils;

/**
 * 
 * @author zhuxiuhong
 *
 */
public class RabbitConfig {
	/**
	 * 实例化CachingConnectionFactory
	 * @param host
	 * @param port
	 * @param username
	 * @param password
	 * @param virtualHost
	 * @return
	 */
	public CachingConnectionFactory instanceConnectionFactory(String host,
			int port, String username, String password, String virtualHost) {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
		connectionFactory.setHost(host);
		connectionFactory.setPort(port);
		connectionFactory.setUsername(username);
		connectionFactory.setPassword(password);
		if(!StringUtils.isEmpty(virtualHost)){
			connectionFactory.setVirtualHost(virtualHost);
		}
		return connectionFactory;
	}

	/**
	 * 实例化RabbitTemplate
	 * @param connectionFactory
	 * @return
	 */
    public RabbitTemplate instanceRabbitTemplate(ConnectionFactory connectionFactory) {
    	RabbitTemplate template = new RabbitTemplate(connectionFactory);
		template.setMessageConverter(new Jackson2JsonMessageConverter());
		return template;
    }
    
    /**
     * 实例化SimpleRabbitListenerContainerFactory
     * @param connectionFactory
     * @return
     */
    public SimpleRabbitListenerContainerFactory instanceFactory(
			ConnectionFactory connectionFactory) {
		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setMessageConverter(new Jackson2JsonMessageConverter());
		return factory;
	}
}