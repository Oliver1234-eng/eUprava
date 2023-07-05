package com.maticar.aplikacijazamaticara.service;

import com.maticar.aplikacijazamaticara.model.Maticar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MaticarService {
   Maticar findOne(String korisnickoIme);

   Maticar findOneByKorisnickoIme(String korisnickoIme);

   List<Maticar> findAll();

   Page<Maticar> findAll(Pageable page);

    Maticar save(Maticar maticar);

    void remove(String korisnickoIme);

    List<Maticar> findByJmbg(String jmbg);

    Maticar findByKorisnickoIme(String korisnickoIme);

    List<Maticar> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka);

    List<Maticar> pronadjiPoJmbg(String jmbg);
}
