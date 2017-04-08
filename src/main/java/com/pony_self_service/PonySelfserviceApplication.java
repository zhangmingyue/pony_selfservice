package com.pony_self_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pony_self_service.dao")
public class PonySelfserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PonySelfserviceApplication.class, args);
	}
}
