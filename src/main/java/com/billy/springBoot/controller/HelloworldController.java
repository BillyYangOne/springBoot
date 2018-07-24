package com.billy.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billy.springBoot.domain.User;

@RestController //所有的结果都是以json的格式返回
public class HelloworldController {

	@RequestMapping("/hello")
	public String index() {
		
		return "hello world!杨";
	}
	
	@RequestMapping("/getUser")
	public User getUser() {
		
		User user = new User();
		user.setUserName("杨乐");
		user.setPassWord("123456");
		return user;
	}
}
