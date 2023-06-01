package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.Termin;
import com.katastar.aplikacijazakatastar.repository.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminService {

    @Autowired
    private TerminRepository terminRepository;

    public Termin findOne(Integer id) {
        return terminRepository.findById(id).orElseGet(null);
    }

    public List<Termin> findAll() {
        return terminRepository.findAll();
    }

    public Page<Termin> findAll(Pageable page) {
        return terminRepository.findAll(page);
    }

    public Termin save(Termin termin) {
        return terminRepository.save(termin);
    }

    public void remove(Integer id) {
        terminRepository.deleteById(id);
    }
}
