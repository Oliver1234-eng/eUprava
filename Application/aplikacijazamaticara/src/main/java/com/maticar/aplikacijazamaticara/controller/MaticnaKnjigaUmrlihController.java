package com.maticar.aplikacijazamaticara.controller;

import com.maticar.aplikacijazamaticara.dto.MaticnaKnjigaRodjenihDTO;
import com.maticar.aplikacijazamaticara.dto.MaticnaKnjigaUmrlihDTO;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaUmrlih;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaRodjenihService;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaUmrlihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/maticar/maticnaKnjigaUmrlih")
public class MaticnaKnjigaUmrlihController {

    @Autowired
    private MaticnaKnjigaUmrlihService maticnaKnjigaUmrlihService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<MaticnaKnjigaUmrlihDTO>> getAllKnjigeUmrlih() {

        List<MaticnaKnjigaUmrlih> knjige = maticnaKnjigaUmrlihService.findAll();

        List<MaticnaKnjigaUmrlihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaUmrlih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaUmrlihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MaticnaKnjigaUmrlihDTO>> getKnjigePage(Pageable page) {

        Page<MaticnaKnjigaUmrlih> knjige = maticnaKnjigaUmrlihService.findAll(page);

        List<MaticnaKnjigaUmrlihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaUmrlih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaUmrlihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{jmbg}")
    public ResponseEntity<Void> obrisiKnjigu(@PathVariable String jmbg) {

        MaticnaKnjigaUmrlih knjiga = maticnaKnjigaUmrlihService.findOne(jmbg);

        if (knjiga != null) {
            maticnaKnjigaUmrlihService.remove(jmbg);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<MaticnaKnjigaUmrlihDTO>> findKnjigeByJmbg(@RequestParam String jmbg) {

        List<MaticnaKnjigaUmrlih> knjige = maticnaKnjigaUmrlihService.findByJmbg(jmbg);

        List<MaticnaKnjigaUmrlihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaUmrlih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaUmrlihDTO(m));
        }
        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaUmrlihDTO> updateKnjigaUmrlih(@RequestBody MaticnaKnjigaUmrlihDTO knjigaDTO) {

        MaticnaKnjigaUmrlih knjiga = maticnaKnjigaUmrlihService.findOne(knjigaDTO.getJmbg());
        if (knjiga == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        knjiga.setIme(knjigaDTO.getIme());
        knjiga.setPrezime(knjigaDTO.getPrezime());
        knjiga.setAdresaRodjenja(knjigaDTO.getAdresaRodjenja());
        knjiga.setImeOca(knjigaDTO.getImeOca());
        knjiga.setPrezimeOca(knjigaDTO.getPrezimeOca());
        knjiga.setZanimanjeOca(knjigaDTO.getZanimanjeOca());
        knjiga.setImeMajke(knjigaDTO.getImeMajke());
        knjiga.setPrezimeMajke(knjigaDTO.getPrezimeMajke());
        knjiga.setZanimanjeMajke(knjigaDTO.getZanimanjeMajke());
        knjiga.setDrzavljanstvo(knjigaDTO.getDrzavljanstvo());
        knjiga.setJmbgOca(knjigaDTO.getJmbgOca());
        knjiga.setJmbgMajke(knjigaDTO.getJmbgMajke());
        knjiga.setDanMesecIGodinaSmrti(knjigaDTO.getDanMesecIGodinaSmrti());
        knjiga.setCasSmrti(knjigaDTO.getCasSmrti());

        knjiga = maticnaKnjigaUmrlihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaUmrlihDTO(knjiga), HttpStatus.OK);
    }

    @GetMapping(value = "/{jmbg}")
    public ResponseEntity<MaticnaKnjigaUmrlihDTO> getKnjiga(@PathVariable String jmbg) {

        MaticnaKnjigaUmrlih knjiga = maticnaKnjigaUmrlihService.findOne(jmbg);
        if (knjiga == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new MaticnaKnjigaUmrlihDTO(knjiga), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaUmrlihDTO> createKnjigaUmrlih(@RequestBody MaticnaKnjigaUmrlihDTO knjigaDTO) {

        MaticnaKnjigaUmrlih knjiga = new MaticnaKnjigaUmrlih();
        knjiga.setJmbg(knjigaDTO.getJmbg());
        knjiga.setIme(knjigaDTO.getIme());
        knjiga.setPrezime(knjigaDTO.getPrezime());
        knjiga.setAdresaRodjenja(knjigaDTO.getAdresaRodjenja());
        knjiga.setImeOca(knjigaDTO.getImeOca());
        knjiga.setPrezimeOca(knjigaDTO.getPrezimeOca());
        knjiga.setZanimanjeOca(knjigaDTO.getZanimanjeOca());
        knjiga.setImeMajke(knjigaDTO.getImeMajke());
        knjiga.setPrezimeMajke(knjigaDTO.getPrezimeMajke());
        knjiga.setZanimanjeMajke(knjigaDTO.getZanimanjeMajke());
        knjiga.setDrzavljanstvo(knjigaDTO.getDrzavljanstvo());
        knjiga.setJmbgOca(knjigaDTO.getJmbgOca());
        knjiga.setJmbgMajke(knjigaDTO.getJmbgMajke());
        knjiga.setDanMesecIGodinaSmrti(knjigaDTO.getDanMesecIGodinaSmrti());
        knjiga.setCasSmrti(knjigaDTO.getCasSmrti());

        knjiga = maticnaKnjigaUmrlihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaUmrlihDTO(knjiga), HttpStatus.CREATED);
    }
}
