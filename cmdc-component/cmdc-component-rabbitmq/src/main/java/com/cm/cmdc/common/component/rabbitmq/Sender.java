package com.cm.cmdc.common.component.rabbitmq;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * 生产消息类
 * @author zhuxiuhong
 *
 */
public class Sender{
    @Autowired
	private AmqpTemplate rabbitTemplate;
    
    /**
	 * Convert a Java object to an Amqp {@link Message} and send it to a default exchange with a specific routing key.
	 *
	 * @param routingKey the routing key
	 * @param message a message to send
	 * @throws AmqpException if there is a problem
	 */
    public void convertAndSend(String routingKey, Object message) throws AmqpException{
		this.rabbitTemplate.convertAndSend(routingKey, message);
	}
    
    /**
	 * Convert a Java object to an Amqp {@link Message} and send it to a specific exchange with a specific routing key.
	 *
	 * @param exchange the name of the exchange
	 * @param routingKey the routing key
	 * @param message a message to send
	 * @throws AmqpException if there is a problem
	 */
    public void convertAndSend(String exchange, String routingKey, Object message) throws AmqpException{
		this.rabbitTemplate.convertAndSend(exchange, routingKey, message);
	}
    
    /**
     * 
     * @param routingKey
     * @param message
     * @throws AmqpException
     */
    public void convertAndSendTopic(String routingKey, Object message) throws AmqpException{
		this.rabbitTemplate.convertAndSend(Properties.TOPIC_EXCHANGE, routingKey, message);
	}
    
    /**
     * 获取rabbitTemplate实例
     * @return
     */
    public AmqpTemplate getTemplate(){
    	return rabbitTemplate;
    }
}
