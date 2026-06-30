package com.ahmedkh.stock_app.repository;

import com.ahmedkh.stock_app.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommandeClientRepository extends JpaRepository<CommandeClient , Integer> {

    Optional<CommandeClient> findCommandeClientByCode(String code);

    List<CommandeClient> findAllByClientId(Integer id);
}
