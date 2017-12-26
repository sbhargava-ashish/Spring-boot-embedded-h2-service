package com.ashish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ashish.domain.Product;



@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
}
