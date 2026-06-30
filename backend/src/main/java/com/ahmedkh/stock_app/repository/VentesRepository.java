package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VentesRepository extends JpaRepository<Ventes , Integer> {
    Optional<Ventes> findVentesByCode(String code);
}
