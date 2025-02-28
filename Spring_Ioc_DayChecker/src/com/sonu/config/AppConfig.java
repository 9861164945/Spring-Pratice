package com.sonu.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.sonu.beans")
public class AppConfig
{
//0-param Constructor
	public AppConfig() {
		super();
	}
	
	//pre-defined class As the Spring bean
	@Bean(name="ldate")
	public LocalDate createDate() {
		System.err.println("AppConfig.createDate()");
		return LocalDate.now();
	}
	

}
