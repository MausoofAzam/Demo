package com.snort.intelli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.snort.intelli.entities.DataTypes;

@Component
public class DataTypeRunner implements ApplicationRunner {
	@Autowired
	private DataTypes dataTypes;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("----------------------------------------");
		System.out.println("Data Types: "+dataTypes);
	}

}
