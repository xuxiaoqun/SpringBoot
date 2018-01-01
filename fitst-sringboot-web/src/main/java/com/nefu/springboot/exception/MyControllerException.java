package com.nefu.springboot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 全局捕获异常，所有用@RequestMapping修饰的方法都会被捕获
 * @author   xzc
 * @since
 */
@ControllerAdvice
public class MyControllerException {

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> errorHandler(Exception e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -1);
		map.put("msg", e.getMessage());
		return map;
	}
	
	@ResponseBody
	@ExceptionHandler(value = MyException.class)
	public Map<String, Object> errorHandler(MyException e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", e.getCode());
		map.put("msg", e.getMsg());
		return map;
	}
}
