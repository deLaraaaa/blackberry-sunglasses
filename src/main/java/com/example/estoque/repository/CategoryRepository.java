package com.example.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estoque.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
