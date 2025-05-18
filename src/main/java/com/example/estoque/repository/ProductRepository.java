package com.example.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estoque.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
