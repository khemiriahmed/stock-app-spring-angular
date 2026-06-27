package com.ahmedkh.stock_app.dto;

import com.ahmedkh.stock_app.model.Article;
import com.ahmedkh.stock_app.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@Builder

public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    private ArticleDto article;

}

