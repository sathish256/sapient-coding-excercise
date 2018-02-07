package com.globalmart.core.product.catalogue.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globalmart.core.product.catalogue.manager.CatalogueManager;
import com.globalmart.core.product.catalogue.model.Product;
import com.globalmart.core.product.catalogue.model.ServiceResponse;

@RestController
@RequestMapping("/api/v1/catalogue")
public class CatalogueController {
	
	@Autowired
	@Qualifier("catalogueManager")
	CatalogueManager catalogueManager;
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Product>> getProducts(@RequestParam(value="type") String type){
		List<Product> products = catalogueManager.getProducts(type);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ServiceResponse> addProduct(@RequestBody Product product){
		ServiceResponse serviceResponse = catalogueManager.addProduct(product);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id){
		Product product = catalogueManager.getProduct(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	
	@PutMapping
	public ResponseEntity<ServiceResponse> updateProduct(@RequestBody Product product){
		ServiceResponse serviceResponse = catalogueManager.updateProduct(product);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ServiceResponse> deleteProduct(@PathVariable Long id){
		ServiceResponse serviceResponse = catalogueManager.deleteProduct(id);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}
	

}
