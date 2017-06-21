package com.juniorro.restfulproductmanager.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.juniorro.restfulproductmanager.model.Product;

@Service
public interface ProductService {

	Product saveProduct(Product product);

	List<Product> allProducts();

	Product oneProduct(long id);

	void deleteProduct(long id);
	
	List<Product> findProducts(String keyword);
	
	

	/*Page<Product> allProducts(PageRequest pageRequest);*/

}
