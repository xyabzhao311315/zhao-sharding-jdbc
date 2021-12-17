package com.zhao.sian.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhao.sian.sharding.mapper")
public class ZhaoShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhaoShardingJdbcApplication.class, args);
	}

}
