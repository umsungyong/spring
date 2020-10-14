package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserInfoVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDAO userDAO;
	@Override
	public UserInfoVO selectUserForLogin(UserInfoVO user) {
		List<UserInfoVO> userList = userDAO.selectUserInfo(user);
		if(!userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}

}
