package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.UserInfoVO;

public interface UserDAO {
	
	public List<UserInfoVO> selectUserInfo(UserInfoVO user);
}
