package com.example.demo.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("userVO")
public class UserInfoVO {
	
	private int uiNum;
	private String uiId;
	private String uiPwd;
	
}
