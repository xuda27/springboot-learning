package cn.eden.springboot.producer.impl;

import java.util.Date;

import org.assertj.core.util.Compatibility.System;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.eden.springboot.producer.AMQPProducerService;

/**
 * 消息生产者
 * @author Eden
 *
 */
@Service
public class AMQPProducerServiceImpl implements AMQPProducerService {
	@Autowired
	private AmqpTemplate amqpTemplate;

	@Override
	public void sendMessage(String msg) {
		this.amqpTemplate.convertAndSend("queue", msg);
	}

}
