package com.example.demo.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PapagoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PapagoController {
	
	 @Resource
	 private PapagoService ps;
	 
	 @GetMapping("/papago/{text}")
	 public @ResponseBody String doTransper(@PathVariable String text) {
		 Map<String,Object> rMap  = ps.transperKoToEn(text);
		 Map<String,Object> rMap1 = (Map<String,Object>)rMap.get("message");
		 Map<String,Object> rMap2 = (Map<String,Object>)rMap1.get("result");
		 return (String) rMap2.get("translatedText");
		 
	 }
}
