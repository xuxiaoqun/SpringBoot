package com.nefu.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstWebController {

	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", "xzc");
		data.put("age", "20");
		data.put("sex", "m");
		dataList.add(data);
		map.put("dataList", dataList);
		return "hello";
	}

	@RequestMapping("/animals")
	public String animals(ModelMap map) {
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "老鼠");
		map1.put("price", 10);
		dataList.add(map1);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "大象");
		map2.put("price", 100);
		dataList.add(map2);
		map.put("dataList", dataList);
		return "hello";
	}
	
	@RequestMapping("/fruit")
	public String fruit(ModelMap map){
		List<String> list = new ArrayList<String>();
		/*list.add("苹果");
		list.add("香蕉");
		list.add("橘子");*/
		map.put("fruits", list);
		return "hello";
	}
}
