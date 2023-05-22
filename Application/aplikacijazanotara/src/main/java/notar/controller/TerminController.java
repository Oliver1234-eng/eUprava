package notar.controller;

import notar.model.dto.OsobaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Svedok;
import notar.model.entity.Termin;
import notar.service.functionality.SvedokService;
import notar.service.functionality.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/termin/")
public class TerminController {

    @Autowired
    private TerminService terminService;

    @GetMapping(value="slobodniTermini/", consumes = "application/json")
    public ResponseEntity<List<LocalTime>> rezervisiTermin(@RequestBody TerminDTO terminDTO) {
        return new ResponseEntity<>(terminService.slobodniTermini(terminDTO), HttpStatus.OK);
    }

    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Termin> saveTermin(@RequestBody TerminDTO terminDTO) {

        Termin newTermin = terminService.createTermin(terminDTO);
        return new ResponseEntity<Termin>(newTermin, HttpStatus.CREATED);
    }

    @GetMapping(value = "all/")
    public ResponseEntity<List<Termin>> findAll() {
        return new ResponseEntity<>(terminService.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "na_cekanju/")
    public ResponseEntity<List<Termin>> findNaCekanju() {
        return new ResponseEntity<>(terminService.findNaCekanju(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}/")
    public ResponseEntity<Termin> findById(@PathVariable("id") Long id) {
        Termin termin = terminService.findById(id);
        return new ResponseEntity<Termin>(termin, HttpStatus.OK);
    }

    @GetMapping(value = "notar/{id}/")
    public ResponseEntity<List<Termin>> findByNotar(@PathVariable("id") Long id) {
        return new ResponseEntity<>(terminService.findByNotar(id), HttpStatus.OK);
    }

    @PostMapping(value = "notar/odobri/{id}/")
    public ResponseEntity<Termin> odobriTermin(@PathVariable("id") Long id) {
        return new ResponseEntity<Termin>(terminService.odobriTermin(id), HttpStatus.OK);
    }

    @PostMapping(value = "notar/zapocni/{id}/")
    public ResponseEntity<Termin> zapocniTermin(@PathVariable("id") Long id) {
        return new ResponseEntity<Termin>(terminService.zapocniTermin(id), HttpStatus.OK);
    }

    @PostMapping(value = "notar/overi/{id}/")
    public ResponseEntity<Termin> overiTermin(@PathVariable("id") Long id) {
        return new ResponseEntity<Termin>(terminService.overiTermin(id), HttpStatus.OK);
    }


    @GetMapping(value = "stranka/{id}/")
    public ResponseEntity<List<Termin>> findByStranka(@PathVariable("id") Long id) {
        return new ResponseEntity<>(terminService.findByStranka(id), HttpStatus.OK);
    }

}
