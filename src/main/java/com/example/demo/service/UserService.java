package com.example.demo.service;

import com.example.demo.vo.UserInfoVO;

public interface UserService {
	
	public UserInfoVO selectUserForLogin(UserInfoVO user);
}
