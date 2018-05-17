package com.JingXIShangCheng.JingXIShangCheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JingXiShangChengApplication {

	public static void main(String[] args) {
		SpringApplication.run(JingXiShangChengApplication.class, args);
	}
	
}
