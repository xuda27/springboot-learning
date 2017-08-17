package cn.eden.springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接受者
 * @author Eden
 *
 */
@Component
public class AMQPConsumer {
	
	@RabbitListener(queues = "queue")
	@RabbitHandler
	public void processMessage(String content) {
		System.out.println("Receiver : " + content);
    }

}
