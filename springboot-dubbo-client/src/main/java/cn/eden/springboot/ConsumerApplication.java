package cn.eden.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cn.eden.springboot.dubbo.DemoConsumerService;

@SpringBootApplication
public class ConsumerApplication
{
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        DemoConsumerService service = run.getBean(DemoConsumerService.class);
        service.printHelloWorld();
    }
}
