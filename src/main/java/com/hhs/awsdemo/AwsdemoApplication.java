package com.hhs.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsdemoApplication {

	public static void main(String[] args) {
		System.out.println("start stop");
		SpringApplication.run(AwsdemoApplication.class, args);
	}

}
