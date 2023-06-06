package notar.controller;

import notar.model.dto.UgovorDTO;
import notar.model.dto.newTerminDTO;
import notar.model.entity.Stranka;
import notar.model.entity.Termin;
import notar.model.entity.Ugovor;
import notar.service.functionality.UgovorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/ugovor/")
public class UgovorController {


    @Autowired
    private UgovorService ugovorService;

    @GetMapping(value = "all/")
    public ResponseEntity<List<Ugovor>> findAll() {
        return new ResponseEntity<>(ugovorService.findAll(), HttpStatus.OK);
    }

    @PostMapping(value="add/", consumes = "application/json")
    public ResponseEntity<Ugovor> saveUgovor(@RequestBody UgovorDTO ugovorDTO) {
        Ugovor newUgovor = ugovorService.createUgovor(ugovorDTO);
        return new ResponseEntity<Ugovor>(newUgovor, HttpStatus.CREATED);
    }


}
