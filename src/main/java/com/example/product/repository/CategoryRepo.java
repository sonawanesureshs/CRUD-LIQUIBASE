package com.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

    List<Category> findAllByName(String name);
}
