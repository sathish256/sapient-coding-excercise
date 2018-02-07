package com.globalmart.core.product.catalogue.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalmart.core.product.catalogue.model.Product;

@Transactional
public interface CatalogueRepository extends JpaRepository<Product, String> {

	List<Product> findByProductType(String type);

	Product findByProductId(Long id);

}