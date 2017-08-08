package cn.eden.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot 入门学习
 * 
 * @author eden
 *
 */
@RestController
public class HelloWordController {
	@RequestMapping("/")
	public String hello() {
		return "Hello, World";
	}
}
