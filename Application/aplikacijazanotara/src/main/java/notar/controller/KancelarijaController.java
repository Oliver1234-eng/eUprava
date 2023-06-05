package notar.controller;

import notar.model.dto.KancelarijaDTO;
import notar.model.entity.Kancelarija;
import notar.service.functionality.KancelarijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/kancelarija/")
public class KancelarijaController {
    @Autowired
    private KancelarijaService kancelarijaService;

    //add kancelarija to db
    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Kancelarija> saveCommunity(@RequestBody KancelarijaDTO kancelarijaDTO) {
        Kancelarija newKancelarija = kancelarijaService.createKancelarija(kancelarijaDTO);
        return new ResponseEntity<Kancelarija>(newKancelarija, HttpStatus.CREATED);
    }
    //get all kancelarija

    @GetMapping(value = "all/")
    public ResponseEntity<List<Kancelarija>> findAll() {
        return new ResponseEntity<>(kancelarijaService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}/")
    public ResponseEntity<Kancelarija> findById(@PathVariable("id") Long id) {
        Kancelarija kancelarija = kancelarijaService.findById(id);
        return new ResponseEntity<Kancelarija>(kancelarija, HttpStatus.OK);
    }
    @GetMapping(value = "slobodne/{id}/")
    public ResponseEntity<List<Kancelarija>> findSlobodneKancelarije(@PathVariable("id") Long id) {
        return new ResponseEntity<>(kancelarijaService.slobodneKancelarije(id), HttpStatus.OK);
    }

}
