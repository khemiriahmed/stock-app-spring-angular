package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Integer> {
}
