package cn.eden.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cn.eden.springboot.dubbo.DemoConsumerService;

@SpringBootApplication
public class ConsumerApplication
{
    public static void main(String[] args) {
        // �����������
        // ����Ƕ��ʽ�� Tomcat ����ʼ�� Spring ��������� Spring ���
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        DemoConsumerService service = run.getBean(DemoConsumerService.class);
        service.printHelloWorld();
    }
}
