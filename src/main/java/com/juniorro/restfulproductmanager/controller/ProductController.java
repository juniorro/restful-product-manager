package com.juniorro.restfulproductmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.juniorro.restfulproductmanager.model.Product;
import com.juniorro.restfulproductmanager.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public List<Product> searchMany(String keyword) {
		return productService.findProducts("%" + keyword + "%");
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> productList() {
		return productService.allProducts();
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product searchOne(@PathVariable("id") long id) {
		return productService.oneProduct(id);
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product, @PathVariable("id") long id) {
		product.setId(id);
		return productService.saveProduct(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") long id) {
		productService.deleteProduct(id);
	}

}
