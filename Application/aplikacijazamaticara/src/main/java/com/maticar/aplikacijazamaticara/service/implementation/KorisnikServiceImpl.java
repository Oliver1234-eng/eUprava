package com.maticar.aplikacijazamaticara.service.implementation;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.repository.KorisnikRepository;
import com.maticar.aplikacijazamaticara.repository.MaticarRepository;
import com.maticar.aplikacijazamaticara.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KorisnikServiceImpl implements KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    public Korisnik findOne(String korisnickoIme) {
        return korisnikRepository.findById(korisnickoIme).orElseGet(null);
    }

    public Korisnik findOneByKorisnickoIme(String korisnickoIme) {
        return korisnikRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    public Page<Korisnik> findAll(Pageable page) {
        return korisnikRepository.findAll(page);
    }

    public Korisnik save(Korisnik korisnik) {
        return korisnikRepository.save(korisnik);
    }

    public void remove(String korisnickoIme) {
        korisnikRepository.deleteById(korisnickoIme);
    }

    public List<Korisnik> findByJmbg(String jmbg) {
        return korisnikRepository.findAllByJmbg(jmbg);
    }

    public Korisnik findByKorisnickoIme(String korisnickoIme) {
        return korisnikRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Korisnik> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka) {
        return korisnikRepository.findByKorisnickoImeAndLozinkaAllIgnoringCase(korisnickoIme, lozinka);
    }

    public List<Korisnik> pronadjiPoJmbg(String jmbg) {
        return korisnikRepository.pronadjiKorisnikePoJmbg(jmbg);
    }
}
