package cn.eden.springboot.dubbo;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class DemoConsumerService {
    @Reference
    DemoService demoService;

    public void printHelloWorld() {
        System.out.println(demoService.sayHello("World"));
    }
}
