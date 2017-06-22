package com.juniorro.restfulproductmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.juniorro.restfulproductmanager.service.ProductService;

@SpringBootApplication
public class RestfulProductManagerApplication implements CommandLineRunner {
	
	@Autowired
	ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(RestfulProductManagerApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Latitute", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		productService.saveProduct(new Product("Dell Inspiron", "Dell Inspiron 15", 1200.56, 58));
		
		List<Product> products = productService.allProducts();
		products.forEach(product->System.out.println(product.getName()));*/
		
	}
}
