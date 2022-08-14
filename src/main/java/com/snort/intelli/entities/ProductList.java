package com.snort.intelli.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductList {
	
	@Value("${product.list}")
	private List<String> productList;

	public ProductList() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductList [productList=" + productList + "]";
	}
	
}
	