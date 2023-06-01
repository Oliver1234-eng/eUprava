package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.GradjaninDTO;
import com.katastar.aplikacijazakatastar.model.Gradjanin;
import com.katastar.aplikacijazakatastar.service.GradjaninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/katastar/gradjanin")
public class GradjaninController {

    @Autowired
    private GradjaninService gradjaninService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<GradjaninDTO>> getAllGradjani() {

        List<Gradjanin> gradjani = gradjaninService.findAll();

        List<GradjaninDTO> gradjaniDTO = new ArrayList<>();
        for (Gradjanin g : gradjani) {
            gradjaniDTO.add(new GradjaninDTO(g));
        }

        return new ResponseEntity<>(gradjaniDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<GradjaninDTO>> getGradjaniPage(Pageable page) {

        Page<Gradjanin> gradjani = gradjaninService.findAll(page);

        List<GradjaninDTO> gradjaniDTO = new ArrayList<>();
        for (Gradjanin g : gradjani) {
            gradjaniDTO.add(new GradjaninDTO(g));
        }

        return new ResponseEntity<>(gradjaniDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<GradjaninDTO> getGradjaninByKorisnickoIme(@PathVariable String korisnickoIme) {

        Gradjanin gradjanin = gradjaninService.findOneByKorisnickoIme(korisnickoIme);

        if (gradjanin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new GradjaninDTO(gradjanin), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{korisnickoIme}")
    public ResponseEntity<Void> deleteGradjanin(@PathVariable String korisnickoIme) {

        Gradjanin gradjanin = gradjaninService.findOne(korisnickoIme);

        if (gradjanin != null) {
            gradjaninService.remove(korisnickoIme);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/findJmbg")
    public ResponseEntity<List<GradjaninDTO>> getGradjaniByJmbg(@RequestParam(value = "jmbg") String jmbg) {

        List<Gradjanin> gradjani = gradjaninService.findByJmbg(jmbg);

        List<GradjaninDTO> gradjaniDTO = new ArrayList<>();
        for (Gradjanin g : gradjani) {
            gradjaniDTO.add(new GradjaninDTO(g));
        }
        return new ResponseEntity<>(gradjaniDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<GradjaninDTO>> pronadjiKorisnikePoJmbg(@RequestParam(value = "jmbg") String jmbg) {

        List<Gradjanin> gradjani = gradjaninService.pronadjiPoJmbg(jmbg);

        List<GradjaninDTO> usersDTO = new ArrayList<>();
        for (Gradjanin g : gradjani) {
            usersDTO.add(new GradjaninDTO(g));
        }
        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/findKorisnickoImeLozinka")
    public ResponseEntity<List<GradjaninDTO>> getUsersByKorisnickoImeAndLozinka(@RequestParam String korisnickoIme,
                                                                                @RequestParam String lozinka) {

        List<Gradjanin> gradjani = gradjaninService.findByKorisnickoImeAndLozinka(korisnickoIme, lozinka);

        List<GradjaninDTO> gradjaniDTO = new ArrayList<>();
        for (Gradjanin g : gradjani) {
            gradjaniDTO.add(new GradjaninDTO(g));
        }
        return new ResponseEntity<>(gradjaniDTO, HttpStatus.OK);
    }
}
