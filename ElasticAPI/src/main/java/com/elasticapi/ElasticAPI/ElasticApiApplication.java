package com.elasticapi.ElasticAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ElasticApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticApiApplication.class, args);
	}

}
