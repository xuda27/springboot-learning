package cn.eden.springboot.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cn.eden.springboot.controller.HelloWordController;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 * 
 * @author eden
 *
 */
public class HelloWorldControllerTest {
	@Test
    public void testSayHello() {
        assertEquals("Hello, World",new HelloWordController().hello());
    }
}
