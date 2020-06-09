package test.com.createbean;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Product {
	
	private static final Logger logger = LoggerFactory.getLogger(Product.class);
	
	// 생성자 두개 생성 
	
	public Product() {
		logger.info("Product() ... on! ");
	}
	
	public Product(ArrayList<String> list) {
		logger.info("Product(ArrayList) ... on :: {} ! ", list);
	}
}
