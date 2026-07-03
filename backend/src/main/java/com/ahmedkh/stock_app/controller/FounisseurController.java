package com.ahmedkh.stock_app.controller;

import com.ahmedkh.stock_app.controller.api.FournisseurApi;
import com.ahmedkh.stock_app.dto.FournisseurDto;
import com.ahmedkh.stock_app.services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FounisseurController implements FournisseurApi {
    FournisseurService fournisseurService;

    @Autowired
    public FounisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }




    @Override
    public FournisseurDto save(FournisseurDto dto) {
        return fournisseurService.save(dto);
    }

    @Override
    public FournisseurDto findById(Integer id) {
        return fournisseurService.findById(id);
    }

    @Override
    public List<FournisseurDto> findAll() {
        return fournisseurService.findAll();
    }

    @Override
    public void delete(Integer id) {
        fournisseurService.delete(id);
    }
}
