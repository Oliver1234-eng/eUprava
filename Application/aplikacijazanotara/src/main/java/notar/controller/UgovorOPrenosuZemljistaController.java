package notar.controller;


import notar.model.dto.UgovorOPrenosuZemljistaDTO;
import notar.model.entity.UgovorOPrenosuZemljista;
import notar.service.functionality.UgovorOPrenosuZemljistaService;
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
    public ResponseEntity<List<UgovorOPrenosuZemljista>> getUgovori() {

        List<UgovorOPrenosuZemljista> ugovori = ugovorOPrenosuZemljistaService.findAll();

        List<UgovorOPrenosuZemljista> ugovoriDTO = new ArrayList<>();
        for (UgovorOPrenosuZemljista u : ugovori) {

            ugovoriDTO.add(u);
        }

        return new ResponseEntity<>(ugovoriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UgovorOPrenosuZemljista> getUgovor(@PathVariable Long id) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(id);

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(ugovorOPrenosuZemljista, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<UgovorOPrenosuZemljista> saveUgovor(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = new UgovorOPrenosuZemljista();
        ugovorOPrenosuZemljista.setNotar(ugovorOPrenosuZemljistaDTO.getNotar());
        ugovorOPrenosuZemljista.setVrstaUgovora(ugovorOPrenosuZemljistaDTO.getVrstaUgovora());
        ugovorOPrenosuZemljista.setDatumOvereUgovora(ugovorOPrenosuZemljistaDTO.getDatumOvere());
        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.isOveren());
        ugovorOPrenosuZemljista.setBrojParcele(ugovorOPrenosuZemljistaDTO.getBrojParcele());
        ugovorOPrenosuZemljista.setStariVlasnik(ugovorOPrenosuZemljistaDTO.getStariVlasnik());
        ugovorOPrenosuZemljista.setNoviVlasnik(ugovorOPrenosuZemljistaDTO.getNoviVlasnik());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(ugovorOPrenosuZemljista, HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<UgovorOPrenosuZemljista> updateUgovor(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(ugovorOPrenosuZemljistaDTO.getId());

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ugovorOPrenosuZemljista.setNotar(ugovorOPrenosuZemljistaDTO.getNotar());
        ugovorOPrenosuZemljista.setVrstaUgovora(ugovorOPrenosuZemljistaDTO.getVrstaUgovora());
        ugovorOPrenosuZemljista.setDatumOvereUgovora(ugovorOPrenosuZemljistaDTO.getDatumOvere());
        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.isOveren());
        ugovorOPrenosuZemljista.setBrojParcele(ugovorOPrenosuZemljistaDTO.getBrojParcele());
        ugovorOPrenosuZemljista.setStariVlasnik(ugovorOPrenosuZemljistaDTO.getStariVlasnik());
        ugovorOPrenosuZemljista.setNoviVlasnik(ugovorOPrenosuZemljistaDTO.getNoviVlasnik());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(ugovorOPrenosuZemljista, HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json", value = "/overiUgovor")
    public ResponseEntity<UgovorOPrenosuZemljista> updateUgovorPotvrda(@RequestBody UgovorOPrenosuZemljistaDTO ugovorOPrenosuZemljistaDTO) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(ugovorOPrenosuZemljistaDTO.getId());

        if (ugovorOPrenosuZemljista == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ugovorOPrenosuZemljista.setOveren(ugovorOPrenosuZemljistaDTO.isOveren());

        ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.save(ugovorOPrenosuZemljista);
        return new ResponseEntity<>(ugovorOPrenosuZemljista, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteTermin(@PathVariable Long id) {

        UgovorOPrenosuZemljista ugovorOPrenosuZemljista = ugovorOPrenosuZemljistaService.findOne(id);

        if (ugovorOPrenosuZemljista != null) {
            ugovorOPrenosuZemljistaService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
