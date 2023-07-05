package com.maticar.aplikacijazamaticara.service.implementation;

import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.repository.MaticarRepository;
import com.maticar.aplikacijazamaticara.service.MaticarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaticarServiceImpl implements MaticarService {

    @Autowired
    private MaticarRepository maticarRepository;

    public Maticar findOne(String korisnickoIme) {
        return maticarRepository.findById(korisnickoIme).orElseGet(null);
    }

    public Maticar findOneByKorisnickoIme(String korisnickoIme) {
        return maticarRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Maticar> findAll() {
        return maticarRepository.findAll();
    }

    public Page<Maticar> findAll(Pageable page) {
        return maticarRepository.findAll(page);
    }

    public Maticar save(Maticar maticar) {
        return maticarRepository.save(maticar);
    }

    public void remove(String korisnickoIme) {
        maticarRepository.deleteById(korisnickoIme);
    }

    public List<Maticar> findByJmbg(String jmbg) {
        return maticarRepository.findAllByJmbg(jmbg);
    }

    public Maticar findByKorisnickoIme(String korisnickoIme) {
        return maticarRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Maticar> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka) {
        return maticarRepository.findByKorisnickoImeAndLozinkaAllIgnoringCase(korisnickoIme, lozinka);
    }

    public List<Maticar> pronadjiPoJmbg(String jmbg) {
        return maticarRepository.pronadjiKorisnikePoJmbg(jmbg);
    }
}
