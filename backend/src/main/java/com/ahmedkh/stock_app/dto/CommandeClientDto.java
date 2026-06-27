package com.ahmedkh.stock_app.dto;

import com.ahmedkh.stock_app.model.Client;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;


@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
