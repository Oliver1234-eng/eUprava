package com.auth.aplikacijaauth.controller;

import com.auth.aplikacijaauth.dto.KorisnikDTO;
import com.auth.aplikacijaauth.model.Korisnik;
import com.auth.aplikacijaauth.security.SecurityProperties;
import com.auth.aplikacijaauth.security.TokenUtils;
import com.auth.aplikacijaauth.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/korisnici")
public class KorisnikController {

    @Autowired
    private KorisnikService korisnikService;

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenUtils tokenUtils;

    @GetMapping(value = "/all")
    public ResponseEntity<List<KorisnikDTO>> getAllUsers() {

        List<Korisnik> korisnici = korisnikService.findAll();

        List<KorisnikDTO> korisniciDTO = new ArrayList<>();
        for (Korisnik k : korisnici) {
            korisniciDTO.add(new KorisnikDTO(k));
        }

        return new ResponseEntity<>(korisniciDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<KorisnikDTO>> getUsersPage(Pageable page) {

        Page<Korisnik> korisnici = korisnikService.findAll(page);

        List<KorisnikDTO> korisiciDTO = new ArrayList<>();
        for (Korisnik k : korisnici) {
            korisiciDTO.add(new KorisnikDTO(k));
        }

        return new ResponseEntity<>(korisiciDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{korisnickoIme}")
    public ResponseEntity<KorisnikDTO> getUserByUsername(@PathVariable String korisnickoIme) {

        Korisnik korisnik = korisnikService.findOneByKorisnickoIme(korisnickoIme);

        if (korisnik == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new KorisnikDTO(korisnik), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody KorisnikDTO korisnikDto) {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(korisnikDto.getKorisnickoIme(), korisnikDto.getLozinka());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(korisnikDto.getKorisnickoIme());
            return ResponseEntity.ok(tokenUtils.generateToken(userDetails));
        } catch (UsernameNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

}