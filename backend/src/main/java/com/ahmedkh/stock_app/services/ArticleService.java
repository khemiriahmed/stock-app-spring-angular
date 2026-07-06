package com.ahmedkh.stock_app.services;

import com.ahmedkh.stock_app.dto.ArticleDto;
import com.ahmedkh.stock_app.dto.LigneCommandeClientDto;
import com.ahmedkh.stock_app.dto.LigneCommandeFournisseurDto;
import com.ahmedkh.stock_app.dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
