package com.globalmart.core.product.catalogue.manager;

import java.util.List;

import com.globalmart.core.product.catalogue.model.Product;
import com.globalmart.core.product.catalogue.model.ServiceResponse;

public interface CatalogueManager {

	List<Product> getProducts(String type);

	ServiceResponse addProduct(Product product);

	Product getProduct(Long id);

	ServiceResponse updateProduct(Product product);

	ServiceResponse deleteProduct(Long id);

}
