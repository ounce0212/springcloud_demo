package com.example.springmvc_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.springmvc_mybatis.dao")
public class SpringmvcMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcMybatisApplication.class, args);
	}
}
