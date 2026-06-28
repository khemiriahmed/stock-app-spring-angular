package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer, Ventes> {
}
