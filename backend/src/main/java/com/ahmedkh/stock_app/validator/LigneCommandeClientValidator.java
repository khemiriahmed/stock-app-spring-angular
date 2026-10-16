package com.ahmedkh.stock_app.validator;

import com.ahmedkh.stock_app.dto.LigneCommandeClientDto;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {

    public static List<String> validate(LigneCommandeClientDto dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("Veuillez renseigner la ligne de commande client");
            return errors;
        }
        if (dto.getArticle() == null || dto.getArticle().getId() == null) {
            errors.add("Veuillez renseigner l'article");
        }
        if (dto.getQuantite() == null || dto.getQuantite().compareTo(BigDecimal.ZERO) <= 0) {
            errors.add("Veuillez renseigner la quantite valide");
        }
        if (dto.getPrixUnitaire() == null || dto.getPrixUnitaire().compareTo(BigDecimal.ZERO) <= 0) {
            errors.add("Veuillez renseigner le prix unitaire");
        }
        return errors;
    }

}