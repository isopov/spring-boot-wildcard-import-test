package com.sopovs.moradanen;

import org.springframework.boot.SpringApplication;

public class MyApplication {
	public static void main(String[] args) throws Exception {
		//works
		new SpringApplication("classpath:com/sopovs/moradanen/sample-beans.xml").run(args);
		//doesn't work
		new SpringApplication("classpath:com/sopovs/moradanen/sample-*.xml").run(args);
    }
}
