package com.example.doan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.doan.model.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
