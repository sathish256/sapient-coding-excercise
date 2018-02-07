package com.globalmart.core.product.catalogue.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalmart.core.product.catalogue.exception.ProductNotFoundException;
import com.globalmart.core.product.catalogue.model.Product;
import com.globalmart.core.product.catalogue.model.ServiceResponse;
import com.globalmart.core.product.catalogue.repository.CatalogueRepository;

@Service("catalogueManager")
public class CatalogueManagerImpl implements CatalogueManager{
	
	@Autowired
	CatalogueRepository catalogueRepository;
	

	@Override
	public List<Product> getProducts(String type) {
		List<Product> products;
		if (type != null){
			products  = catalogueRepository.findByProductType(type);
		}else{
			products = catalogueRepository.findAll();
		}
		
		if(products == null || products.isEmpty())
			throw new ProductNotFoundException("No products found!");
		
		return products;
	}

	@Override
	public ServiceResponse addProduct(Product product) {
		catalogueRepository.save(product);
		return new ServiceResponse("Successful","Product added successfully");
	}

	@Override
	public Product getProduct(Long id) {
		Product product  = catalogueRepository.findByProductId(id);
		if(product == null)
			throw new ProductNotFoundException("Invalid product id!");

		return product;
	}

	@Override
	public ServiceResponse updateProduct(Product product) {
		catalogueRepository.save(product);
		return new ServiceResponse("Successful","Product updated successfully");
	}

	@Override
	public ServiceResponse deleteProduct(Long id) {
		Product product  = catalogueRepository.findByProductId(id);
		if(product != null)
			catalogueRepository.delete(product);
		else
			throw new ProductNotFoundException("Invalid product id!");
		return new ServiceResponse("Successful","Product deleted successfully");
	}

}
