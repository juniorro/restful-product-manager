package com.juniorro.restfulproductmanager.service.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.juniorro.restfulproductmanager.model.Product;
import com.juniorro.restfulproductmanager.repo.ProductRepo;
import com.juniorro.restfulproductmanager.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public List<Product> allProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product oneProduct(long id) {
		return productRepo.findOne(id);
	}

	@Override
	public void deleteProduct(long id) {
		productRepo.delete(id);
	}

	@Override
	public List<Product> findProducts(String keyword) {
		return productRepo.findProduct(keyword);
	}
	
	

}
