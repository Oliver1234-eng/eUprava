package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.Katastar;
import com.katastar.aplikacijazakatastar.repository.KatastarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KatastarService {

    @Autowired
    private KatastarRepository katastarRepository;

    @Autowired
    public KatastarService(KatastarRepository katastarRepository) {
        this.katastarRepository = katastarRepository;
    }

    public Katastar findOne(String korisnickoIme) {
        return katastarRepository.findById(korisnickoIme).orElseGet(null);
    }

    public Katastar findOneByKorisnickoIme(String korisnickoIme) {
        return katastarRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Katastar> findAll() {
        return katastarRepository.findAll();
    }

    public Page<Katastar> findAll(Pageable page) {
        return katastarRepository.findAll(page);
    }

    public Katastar save(Katastar katastar) {
        return katastarRepository.save(katastar);
    }

    public void remove(String korisnickoIme) {
        katastarRepository.deleteById(korisnickoIme);
    }

    public Katastar findOneWithNepokretnosti(String gradjaninKorisnickoIme) {
        return katastarRepository.findOneWithNepokretnosti(gradjaninKorisnickoIme);
    }

    public Katastar findOneWithIstorijePromena(String gradjaninKorisnickoIme) {
        return katastarRepository.findOneWithIstorijePromena(gradjaninKorisnickoIme);
    }

    public List<Katastar> findByJmbg(String jmbg) {
        return katastarRepository.findAllByJmbg(jmbg);
    }

    public Katastar findByKorisnickoIme(String korisnickoIme) {
        return katastarRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Katastar> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka) {
        return katastarRepository.findByKorisnickoImeAndLozinkaAllIgnoringCase(korisnickoIme, lozinka);
    }

    public List<Katastar> pronadjiPoJmbg(String jmbg) {
        return katastarRepository.pronadjiKorisnikePoJmbg(jmbg);
    }
}
