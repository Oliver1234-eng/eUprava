package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.UgovorOPrenosuZemljistaDTO;
import com.katastar.aplikacijazakatastar.model.UgovorOPrenosuZemljista;
import com.katastar.aplikacijazakatastar.service.UgovorOPrenosuZemljistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/notar/ugovori")
public class UgovorOPrenosuZemljistaController {

    @Autowired
    private UgovorOPrenosuZemljistaService ugovorOPrenosuZemljistaService;

    @GetMapping
    public ResponseEntity<List<UgovorOPrenosuZemljistaDTO>> getUgovori() {

        List<UgovorOPrenosuZemljista> ugovori = ugovorOPrenosuZemljistaService.findAll();

        List<UgovorOPrenosuZemljistaDTO> ugovoriDTO = new ArrayList<>();
        for (UgovorOPrenosuZemljista u : ugovori) {
            ugovoriDTO.add(new UgovorOPrenosuZemljistaDTO(u));
        }

        return new ResponseEntity<>(ugovoriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UgovorOPrenosuZemljistaDTO> getUgovor(@PathVariable Integer id) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(id);

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new UgovorOPrenosuZemljistaDTO(ugovorOPrenosuZemljista), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<UgovorOPrenosuZemljistaDTO> saveUgovor(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {


        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = new UgovorOPrenosuZemljista();
        ugovorOPrenosuZemljista.setNotar(ugovorOPrenosuZemljistaDTO.getNotar());
        ugovorOPrenosuZemljista.setVrstaUgovora(ugovorOPrenosuZemljistaDTO.getVrstaUgovora());
        ugovorOPrenosuZemljista.setDatumOvere(ugovorOPrenosuZemljistaDTO.getDatumOvere());
        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.getOveren());
        ugovorOPrenosuZemljista.setBrojParcele(ugovorOPrenosuZemljistaDTO.getBrojParcele());
        ugovorOPrenosuZemljista.setStariVlasnik(ugovorOPrenosuZemljistaDTO.getStariVlasnik());
        ugovorOPrenosuZemljista.setNoviVlasnik(ugovorOPrenosuZemljistaDTO.getNoviVlasnik());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(new UgovorOPrenosuZemljistaDTO(ugovorOPrenosuZemljista), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<UgovorOPrenosuZemljistaDTO> updateUgovor(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(ugovorOPrenosuZemljistaDTO.getId());

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ugovorOPrenosuZemljista.setNotar(ugovorOPrenosuZemljistaDTO.getNotar());
        ugovorOPrenosuZemljista.setVrstaUgovora(ugovorOPrenosuZemljistaDTO.getVrstaUgovora());
        ugovorOPrenosuZemljista.setDatumOvere(ugovorOPrenosuZemljistaDTO.getDatumOvere());
        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.getOveren());
        ugovorOPrenosuZemljista.setBrojParcele(ugovorOPrenosuZemljistaDTO.getBrojParcele());
        ugovorOPrenosuZemljista.setStariVlasnik(ugovorOPrenosuZemljistaDTO.getStariVlasnik());
        ugovorOPrenosuZemljista.setNoviVlasnik(ugovorOPrenosuZemljistaDTO.getNoviVlasnik());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(new UgovorOPrenosuZemljistaDTO(ugovorOPrenosuZemljista), HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json", value = "/overiUgovor")
    public ResponseEntity<UgovorOPrenosuZemljistaDTO> updateUgovorPotvrda(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(ugovorOPrenosuZemljistaDTO.getId());

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.getOveren());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(new UgovorOPrenosuZemljistaDTO(ugovorOPrenosuZemljista), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteTermin(@PathVariable Integer id) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(id);

        if (ugovorOPrenosuZemljista != null) {
            ugovorOPrenosuZemljistaService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
