package com.ashish.services;

import com.ashish.converters.ProductFormToProduct;
import com.ashish.domain.Product;
import com.ashish.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.commands.ProductForm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        products.addAll((Collection<? extends Product>) productRepository.findAll());
        return products;
    }

    @Override
    public Product getById(Long id) {
    	Product product = productRepository.findOne(id);
    	if(product != null) {
    		return product;
    	} else {
    		return null;
    	}
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);

    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
       
    	Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));
        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
    }
}
