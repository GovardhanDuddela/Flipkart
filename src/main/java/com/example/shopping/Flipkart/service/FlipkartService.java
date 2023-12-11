package com.example.shopping.Flipkart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping.Flipkart.model.Flipkart;
import com.example.shopping.Flipkart.repository.FlipkartRepository;

@Service
public class FlipkartService implements FlipkartServiceInterface {
	
	@Autowired
	FlipkartRepository flipkartRepository;

	@Override
	public List<Flipkart> getAllProduct() {
		List<Flipkart> products=new ArrayList<Flipkart>();
		flipkartRepository.findAll().forEach(products1->products.add(products1));
		return products;
	}

	@Override
	public Flipkart getProductById(int id) {
		return flipkartRepository.findById(id).get();
	}

	@Override
	public List<Flipkart> saveOrUpdateAll(List<Flipkart> products) {
		
		return flipkartRepository.saveAll(products);
	}

	@Override
	public void saveOrUpdate(Flipkart products) {
		flipkartRepository.save(products);		
	}

	@Override
	public void delete(int id) {
		flipkartRepository.deleteById(id);	
	}

	@Override
	public void update(Flipkart products, int id) {
		flipkartRepository.save(products);
	}

	@Override
	public void updateBySingle(Flipkart products) {
		flipkartRepository.save(products);			
	}
  }
