package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Integer> {
}
