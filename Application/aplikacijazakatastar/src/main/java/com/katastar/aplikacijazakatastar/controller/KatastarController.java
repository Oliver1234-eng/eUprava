package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.KatastarDTO;
import com.katastar.aplikacijazakatastar.model.Katastar;
import com.katastar.aplikacijazakatastar.service.KatastarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/katastar")
public class KatastarController {

    @Autowired
    private KatastarService katastarService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<KatastarDTO>> getAllKatastri() {

        List<Katastar> katastri = katastarService.findAll();

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }

        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<KatastarDTO>> getKatastriPage(Pageable page) {

        Page<Katastar> katastri = katastarService.findAll(page);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }

        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<KatastarDTO> getKatastarByKorisnickoIme(@PathVariable String korisnickoIme) {

        Katastar katastar = katastarService.findOneByKorisnickoIme(korisnickoIme);

        if (katastar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new KatastarDTO(katastar), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{korisnickoIme}")
    public ResponseEntity<Void> deleteKatastar(@PathVariable String korisnickoIme) {

        Katastar katastar = katastarService.findOne(korisnickoIme);

        if (katastar != null) {
            katastarService.remove(korisnickoIme);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/findJmbg")
    public ResponseEntity<List<KatastarDTO>> getKatastriByJmbg(@RequestParam String jmbg) {

        List<Katastar> katastri = katastarService.findByJmbg(jmbg);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<KatastarDTO>> pronadjiKorisnikePoJmbg(@RequestParam String jmbg) {

        List<Katastar> katastri = katastarService.pronadjiPoJmbg(jmbg);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/findKorisnickoImeLozinka")
    public ResponseEntity<List<KatastarDTO>> getUsersByKorisnickoImeAndLozinka(@RequestParam String korisnickoIme,
                                                                               @RequestParam String lozinka) {

        List<Katastar> katastri = katastarService.findByKorisnickoImeAndLozinka(korisnickoIme, lozinka);

        List<KatastarDTO> katastriDTO = new ArrayList<>();
        for (Katastar k : katastri) {
            katastriDTO.add(new KatastarDTO(k));
        }
        return new ResponseEntity<>(katastriDTO, HttpStatus.OK);
    }
}

