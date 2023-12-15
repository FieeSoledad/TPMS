package com.huadi.project.tpms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huadi.project.tpms.dao")
public class TpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpmsApplication.class, args);
	}

}
