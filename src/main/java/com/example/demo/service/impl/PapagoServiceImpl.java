package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.PapagoService;
@Service
public class PapagoServiceImpl implements PapagoService {

	@Resource
	private RestTemplate rt;

	@Override
	public Map<String, Object> transperKoToEn(String text) {
		String url = "https://openapi.naver.com/v1/papago/n2mt";
		HttpHeaders hh = new HttpHeaders();
		hh.add("X-Naver-Client-Id", "HlFeeJU_4q3MCznOIWey");
		hh.add("X-Naver-Client-Secret", "RgNDimC5Qq");

		Map<String, String> param = new HashMap<>();
		param.put("source", "ko");
		param.put("target", "en");
		param.put("text", text);
		HttpEntity<Map<String, String>> he = new HttpEntity<>(param, hh);
		return rt.exchange(url, HttpMethod.POST, he, Map.class).getBody();
	}

}
