package notar.controller;

import notar.model.entity.Stranka;
import notar.model.entity.Ugovor;
import notar.service.functionality.UgovorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}