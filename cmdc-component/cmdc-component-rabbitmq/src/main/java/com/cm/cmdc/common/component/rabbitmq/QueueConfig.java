package com.cm.cmdc.common.component.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 
 * 定义queue 继承QueueConfig类，通过调用QueueConfig中的defineQueue方法定义queue
 * 
 * @author zhuxiuhong
 * 
 */
@Component
public class QueueConfig {
	@Resource
	private CachingConnectionFactory connectionFactory;

	@Resource(name = "iotbusConnectionFactory")
	private CachingConnectionFactory iotbusConnectionFactory;

	@Autowired
	private Environment env;

	@Autowired
	private Properties rabbitProperties;

	@Autowired
	private TopicExchange topicExchange;

	@Autowired
	private TopicExchange iotbusTopicExchange;

	@Bean
	public QueueConfig initQueue() {
		System.out.println("系统加载定义queue......");
		// queue定义
		String queues = rabbitProperties.getQueues();
		String topics = rabbitProperties.getTopics();
		try {
			if (rabbitProperties.validQueue()) {
				// queue定义
				queueDeclare(connectionFactory, queues);
				// topic定义
				queueDeclare(connectionFactory, topics);
			}
		} catch (IOException e) {
			System.out.println("定义queue失败[" + queues + "],异常：" + e.getMessage());
		} catch (TimeoutException e) {
			System.out.println("定义queue失败[" + queues + "],异常：" + e.getMessage());
		}

		// iotbus queue定义
		String iotbusQueues = rabbitProperties.getIotbusQueues();
		String iotbusTopics = rabbitProperties.getIotbusTopics();
		try {
			if (rabbitProperties.validIotbusQueue()) {
				queueDeclare(iotbusConnectionFactory, iotbusQueues);
				queueDeclare(iotbusConnectionFactory, iotbusTopics);
			}
		} catch (IOException e) {
			System.out.println("定义queue失败[" + iotbusQueues + "],异常：" + e.getMessage());
		} catch (TimeoutException e) {
			System.out.println("定义queue失败[" + iotbusQueues + "],异常：" + e.getMessage());
		}

		// 绑定topic
		String routing = rabbitProperties.getRouting();
		if (!isEmpty(routing)) {
			try {
				bingExchange(connectionFactory, topicExchange.getName(), routing);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String iotbusRouting = rabbitProperties.getIotbusRouting();
		if (!isEmpty(iotbusRouting)) {
			try {
				bingExchange(iotbusConnectionFactory, iotbusTopicExchange.getName(), iotbusRouting);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return new QueueConfig();
	}

	public void queueDeclare(CachingConnectionFactory factory, String queues) throws IOException, TimeoutException {
		if (isEmpty(queues)) {
			return;
		}
		String[] queueArr = queues.split(",");
		if (null != queueArr && queueArr.length > 0) {
			Connection connection = factory.getRabbitConnectionFactory().newConnection();
			Channel channel = connection.createChannel();
			for (String queueName : queueArr) {
				if (!isEmpty(queueName)) {
					channel.queueDeclare(queueName, true, false, false, null);
					System.out.println("queueDeclare成功:" + queueName);
				}
			}
		}
	}

	public void bingExchange(CachingConnectionFactory factory, String exchange, String routing)
			throws IOException, TimeoutException {
		// TODO Auto-generated method stub
		// String routing
		// ="message.test.*:IOTBUS_TOPIC_MESSAGE_01,IOTBUS_TOPIC_MESSAGE_02&*.test.*:IOTBUS_TOPIC_TEST_02,IOTBUS_TOPIC_TEST_03";
		if (isEmpty(routing) || isEmpty(exchange)) {
			System.out.println("bingExchange失败：参数不能为空");
			return;
		}
		String[] routingArr = routing.trim().split("&");
		if (null != routingArr && routingArr.length > 0) {
			Connection connection = factory.getRabbitConnectionFactory().newConnection();
			Channel channel = connection.createChannel();
			for (String routingName : routingArr) {
				if (!isEmpty(routingName)) {
					System.out.println("定义routingName成功:" + routingName);
					String[] routingObj = routingName.trim().split(":");
					if (null != routingObj && routingObj.length > 1) {
						String routingKey = routingObj[0];
						String routingValues = routingObj[1];
						if (isEmpty(routingKey) || isEmpty(routingValues)) {
							System.out.println("routing 格式不正确，routing=" + routingName + "");
							continue;
						}
						System.out.println("routingKey = " + routingKey + " & routings = " + routingValues + "");
						String[] routingValueArr = routingValues.split(",");
						if (null != routingValueArr && routingValueArr.length > 0) {
							for (String queue : routingValueArr) {
								if (isEmpty(queue)) {
									System.out.println("routingKey = " + routingKey + " & routingValue = " + queue + "");
									continue;
								}
								// System.out.println("routingKey = " +routingKey + " & routingValue = " + routingValue+"");
								// 绑定exchange
								channel.queueBind(queue, exchange, routingKey);
								System.out.println("#####################      绑定topic成功: topicName=topic.exchange & queue=" + queue
										+ " & routingKey=" + routingKey);
							}
						}
					}
				}

			}
		}
	}

	public boolean isEmpty(String str) {
		if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str.trim())) {
			return true;
		}
		return false;
	}
}
