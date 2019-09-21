package com.naver.eng.appserver.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MySqlConfig {
	@Bean
	public JdbcTemplate datasource() throws Exception {
		Properties properties = new Properties();
		
		properties.setProperty("username", "root");
		properties.setProperty("password", "zxcv1223!!");
		properties.setProperty("url", "jdbc:mysql://192.168.99.100:32768/sample_schema");
		
		BasicDataSource createDataSource = BasicDataSourceFactory.createDataSource(properties);
		
		return new JdbcTemplate(createDataSource);
	}
}
