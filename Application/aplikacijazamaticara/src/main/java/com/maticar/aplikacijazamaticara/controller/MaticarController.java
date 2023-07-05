package com.maticar.aplikacijazamaticara.controller;

import com.maticar.aplikacijazamaticara.dto.MaticarDTO;
import com.maticar.aplikacijazamaticara.model.Maticar;
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
@RequestMapping(value = "api/maticar/maticar")
public class MaticarController {
    @Autowired
    private MaticarService maticarService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<MaticarDTO>> getAllMaticar() {

        List<Maticar> maticars = maticarService.findAll();

        List<MaticarDTO> maticarsDTO = new ArrayList<>();
        for (Maticar m : maticars) {
            maticarsDTO.add(new MaticarDTO(m));
        }

        return new ResponseEntity<>(maticarsDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MaticarDTO>> getMaticarsPage(Pageable page) {

        Page<Maticar> maticars = maticarService.findAll(page);

        List<MaticarDTO> maticarsDTO = new ArrayList<>();
        for (Maticar m : maticars) {
            maticarsDTO.add(new MaticarDTO(m));
        }

        return new ResponseEntity<>(maticarsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<MaticarDTO> getMaticarByKorisnickoIme(@PathVariable String korisnickoIme) {

        Maticar maticar = maticarService.findOneByKorisnickoIme(korisnickoIme);

        if (maticar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new MaticarDTO(maticar), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{korisnickoIme}")
    public ResponseEntity<Void> obrisiMaticara(@PathVariable String korisnickoIme) {

        Maticar maticar = maticarService.findOne(korisnickoIme);

        if (maticar != null) {
            maticarService.remove(korisnickoIme);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/findJmbg")
    public ResponseEntity<List<MaticarDTO>> getMaticarByJmbg(@RequestParam String jmbg) {

        List<Maticar> maticars = maticarService.findByJmbg(jmbg);

        List<MaticarDTO> maticarsDTO = new ArrayList<>();
        for (Maticar m : maticars) {
            maticarsDTO.add(new MaticarDTO(m));
        }
        return new ResponseEntity<>(maticarsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/jmbg")
    public ResponseEntity<List<MaticarDTO>> findMaticarByJmbg(@RequestParam String jmbg) {

        List<Maticar> maticars = maticarService.pronadjiPoJmbg(jmbg);

        List<MaticarDTO> maticarsDTO = new ArrayList<>();
        for (Maticar m : maticars) {
            maticarsDTO.add(new MaticarDTO(m));
        }
        return new ResponseEntity<>(maticarsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/findKorisnickoImeLozinka")
    public ResponseEntity<List<MaticarDTO>> getUsersByKorisnickoImeAndLozinka(@RequestParam String korisnickoIme,
                                                                              @RequestParam String lozinka) {

        List<Maticar> maticars = maticarService.findByKorisnickoImeAndLozinka(korisnickoIme, lozinka);

        List<MaticarDTO> maticarsDTO = new ArrayList<>();
        for (Maticar m : maticars) {
            maticarsDTO.add(new MaticarDTO(m));
        }
        return new ResponseEntity<>(maticarsDTO, HttpStatus.OK);
    }
}
