package cn.eden.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.eden.springboot.producer.impl.AMQPProducerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {
	@Autowired
	private AMQPProducerServiceImpl producer;
	
	@Test
    public void send() throws Exception {
		producer.sendMessage("第一份测试消息发送");
    }
}
