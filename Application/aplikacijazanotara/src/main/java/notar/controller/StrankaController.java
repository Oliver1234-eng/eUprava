package notar.controller;

import notar.model.dto.OsobaDTO;
import notar.model.entity.Notar;
import notar.model.entity.Stranka;
import notar.service.functionality.NotarService;
import notar.service.functionality.StrankaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/stranka/")
public class StrankaController {
    @Autowired
    private StrankaService strankaService;

    //add Stranka to db
    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Stranka> saveStranka(@RequestBody OsobaDTO strankaDTO) {
        Stranka newStranka = strankaService.createStranka(strankaDTO);
        return new ResponseEntity<Stranka>(newStranka, HttpStatus.CREATED);
    }

    //get all Stranka

    @GetMapping(value = "all/")
    public ResponseEntity<List<Stranka>> findAll() {
        return new ResponseEntity<>(strankaService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}/")
    public ResponseEntity<Stranka> findById(@PathVariable("id") Long id) {
        Stranka stranka = strankaService.findById(id);
        return new ResponseEntity<Stranka>(stranka, HttpStatus.OK);
    }


}
