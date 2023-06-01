package com.katastar.aplikacijazakatastar.controller;

import com.katastar.aplikacijazakatastar.dto.TerminDTO;
import com.katastar.aplikacijazakatastar.model.Termin;
import com.katastar.aplikacijazakatastar.service.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/notar/termini")
public class TerminController {

    @Autowired
    private TerminService terminService;

    @GetMapping
    public ResponseEntity<List<TerminDTO>> getTermini() {

        List<Termin> termini = terminService.findAll();

        List<TerminDTO> terminiDTO = new ArrayList<>();
        for (Termin t : termini) {
            terminiDTO.add(new TerminDTO(t));
        }

        return new ResponseEntity<>(terminiDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TerminDTO> getTermin(@PathVariable Integer id) {

        Termin termin = terminService.findOne(id);

        if (termin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new TerminDTO(termin), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<TerminDTO> saveTermin(@RequestBody TerminDTO terminDTO) {


        Termin termin = new Termin();
        termin.setDatumIVremeSastanka(terminDTO.getDatumIVremeSastanka());
        termin.setImeIPrezimeNotara(terminDTO.getImeIPrezimeNotara());
        termin.setJmbgGradjanina(terminDTO.getJmbgGradjanina());
        termin.setImeIPrezimeGradjanina(terminDTO.getImeIPrezimeGradjanina());
        termin.setBrojParcele(terminDTO.getBrojParcele());
        termin.setJmbgVlasnika(terminDTO.getJmbgVlasnika());
        termin.setImeIPrezimeVlasnika(terminDTO.getImeIPrezimeVlasnika());
        termin.setSrodstvo(terminDTO.getSrodstvo());

        termin = terminService.save(termin);
        return new ResponseEntity<>(new TerminDTO(termin), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<TerminDTO> updateTermin(@RequestBody TerminDTO terminDTO) {

        Termin termin = terminService.findOne(terminDTO.getId());

        if (termin == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        termin.setDatumIVremeSastanka(terminDTO.getDatumIVremeSastanka());
        termin.setImeIPrezimeNotara(terminDTO.getImeIPrezimeNotara());
        termin.setJmbgGradjanina(terminDTO.getJmbgGradjanina());
        termin.setImeIPrezimeGradjanina(terminDTO.getImeIPrezimeGradjanina());
        termin.setBrojParcele(terminDTO.getBrojParcele());
        termin.setJmbgVlasnika(terminDTO.getJmbgVlasnika());
        termin.setImeIPrezimeVlasnika(terminDTO.getImeIPrezimeVlasnika());
        termin.setSrodstvo(terminDTO.getSrodstvo());

        termin = terminService.save(termin);
        return new ResponseEntity<>(new TerminDTO(termin), HttpStatus.OK);
    }

    @PutMapping(consumes = "application/json", value = "/updateTerminGradjanin")
    public ResponseEntity<TerminDTO> updateTerminGradjanin(@RequestBody TerminDTO terminDTO) {

        Termin termin = terminService.findOne(terminDTO.getId());

        if (termin == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        termin.setJmbgGradjanina(terminDTO.getJmbgGradjanina());
        termin.setImeIPrezimeGradjanina(terminDTO.getImeIPrezimeGradjanina());
        termin.setBrojParcele(terminDTO.getBrojParcele());
        termin.setJmbgVlasnika(terminDTO.getJmbgVlasnika());
        termin.setImeIPrezimeVlasnika(terminDTO.getImeIPrezimeVlasnika());
        termin.setSrodstvo(terminDTO.getSrodstvo());

        termin = terminService.save(termin);
        return new ResponseEntity<>(new TerminDTO(termin), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteTermin(@PathVariable Integer id) {

        Termin termin = terminService.findOne(id);

        if (termin != null) {
            terminService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
