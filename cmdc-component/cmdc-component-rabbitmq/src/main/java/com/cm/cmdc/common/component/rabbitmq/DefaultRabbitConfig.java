package com.cm.cmdc.common.component.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 
 * @author zhuxiuhong
 *
 */
@Configuration
public class DefaultRabbitConfig extends RabbitConfig{
	@Autowired
	private Properties rabbitProperties;
	@Autowired
	private Properties properties;
	/**
	 * 
	 * @return
	 */
	@Bean(name = "connectionFactory")
	public ConnectionFactory connectionFactory() {
		if (rabbitProperties.validQueue()) {
			return instanceConnectionFactory(rabbitProperties.getHost(),
					Integer.valueOf(rabbitProperties.getPort()),
					rabbitProperties.getUsername(),
					rabbitProperties.getPassword(),
					rabbitProperties.getVirtualHost());
		}
		return new CachingConnectionFactory();
    }
    
	/**
	 * 
	 * @param connectionFactory
	 * @return
	 */
    @Bean(name="rabbitTemplate")
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		return instanceRabbitTemplate(connectionFactory);
	}

    /**
     * 
     * @param connectionFactory
     * @return
     */
	@Bean(name="rlcFactory")
	public SimpleRabbitListenerContainerFactory rlcFactory(
			ConnectionFactory connectionFactory) {
		return instanceFactory(connectionFactory);
	}
	
	@Bean
    public TopicExchange topicExchange(@Qualifier("connectionFactory")CachingConnectionFactory connectionFactory) {
		if("true".equals(properties.getExchange())){
			//默认为false，不创建exchange
			try {
				Connection connection = connectionFactory.getRabbitConnectionFactory().newConnection();
				Channel channel = connection.createChannel();
				channel.exchangeDeclare(Properties.TOPIC_EXCHANGE, "topic", true);
				System.out.println("exchangeDeclare成功：TOPIC.EXCHANGE");
			} catch (IOException e) {
				System.out.println("exchangeDeclare失败："+e.getStackTrace().toString());
			} catch (TimeoutException e) {
				System.out.println("exchangeDeclare失败，访问超时："+e.getStackTrace().toString());
			}
		}
        return new TopicExchange(Properties.TOPIC_EXCHANGE);
    }
	
}