package com.maticar.aplikacijazamaticara.controller;


import com.maticar.aplikacijazamaticara.dto.MaticarDTO;
import com.maticar.aplikacijazamaticara.dto.MaticnaKnjigaRodjenihDTO;
import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.service.MaticarService;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaRodjenihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/maticar/maticnaKnjigaRodjenih")
public class MaticnaKnjigaRodjenihController {

    @Autowired
    private MaticnaKnjigaRodjenihService maticnaKnjigaRodjenihService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<MaticnaKnjigaRodjenihDTO>> getAllKnjigeRodjenih() {

        List<MaticnaKnjigaRodjenih> knjige = maticnaKnjigaRodjenihService.findAll();

        List<MaticnaKnjigaRodjenihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaRodjenih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaRodjenihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MaticnaKnjigaRodjenihDTO>> getKnjigePage(Pageable page) {

        Page<MaticnaKnjigaRodjenih> knjige = maticnaKnjigaRodjenihService.findAll(page);

        List<MaticnaKnjigaRodjenihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaRodjenih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaRodjenihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{jmbg}")
    public ResponseEntity<Void> obrisiKnjigu(@PathVariable String jmbg) {

        MaticnaKnjigaRodjenih knjiga = maticnaKnjigaRodjenihService.findOne(jmbg);

        if (knjiga != null) {
            maticnaKnjigaRodjenihService.remove(jmbg);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<MaticnaKnjigaRodjenihDTO>> findKnjigeByJmbg(@RequestParam String jmbg) {

        List<MaticnaKnjigaRodjenih> knjige = maticnaKnjigaRodjenihService.findByJmbg(jmbg);

        List<MaticnaKnjigaRodjenihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaRodjenih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaRodjenihDTO(m));
        }
        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaRodjenihDTO> updateKnjigaRodjenih(@RequestBody MaticnaKnjigaRodjenihDTO knjigaDTO) {

        MaticnaKnjigaRodjenih knjiga = maticnaKnjigaRodjenihService.findOne(knjigaDTO.getJmbg());
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
        knjiga.setMestoIOpstinaRodjenja(knjigaDTO.getMestoIOpstinaRodjenja());
        knjiga.setDrzavaRodjenja(knjigaDTO.getDrzavaRodjenja());
        knjiga.setDanMesecGodinaIVremeRodjenja(knjigaDTO.getDanMesecGodinaIVremeRodjenja());
        knjiga.setRoditelji(knjigaDTO.getRoditelji());
        knjiga.setDeca(knjigaDTO.getDeca());

        knjiga = maticnaKnjigaRodjenihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaRodjenihDTO(knjiga), HttpStatus.OK);
    }

    @GetMapping(value = "/{jmbg}")
    public ResponseEntity<MaticnaKnjigaRodjenihDTO> getKnjiga(@PathVariable String jmbg) {

        MaticnaKnjigaRodjenih knjiga = maticnaKnjigaRodjenihService.findOne(jmbg);
        if (knjiga == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new MaticnaKnjigaRodjenihDTO(knjiga), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaRodjenihDTO> createKnjigaRodjenih(@RequestBody MaticnaKnjigaRodjenihDTO knjigaDTO) {

        MaticnaKnjigaRodjenih knjiga = new MaticnaKnjigaRodjenih();
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
        knjiga.setMestoIOpstinaRodjenja(knjigaDTO.getMestoIOpstinaRodjenja());
        knjiga.setDrzavaRodjenja(knjigaDTO.getDrzavaRodjenja());
        knjiga.setDanMesecGodinaIVremeRodjenja(knjigaDTO.getDanMesecGodinaIVremeRodjenja());
        knjiga.setRoditelji(knjigaDTO.getRoditelji());
        knjiga.setDeca(knjigaDTO.getDeca());

        knjiga = maticnaKnjigaRodjenihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaRodjenihDTO(knjiga), HttpStatus.CREATED);
    }
}
