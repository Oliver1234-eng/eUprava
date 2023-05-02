package notar.controller;

import notar.model.dto.OsobaDTO;
import notar.model.entity.Notar;
import notar.service.functionality.NotarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/notar/")
public class NotarController {
    @Autowired
    private NotarService notarService;

    //add notar to db
    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Notar> saveNotar(@RequestBody OsobaDTO notarDTO) {
        Notar newNotar = notarService.createNotar(notarDTO);
        return new ResponseEntity<Notar>(newNotar, HttpStatus.CREATED);
    }
    
    //get all notar
    @GetMapping(value = "all/")
    public ResponseEntity<List<Notar>> findAll() {
        return new ResponseEntity<>(notarService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}/")
    public ResponseEntity<Notar> findById(@PathVariable("id") Long id) {
        Notar notar = notarService.findById(id);
        return new ResponseEntity<Notar>(notar, HttpStatus.OK);
    }


}