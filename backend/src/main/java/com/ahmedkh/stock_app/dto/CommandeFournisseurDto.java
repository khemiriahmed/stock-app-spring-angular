package com.ahmedkh.stock_app.dto;

import com.ahmedkh.stock_app.model.Fournisseur;
import com.ahmedkh.stock_app.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;


@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}
