package com.ahmedkh.stock_app.repository;
import com.ahmedkh.stock_app.model.Article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer,Article> {
    Article findByCodeArticle(String code);
}
