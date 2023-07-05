package com.maticar.aplikacijazamaticara.controller;

import com.maticar.aplikacijazamaticara.dto.KorisnikDTO;
import com.maticar.aplikacijazamaticara.dto.MaticarDTO;
import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.service.KorisnikService;
import com.maticar.aplikacijazamaticara.service.MaticarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/maticar/korisnik")
public class KorisnikController {

    @Autowired
    private KorisnikService korisnikService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<KorisnikDTO>> getAllUsers() {

        List<Korisnik> users = korisnikService.findAll();

        List<KorisnikDTO> usersDTO = new ArrayList<>();
        for (Korisnik k : users) {
            usersDTO.add(new KorisnikDTO(k));
        }

        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<KorisnikDTO>> getUsersPage(Pageable page) {

        Page<Korisnik> users = korisnikService.findAll(page);

        List<KorisnikDTO> usersDTO = new ArrayList<>();
        for (Korisnik k : users) {
            usersDTO.add(new KorisnikDTO(k));
        }

        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<KorisnikDTO> getUserByKorisnickoIme(@PathVariable String korisnickoIme) {

        Korisnik korisnik = korisnikService.findOneByKorisnickoIme(korisnickoIme);

        if (korisnik == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new KorisnikDTO(korisnik), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{korisnickoIme}")
    public ResponseEntity<Void> obrisiKorisnika(@PathVariable String korisnickoIme) {

        Korisnik korisnik = korisnikService.findOne(korisnickoIme);

        if (korisnik != null) {
            korisnikService.remove(korisnickoIme);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/findJmbg")
    public ResponseEntity<List<KorisnikDTO>> getUserByJmbg(@RequestParam String jmbg) {

        List<Korisnik> users = korisnikService.findByJmbg(jmbg);

        List<KorisnikDTO> usersDTO = new ArrayList<>();
        for (Korisnik k : users) {
            usersDTO.add(new KorisnikDTO(k));
        }
        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<KorisnikDTO>> findUserByJmbg(@RequestParam String jmbg) {

        List<Korisnik> users = korisnikService.pronadjiPoJmbg(jmbg);

        List<KorisnikDTO> usersDTO = new ArrayList<>();
        for (Korisnik k : users) {
            usersDTO.add(new KorisnikDTO(k));
        }
        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/findKorisnickoImeLozinka")
    public ResponseEntity<List<KorisnikDTO>> getUsersByKorisnickoImeAndLozinka(@RequestParam String korisnickoIme,
                                                                              @RequestParam String lozinka) {

        List<Korisnik> users = korisnikService.findByKorisnickoImeAndLozinka(korisnickoIme, lozinka);

        List<KorisnikDTO> usersDTO = new ArrayList<>();
        for (Korisnik k : users) {
            usersDTO.add(new KorisnikDTO(k));
        }
        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }
}
