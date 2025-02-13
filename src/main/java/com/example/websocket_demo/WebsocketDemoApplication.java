package com.example.websocket_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//netstat -ano | findstr :8080
//taskkill /PID 8884 /F

@SpringBootApplication
public class WebsocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketDemoApplication.class, args);
	}

}
