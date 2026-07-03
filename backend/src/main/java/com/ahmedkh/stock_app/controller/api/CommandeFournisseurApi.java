package com.ahmedkh.stock_app.controller.api;

import com.ahmedkh.stock_app.dto.CommandeFournisseurDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ahmedkh.stock_app.utils.Constants.*;

@Tag(name = "Commande Fournisseur", description = APP_ROOT)
public interface CommandeFournisseurApi {

    @PostMapping(CREATE_COMMANDE_FOURNISSEUR_ENDPOINT)
    CommandeFournisseurDto save(@RequestBody CommandeFournisseurDto dto);

    @GetMapping(FIND_COMMANDE_FOURNISSEUR_BY_ID_ENDPOINT)
    CommandeFournisseurDto findById(@PathVariable("idCommandeFournisseur") Integer id);

    @GetMapping(FIND_COMMANDE_FOURNISSEUR_BY_CODE_ENDPOINT)
    CommandeFournisseurDto findByCode(@PathVariable("codeCommandeFournisseur") String code);

    @GetMapping(FIND_ALL_COMMANDE_FOURNISSEUR_ENDPOINT)
    List<CommandeFournisseurDto> findAll();

    @DeleteMapping(DELETE_COMMANDE_FOURNISSEUR_ENDPOINT)
    void delete(@PathVariable("idCommandeFournisseur") Integer id);
}
