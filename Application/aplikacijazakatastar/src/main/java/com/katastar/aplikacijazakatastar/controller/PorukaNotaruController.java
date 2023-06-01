package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.PorukaNotaruDTO;
import com.katastar.aplikacijazakatastar.model.PorukaNotaru;
import com.katastar.aplikacijazakatastar.service.PorukaNotaruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/porukeNotaru")
public class PorukaNotaruController {

    @Autowired
    private PorukaNotaruService porukaNotaruService;

    @GetMapping
    public ResponseEntity<List<PorukaNotaruDTO>> getPorukeNotaru() {

        List<PorukaNotaru> porukeNotaru = porukaNotaruService.findAll();

        List<PorukaNotaruDTO> porukeNotaruDTO = new ArrayList<>();
        for (PorukaNotaru p : porukeNotaru) {
            porukeNotaruDTO.add(new PorukaNotaruDTO(p));
        }

        return new ResponseEntity<>(porukeNotaruDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PorukaNotaruDTO> getPorukaNotaru(@PathVariable Integer id) {

        PorukaNotaru porukaNotaru = porukaNotaruService.findOne(id);

        if (porukaNotaru == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new PorukaNotaruDTO(porukaNotaru), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<PorukaNotaruDTO> savePorukaNotaru(@RequestBody PorukaNotaruDTO porukaNotaruDTO) {

        PorukaNotaru porukaNotaru = new PorukaNotaru();
        porukaNotaru.setDatumPromene(porukaNotaruDTO.getDatumPromene());
        porukaNotaru.setBrojParcele(porukaNotaruDTO.getBrojParcele());
        porukaNotaru.setStariVlasnik(porukaNotaruDTO.getStariVlasnik());
        porukaNotaru.setNoviVlasnik(porukaNotaruDTO.getNoviVlasnik());

        porukaNotaru = porukaNotaruService.save(porukaNotaru);
        return new ResponseEntity<>(new PorukaNotaruDTO(porukaNotaru), HttpStatus.CREATED);
    }
}
