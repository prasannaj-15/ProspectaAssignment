package com.prospecta.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.app.Entity.Categories;
import com.prospecta.app.Service.ServiceLayer;

@RestController
public class HomeController {

	@Autowired
	private ServiceLayer serviceLayer;
	
//	@GetMapping("/")
//	public ResponseEntity<Categories> fetchApi(@PathVariable("category") String category) {
//		return new ResponseEntity<>(serviceLayer.getData(category),HttpStatus.OK);
//	}
	
//	@GetMapping("/")
//	public String fetchApi() {
//		return serviceLayer.getData1();
//	}

	@GetMapping("/")
	public ResponseEntity<List<Categories>> fetchApi() {
		
		List<Categories> catList = serviceLayer.getData();
		
		return new ResponseEntity<>(catList,HttpStatus.OK);
	}
	
}
