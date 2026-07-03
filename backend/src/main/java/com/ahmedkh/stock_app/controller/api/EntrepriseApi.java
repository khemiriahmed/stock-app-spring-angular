package com.ahmedkh.stock_app.controller.api;

import com.ahmedkh.stock_app.dto.EntrepriseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ahmedkh.stock_app.utils.Constants.APP_ROOT;
import static com.ahmedkh.stock_app.utils.Constants.ENTREPRISE_ENDPOINT;

@Tag(name = "Entreprise", description = APP_ROOT)
public interface EntrepriseApi {

    @PostMapping(ENTREPRISE_ENDPOINT + "/create")
    EntrepriseDto save(@RequestBody EntrepriseDto dto);

    @GetMapping(ENTREPRISE_ENDPOINT + "/{idEntreprise}")
    EntrepriseDto findById(@PathVariable("idEntreprise") Integer id);

    @GetMapping(ENTREPRISE_ENDPOINT + "/all")
    List<EntrepriseDto> findAll();

    @DeleteMapping(ENTREPRISE_ENDPOINT + "/delete/{idEntreprise}")
    void delete(@PathVariable("idEntreprise") Integer id);

}
