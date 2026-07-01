package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.LigneCommandeClient;
import com.ahmedkh.stock_app.model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LigneCommmandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur , Integer> {

    List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

    List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);
}
