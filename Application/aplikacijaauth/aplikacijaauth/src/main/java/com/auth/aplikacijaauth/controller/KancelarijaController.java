package com.auth.aplikacijaauth.controller;

import com.auth.aplikacijaauth.dto.KancelarijaDTO;
import com.auth.aplikacijaauth.model.Kancelarija;
import com.auth.aplikacijaauth.service.KancelarijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/kancelarije")
public class KancelarijaController {

    @Autowired
    private KancelarijaService kancelarijaService;

    @PreAuthorize("hasRole('NOTAR')")
    @GetMapping
    public ResponseEntity<List<KancelarijaDTO>> getKancelarije() {

        List<Kancelarija> kancelarije = kancelarijaService.findAll();

        List<KancelarijaDTO> kancelarijeDTO = new ArrayList<>();
        for (Kancelarija k : kancelarije) {
            kancelarijeDTO.add(new KancelarijaDTO(k));
        }

        return new ResponseEntity<>(kancelarijeDTO, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('NOTAR')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<KancelarijaDTO> getKancelarija(@PathVariable Integer id) {

        Kancelarija kancelarija = kancelarijaService.findOne(id);

        if (kancelarija == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new KancelarijaDTO(kancelarija), HttpStatus.OK);
    }
}