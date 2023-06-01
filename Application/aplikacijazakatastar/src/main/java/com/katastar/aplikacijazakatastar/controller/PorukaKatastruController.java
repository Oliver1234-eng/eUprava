package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.PorukaKatastruDTO;
import com.katastar.aplikacijazakatastar.model.PorukaKatastru;
import com.katastar.aplikacijazakatastar.service.PorukaKatastruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/porukeKatastru")
public class PorukaKatastruController {

    @Autowired
    private PorukaKatastruService porukaKatastruService;

    @GetMapping
    public ResponseEntity<List<PorukaKatastruDTO>> getPorukeKatastru() {

        List<PorukaKatastru> porukeKatastru = porukaKatastruService.findAll();

        List<PorukaKatastruDTO> porukeKatastruDTO = new ArrayList<>();
        for (PorukaKatastru p : porukeKatastru) {
            porukeKatastruDTO.add(new PorukaKatastruDTO(p));
        }

        return new ResponseEntity<>(porukeKatastruDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PorukaKatastruDTO> getPorukaKatastru(@PathVariable Integer id) {

        PorukaKatastru porukaKatastru = porukaKatastruService.findOne(id);

        if (porukaKatastru == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new PorukaKatastruDTO(porukaKatastru), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<PorukaKatastruDTO> savePorukaKatastru(@RequestBody PorukaKatastruDTO porukaKatastruDTO) {

        PorukaKatastru porukaKatastru = new PorukaKatastru();
        porukaKatastru.setDatumPromene(porukaKatastruDTO.getDatumPromene());
        porukaKatastru.setBrojParcele(porukaKatastruDTO.getBrojParcele());
        porukaKatastru.setStariVlasnik(porukaKatastruDTO.getStariVlasnik());
        porukaKatastru.setNoviVlasnik(porukaKatastruDTO.getNoviVlasnik());

        porukaKatastru = porukaKatastruService.save(porukaKatastru);
        return new ResponseEntity<>(new PorukaKatastruDTO(porukaKatastru), HttpStatus.CREATED);
    }
}
