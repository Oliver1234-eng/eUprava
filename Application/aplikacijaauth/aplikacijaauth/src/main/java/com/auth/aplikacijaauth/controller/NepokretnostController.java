package com.auth.aplikacijaauth.controller;

import com.auth.aplikacijaauth.dto.NepokretnostDTO;
import com.auth.aplikacijaauth.model.Nepokretnost;
import com.auth.aplikacijaauth.service.NepokretnostService;
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
@RequestMapping(value = "api/nepokretnosti")
public class NepokretnostController {

    @Autowired
    private NepokretnostService nepokretnostiService;

    @PreAuthorize("hasRole('RADNIK_U_KATASTRU')")
    @GetMapping
    public ResponseEntity<List<NepokretnostDTO>> getNepokretnosti() {

        List<Nepokretnost> nepokretnosti = nepokretnostiService.findAll();

        List<NepokretnostDTO> nepokretnostiDTO = new ArrayList<>();
        for (Nepokretnost n : nepokretnosti) {
            nepokretnostiDTO.add(new NepokretnostDTO(n));
        }

        return new ResponseEntity<>(nepokretnostiDTO, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('RADNIK_U_KATASTRU')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<NepokretnostDTO> getNepokretnost(@PathVariable Integer id) {

        Nepokretnost nepokretnost = nepokretnostiService.findOne(id);

        if (nepokretnost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new NepokretnostDTO(nepokretnost), HttpStatus.OK);
    }
}