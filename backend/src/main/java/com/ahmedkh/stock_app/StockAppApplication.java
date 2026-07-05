package com.ahmedkh.stock_app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@Configurable
public class StockAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockAppApplication.class, args);
	}

}
