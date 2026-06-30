package com.ahmedkh.stock_app.repository;
import com.ahmedkh.stock_app.model.Article;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article , Integer> {
    Optional<Article> findArticleByCodeArticle(String code);
    List<Article> findAllByCategoryId(Integer idCategory);
}
