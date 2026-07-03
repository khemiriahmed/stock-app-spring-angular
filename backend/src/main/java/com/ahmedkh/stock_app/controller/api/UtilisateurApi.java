package com.ahmedkh.stock_app.controller.api;


import com.ahmedkh.stock_app.dto.UtilisateurDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ahmedkh.stock_app.utils.Constants.APP_ROOT;
import static com.ahmedkh.stock_app.utils.Constants.UTILISATEUR_ENDPOINT;

@Tag(name = "Utilisateur", description = APP_ROOT)
public interface UtilisateurApi {


    @PostMapping(UTILISATEUR_ENDPOINT + "/create")
    UtilisateurDto save(@RequestBody UtilisateurDto dto);


    @GetMapping(UTILISATEUR_ENDPOINT + "/{idUtilisateur}")
    UtilisateurDto findById(@PathVariable("idUtilisateur") Integer id);


    @GetMapping(UTILISATEUR_ENDPOINT + "/all")
    List<UtilisateurDto> findAll();


    @DeleteMapping(UTILISATEUR_ENDPOINT + "/delete/{idUtilisateur}")
    void delete(@PathVariable("idUtilisateur") Integer id);
}
