package com.snort.intelli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.snort.intelli.entities.OracleDbConfig;

@Component
public class OracleRunner implements ApplicationRunner {

	@Autowired //autowired creates dependency injection
	OracleDbConfig oracleDbconfig;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Oracle Db Configuration:" + oracleDbconfig);
	}

}
