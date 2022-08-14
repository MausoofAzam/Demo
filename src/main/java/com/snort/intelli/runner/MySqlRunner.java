package com.snort.intelli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.snort.intelli.entities.MySqlDriver;

@Component
public class MySqlRunner implements ApplicationRunner {
	@Autowired
	MySqlDriver mysqldriver;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MySql Driver :"+mysqldriver);
		System.out.println("MySql Driver :"+mysqldriver.getUrl());
		System.out.println("MySql Driver :"+mysqldriver.getUsername());
		System.out.println("MySql Driver :"+mysqldriver.getPassword());
		
	}

}
