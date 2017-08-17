package cn.eden.springboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * AMQP 配置
 * @author Eden
 *
 */
@Configuration
public class AMQPConfig {

	@Bean
	public Queue queue() {
		return new Queue("queue");
	}
}
