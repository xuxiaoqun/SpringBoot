package com.nefu.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nefu.springboot.exception.MyException;

@RestController
public class HelloWorldController {

	private final static Logger log = LoggerFactory.getLogger(HelloWorldController.class);

	@Value("${msg}")
	private String msg;

	@RequestMapping("/")
	public String hello() {
		log.info("成功打印日志");
		return this.msg;
	}
	
	@RequestMapping("/exception")
	public String testException(){
		throw new MyException("0", "用户名或密码错误");
	}
}
