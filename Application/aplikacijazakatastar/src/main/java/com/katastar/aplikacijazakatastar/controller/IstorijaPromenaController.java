package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.IstorijaPromenaDTO;
import com.katastar.aplikacijazakatastar.model.IstorijaPromena;
import com.katastar.aplikacijazakatastar.service.IstorijaPromenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/istorijePromena")
public class IstorijaPromenaController {

    @Autowired
    private IstorijaPromenaService istorijaPromenaService;

    @GetMapping
    public ResponseEntity<List<IstorijaPromenaDTO>> getIstorijePromena() {

        List<IstorijaPromena> istorijePromena = istorijaPromenaService.findAll();

        List<IstorijaPromenaDTO> istorijePromenaDTO = new ArrayList<>();
        for (IstorijaPromena ip : istorijePromena) {
            istorijePromenaDTO.add(new IstorijaPromenaDTO(ip));
        }

        return new ResponseEntity<>(istorijePromenaDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<IstorijaPromenaDTO> getIstorijaPromena(@PathVariable Integer id) {

        IstorijaPromena istorijaPromena = istorijaPromenaService.findOne(id);

        if (istorijaPromena == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new IstorijaPromenaDTO(istorijaPromena), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<IstorijaPromenaDTO> saveIstorijaPromena(@RequestBody IstorijaPromenaDTO istorijaPromenaDTO) {

        IstorijaPromena istorijaPromena = new IstorijaPromena();
        istorijaPromena.setDatumPromene(istorijaPromenaDTO.getDatumPromene());
        istorijaPromena.setBrojParcele(istorijaPromenaDTO.getBrojParcele());
//        istorijaPromena.setNepokretnost(nepokretnost);
        istorijaPromena.setKatastar(istorijaPromenaDTO.getKatastar());
        istorijaPromena.setStariVlasnik(istorijaPromenaDTO.getStariVlasnik());
        istorijaPromena.setNoviVlasnik(istorijaPromenaDTO.getNoviVlasnik());

        istorijaPromena = istorijaPromenaService.save(istorijaPromena);
        return new ResponseEntity<>(new IstorijaPromenaDTO(istorijaPromena), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<IstorijaPromenaDTO> updateIstorijaPromena(@RequestBody IstorijaPromenaDTO istorijaPromenaDTO) {

        IstorijaPromena istorijaPromena = istorijaPromenaService.findOne(istorijaPromenaDTO.getId());

        if (istorijaPromena == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        istorijaPromena.setDatumPromene(istorijaPromenaDTO.getDatumPromene());
        istorijaPromena.setBrojParcele(istorijaPromenaDTO.getBrojParcele());
        istorijaPromena.setKatastar(istorijaPromenaDTO.getKatastar());
        istorijaPromena.setStariVlasnik(istorijaPromenaDTO.getStariVlasnik());
        istorijaPromena.setNoviVlasnik(istorijaPromenaDTO.getNoviVlasnik());

        istorijaPromena = istorijaPromenaService.save(istorijaPromena);
        return new ResponseEntity<>(new IstorijaPromenaDTO(istorijaPromena), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteIstorijaPromena(@PathVariable Integer id) {

        IstorijaPromena istorijaPromena = istorijaPromenaService.findOne(id);

        if (istorijaPromena != null) {
            istorijaPromenaService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
