package com.snort.intelli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.snort.intelli.entities.ProductList;

@Component
public class ProductListRunner implements ApplicationRunner {

	@Autowired
	ProductList productList;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("Product List:"+productList);
		
		productList.getProductList().forEach(item->System.out.println(item));
	}

}
