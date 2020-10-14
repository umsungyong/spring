package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class DBConfig {
	
	@Autowired
	ApplicationContext ac;
	@Bean
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@Autowired
	public SqlSessionFactory getSqlSessionFactory(DataSource ds) throws Exception {
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		ssfb.setDataSource(ds);
		ssfb.setTypeAliasesPackage("com.example.demo.vo");
		ssfb.setMapperLocations(ac.getResources("classpath:mapper/*.xml"));
		return ssfb.getObject();
	}
	
}
