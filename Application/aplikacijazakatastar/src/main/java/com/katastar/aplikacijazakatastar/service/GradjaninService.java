package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.Gradjanin;
import com.katastar.aplikacijazakatastar.repository.GradjaninRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradjaninService {

    @Autowired
    private GradjaninRepository gradjaninRepository;

    @Autowired
    public GradjaninService(GradjaninRepository gradjaninRepository) {
        this.gradjaninRepository = gradjaninRepository;
    }

    public Gradjanin findOne(String korisnickoIme) {
        return gradjaninRepository.findById(korisnickoIme).orElseGet(null);
    }

    public Gradjanin findOneByKorisnickoIme(String korisnickoIme) {
        return gradjaninRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Gradjanin> findAll() {
        return gradjaninRepository.findAll();
    }

    public Page<Gradjanin> findAll(Pageable page) {
        return gradjaninRepository.findAll(page);
    }

    public Gradjanin save(Gradjanin gradjanin) {
        return gradjaninRepository.save(gradjanin);
    }

    public void remove(String korisnickoIme) {
        gradjaninRepository.deleteById(korisnickoIme);
    }

    public Gradjanin findOneWithNepokretnosti(String gradjaninKorisnickoIme) {
        return gradjaninRepository.findOneWithNepokretnosti(gradjaninKorisnickoIme);
    }

    public List<Gradjanin> findByJmbg(String jmbg) {
        return gradjaninRepository.findAllByJmbg(jmbg);
    }

    public Gradjanin findByKorisnickoIme(String korisnickoIme) {
        return gradjaninRepository.findOneByKorisnickoIme(korisnickoIme);
    }

    public List<Gradjanin> findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka) {
        return gradjaninRepository.findByKorisnickoImeAndLozinkaAllIgnoringCase(korisnickoIme, lozinka);
    }

    public List<Gradjanin> pronadjiPoJmbg(String jmbg) {
        return gradjaninRepository.pronadjiKorisnikePoJmbg(jmbg);
    }

}
