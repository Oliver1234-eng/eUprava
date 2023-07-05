package com.maticar.aplikacijazamaticara.service;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.Maticar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KorisnikService {

    Korisnik findOne(String korisnickoIme);

    Korisnik findOneByKorisnickoIme(String korisnickoIme);

    List<Korisnik> findAll();

    Page<Korisnik> findAll(Pageable page);

    Korisnik save(Korisnik korisnik);

    void remove(String korisnickoIme);

    List<Korisnik> findByJmbg(String jmbg);

    Korisnik findByKorisnickoIme(String korisnickoIme);

    List<Korisnik> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka);

    List<Korisnik> pronadjiPoJmbg(String jmbg);
}
