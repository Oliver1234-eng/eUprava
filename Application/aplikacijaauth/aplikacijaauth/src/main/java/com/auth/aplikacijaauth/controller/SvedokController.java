package com.auth.aplikacijaauth.controller;

import com.auth.aplikacijaauth.dto.SvedokDTO;
import com.auth.aplikacijaauth.model.Svedok;
import com.auth.aplikacijaauth.service.SvedokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/svedoci")
public class SvedokController {

    @Autowired
    private SvedokService svedokService;

    @PreAuthorize("hasRole('MATICAR')")
    @GetMapping
    public ResponseEntity<List<SvedokDTO>> getSvedoci() {

        List<Svedok> svedoci = svedokService.findAll();

        List<SvedokDTO> svedociDTO = new ArrayList<>();
        for (Svedok s : svedoci) {
            svedociDTO.add(new SvedokDTO(s));
        }

        return new ResponseEntity<>(svedociDTO, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('MATICAR')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<SvedokDTO> getSvedok(@PathVariable Integer id) {

        Svedok svedok = svedokService.findOne(id);

        if (svedok == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new SvedokDTO(svedok), HttpStatus.OK);
    }
}