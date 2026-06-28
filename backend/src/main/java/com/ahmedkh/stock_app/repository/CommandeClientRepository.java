package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
