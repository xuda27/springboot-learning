package cn.eden.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.eden.springboot.properties.HomeProperties;

/**
 * springboot启动类
 * @author eden
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private HomeProperties homeProperties;

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n" + homeProperties.toString());
        System.out.println();
    }
}