package com.ahmedkh.stock_app.dto;

import com.ahmedkh.stock_app.model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data

public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireht;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitairettc;

    private String photo;

    private CategoryDto category;
}
