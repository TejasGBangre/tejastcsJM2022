package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.entity.Product;
import com.demo.service.ProductService;

public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PutMapping(value = "/addproduct")
	public Product addProduct(@RequestBody Product product) {
			
		return	productService.saveProduct(product);
		}
		
		@GetMapping(value = "/viewproduct")
		public List<Product> viewStudentList(){
			
			return productService.getProductList();
		}
		
		@PutMapping(value = "/updateproduct/{id}")
		public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long id) {
			
			return productService.updateProduct(product, id);
		}
		
		@DeleteMapping(value = "/deleteorder/{id}")
		public String deleteProductById(@PathVariable("id") Long id) {
			
			productService.deleteProductById(id);
			return "Deleted Successfully";
		}

}
