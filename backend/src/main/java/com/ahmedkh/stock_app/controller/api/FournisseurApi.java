package com.ahmedkh.stock_app.controller.api;

import com.ahmedkh.stock_app.dto.FournisseurDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ahmedkh.stock_app.utils.Constants.APP_ROOT;
import static com.ahmedkh.stock_app.utils.Constants.FOURNISSEUR_ENDPOINT;

@Tag(name = "Fournisseur", description = APP_ROOT)
public interface FournisseurApi {

    @PostMapping(FOURNISSEUR_ENDPOINT + "/create")
    FournisseurDto save(@RequestBody FournisseurDto dto);

    @GetMapping(FOURNISSEUR_ENDPOINT + "/{idFournisseur}")
    FournisseurDto findById(@PathVariable("idFournisseur") Integer id);

    @GetMapping(FOURNISSEUR_ENDPOINT + "/all")
    List<FournisseurDto> findAll();

    @DeleteMapping(FOURNISSEUR_ENDPOINT + "/delete/{idFournisseur}")
    void delete(@PathVariable("idFournisseur") Integer id);
}
