package com.ahmedkh.stock_app.services;

import com.ahmedkh.stock_app.dto.ChangerMotDePasseUtilisateurDto;
import com.ahmedkh.stock_app.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {

    UtilisateurDto save(UtilisateurDto dto);

    UtilisateurDto findById(Integer id);

    List<UtilisateurDto> findAll();

    void delete(Integer id);

    UtilisateurDto findByEmail(String email);

    UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);


}
