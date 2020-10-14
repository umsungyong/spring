package com.example.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDAO;
import com.example.demo.vo.UserInfoVO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Resource
	private SqlSession ss;
	@Override
	public List<UserInfoVO> selectUserInfo(UserInfoVO user) {
		return ss.selectList("com.example.demo.dao.UserInfoMapper.selectUserInfo");
	}

}
