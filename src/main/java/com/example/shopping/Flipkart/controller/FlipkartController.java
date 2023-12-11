 package com.example.shopping.Flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.Flipkart.model.Flipkart;
import com.example.shopping.Flipkart.service.FlipkartService;

@RestController
public class FlipkartController {
	
	@Autowired
	FlipkartService flipkartService;
	
	@GetMapping("/products")
	private List<Flipkart> getAllProduct(){
		return flipkartService.getAllProduct();
	}
	@GetMapping("/product/{productId}")
		private Flipkart getFlipkartProducts(@PathVariable("productId") int productId) 
	{
		return flipkartService.getProductById(productId);	
	}
	@DeleteMapping("/product/{productId}")
	private void deleteProduct(@PathVariable("productId")int productId)
	{
		flipkartService.delete(productId);
	}
	@PostMapping("/products")
	private List<Flipkart> saveFlipkart(@RequestBody List<Flipkart> flipkartProducts)
	{
		List<Flipkart> savedProducts=flipkartService.saveOrUpdateAll(flipkartProducts);
		return savedProducts;	
	}
	@PostMapping("/product")
	private int saveProduct(@RequestBody Flipkart products) {
	flipkartService.saveOrUpdate(products);	
	return products.getOrderId();
	}
	@PutMapping("/product/{productId}")
	private Flipkart updateSingle(@RequestBody Flipkart products)
	{
		flipkartService.updateBySingle(products);
		return products;
	}
	
}
