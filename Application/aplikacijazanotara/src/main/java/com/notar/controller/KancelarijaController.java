package com.notar.controller;

import com.notar.model.dto.KancelarijaDTO;
import com.notar.model.entity.Kancelarija;
import com.notar.service.functionality.KancelarijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/kancelarija/")
public class KancelarijaController {
    @Autowired
    private KancelarijaService kancelarijaService;

    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Kancelarija> saveCommunity(@RequestBody KancelarijaDTO kancelarijaDTO) {
        Kancelarija newKancelarija = kancelarijaService.createKancelarija(kancelarijaDTO);
        return new ResponseEntity<Kancelarija>(newKancelarija, HttpStatus.CREATED);
    }
}
