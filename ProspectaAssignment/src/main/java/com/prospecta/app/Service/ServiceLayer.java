package com.prospecta.app.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prospecta.app.Entity.Categories;

@Service
public class ServiceLayer {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Categories> getData() {
		
		List catList = new ArrayList<>();
		
		Categories[] catArr =  restTemplate.getForObject("https://api.publicapis.org/random", Categories[].class); 
	
		catList = Arrays.asList(catArr);
		
		return catList;
		
	}
	
	public String getData1() {
		
		//List catList = new ArrayList()<>();
		
		return restTemplate.getForObject("https://api.publicapis.org/entries", String.class); 
	
		
	}
	
	public List<Categories> getAllEntryData() {
		
		List<Categories> catList = new ArrayList<>();
		
		catList.add(restTemplate.getForObject("https://api.publicapis.org/entries", Categories.class)); 
	
		return catList;
	}
//	public String getData() {
//		return restTemplate.getForObject("https://api.publicapis.org/entries", String.class); 
//	}
}
