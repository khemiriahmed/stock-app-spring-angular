package com.ahmedkh.stock_app.dto;

import com.ahmedkh.stock_app.model.Article;
import com.ahmedkh.stock_app.model.CommandeClient;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;


}
