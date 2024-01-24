package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 1);
		System.out.println(Shape.getPerimeter(rect));
		SpringApplication.run(DemoApplication.class, args);
	}

}
