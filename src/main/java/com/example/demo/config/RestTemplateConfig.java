package com.example.demo.config;

import java.nio.charset.Charset;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
		
	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplateBuilder rtBuilder = new RestTemplateBuilder();
		StringHttpMessageConverter shmc = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		rtBuilder.additionalMessageConverters(shmc);
		return rtBuilder.build();
	}
}
