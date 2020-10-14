package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserController {
	
	@Resource
	private UserService userService;
	
	@PostMapping("/user/login")
	public @ResponseBody UserInfoVO doLogin(@RequestBody UserInfoVO user){
		return userService.selectUserForLogin(user);
	}
}
