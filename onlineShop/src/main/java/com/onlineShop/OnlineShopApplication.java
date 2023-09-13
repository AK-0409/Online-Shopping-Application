package com.onlineShop;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {

	public static void main(String[] args) {
//		SpringApplication.run(OnlineShopApplication.class, args);
		SpringApplication app = new SpringApplication(OnlineShopApplication.class);

		app.setDefaultProperties(Collections
		          .singletonMap("server.port","5000"));
		app.run(args);
	}

}
