package com.example.shopping.Flipkart.service;

import java.util.List;

import com.example.shopping.Flipkart.model.Flipkart;

public interface FlipkartServiceInterface {
	public List<Flipkart> getAllProduct();
	public Flipkart getProductById(int id);
	public List<Flipkart> saveOrUpdateAll(List<Flipkart> products);
	public void saveOrUpdate(Flipkart products);
	public void delete(int id);
	public void update(Flipkart products, int id);
	public void updateBySingle(Flipkart products);
	
}
