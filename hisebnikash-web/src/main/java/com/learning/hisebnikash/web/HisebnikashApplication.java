package com.learning.hisebnikash.web;

import com.learning.hisebnikash.data.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@ComponentScan("com.learning.hisebnikash.web")
@Import(DataSourceConfig.class)
public class HisebnikashApplication {

	private static final Logger log = LoggerFactory.getLogger(HisebnikashApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HisebnikashApplication.class, args);
	}
}
