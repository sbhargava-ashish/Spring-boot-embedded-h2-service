package com.ashish.services;

import com.ashish.domain.Product;

import java.util.List;

import com.ashish.commands.ProductForm;


public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
