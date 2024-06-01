package com.example.demo3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "FeignClient",
				version = "1.0",
				description = "FeignClient тест"
		)
)
@EnableFeignClients
public class CatsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CatsApplication.class, args);
	}

}
