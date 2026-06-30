package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur , Integer> {
}
