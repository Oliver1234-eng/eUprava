package com.maticar.aplikacijazamaticara.controller;

import com.maticar.aplikacijazamaticara.dto.MaticnaKnjigaRodjenihDTO;
import com.maticar.aplikacijazamaticara.dto.MaticnaKnjigaVencanihDTO;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaVencanih;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaRodjenihService;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaVencanihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/maticar/maticnaKnjigaVencanih")
public class MaticnaKnjigaVencanihController {

    @Autowired
    private MaticnaKnjigaVencanihService maticnaKnjigaVencanihService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<MaticnaKnjigaVencanihDTO>> getAllKnjigeVencanih() {

        List<MaticnaKnjigaVencanih> knjige = maticnaKnjigaVencanihService.findAll();

        List<MaticnaKnjigaVencanihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaVencanih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaVencanihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MaticnaKnjigaVencanihDTO>> getKnjigePage(Pageable page) {

        Page<MaticnaKnjigaVencanih> knjige = maticnaKnjigaVencanihService.findAll(page);

        List<MaticnaKnjigaVencanihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaVencanih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaVencanihDTO(m));
        }

        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = "/jmbgMuza/{jmbgMuza}")
    public ResponseEntity<Void> obrisiKnjiguPoJmbgMuza(@PathVariable String jmbgMuza) {

        MaticnaKnjigaVencanih knjiga = maticnaKnjigaVencanihService.findByJmbgMuza(jmbgMuza);

        if (knjiga != null) {
            maticnaKnjigaVencanihService.removeByJmbgMuza(jmbgMuza);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/jmbgZene")
    public ResponseEntity<List<MaticnaKnjigaVencanihDTO>> findKnjigeByJmbgZene(@RequestParam String jmbgZene) {

        List<MaticnaKnjigaVencanih> knjige = maticnaKnjigaVencanihService.findListByJmbgZene(jmbgZene);

        List<MaticnaKnjigaVencanihDTO> knjigeDTO = new ArrayList<>();
        for (MaticnaKnjigaVencanih m : knjige) {
            knjigeDTO.add(new MaticnaKnjigaVencanihDTO(m));
        }
        return new ResponseEntity<>(knjigeDTO, HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaVencanihDTO> updateKnjigaVencanih(@RequestBody MaticnaKnjigaVencanihDTO knjigaDTO) {

        MaticnaKnjigaVencanih knjiga = maticnaKnjigaVencanihService.findByJmbgMuza(knjigaDTO.getJmbgMuza());
        if (knjiga == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        knjiga.setImeZene(knjigaDTO.getImeZene());
        knjiga.setPrezimeZene(knjigaDTO.getPrezimeZene());
        knjiga.setImeMuza(knjigaDTO.getImeMuza());
        knjiga.setPrezimeMuza(knjigaDTO.getPrezimeMuza());
        knjiga.setJmbgZene(knjigaDTO.getJmbgZene());
        knjiga.setJmbgMuza(knjigaDTO.getJmbgMuza());
        knjiga.setDanMesecIGodinaZakljucenjaBraka(knjigaDTO.getDanMesecIGodinaZakljucenjaBraka());
        knjiga.setAdresaPrebivalistaZene(knjigaDTO.getAdresaPrebivalistaZene());
        knjiga.setAdresaPrebivalistaMuza(knjigaDTO.getAdresaPrebivalistaMuza());
        knjiga.setDrzavljanstvoZene(knjigaDTO.getDrzavljanstvoZene());
        knjiga.setDrzavljanstvoMuza(knjigaDTO.getDrzavljanstvoMuza());
        knjiga.setImeSvedoka1(knjigaDTO.getImeSvedoka1());
        knjiga.setPrezimeSvedoka1(knjigaDTO.getPrezimeSvedoka1());
        knjiga.setImeSvedoka2(knjigaDTO.getImeSvedoka2());
        knjiga.setPrezimeSvedoka2(knjigaDTO.getPrezimeSvedoka2());

        knjiga = maticnaKnjigaVencanihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaVencanihDTO(knjiga), HttpStatus.OK);
    }

    @GetMapping(value = "/{jmbgMuza}")
    public ResponseEntity<MaticnaKnjigaVencanihDTO> getKnjiga(@PathVariable String jmbgMuza) {

        MaticnaKnjigaVencanih knjiga = maticnaKnjigaVencanihService.findByJmbgMuza(jmbgMuza);
        if (knjiga == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new MaticnaKnjigaVencanihDTO(knjiga), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<MaticnaKnjigaVencanihDTO> createKnjigaRodjenih(@RequestBody MaticnaKnjigaVencanihDTO knjigaDTO) {

        MaticnaKnjigaVencanih knjiga = new MaticnaKnjigaVencanih();
        knjiga.setImeZene(knjigaDTO.getImeZene());
        knjiga.setPrezimeZene(knjigaDTO.getPrezimeZene());
        knjiga.setImeMuza(knjigaDTO.getImeMuza());
        knjiga.setPrezimeMuza(knjigaDTO.getPrezimeMuza());
        knjiga.setJmbgZene(knjigaDTO.getJmbgZene());
        knjiga.setJmbgMuza(knjigaDTO.getJmbgMuza());
        knjiga.setDanMesecIGodinaZakljucenjaBraka(knjigaDTO.getDanMesecIGodinaZakljucenjaBraka());
        knjiga.setAdresaPrebivalistaZene(knjigaDTO.getAdresaPrebivalistaZene());
        knjiga.setAdresaPrebivalistaMuza(knjigaDTO.getAdresaPrebivalistaMuza());
        knjiga.setDrzavljanstvoZene(knjigaDTO.getDrzavljanstvoZene());
        knjiga.setDrzavljanstvoMuza(knjigaDTO.getDrzavljanstvoMuza());
        knjiga.setImeSvedoka1(knjigaDTO.getImeSvedoka1());
        knjiga.setPrezimeSvedoka1(knjigaDTO.getPrezimeSvedoka1());
        knjiga.setImeSvedoka2(knjigaDTO.getImeSvedoka2());
        knjiga.setPrezimeSvedoka2(knjigaDTO.getPrezimeSvedoka2());

        knjiga = maticnaKnjigaVencanihService.save(knjiga);
        return new ResponseEntity<>(new MaticnaKnjigaVencanihDTO(knjiga), HttpStatus.CREATED);
    }
}
