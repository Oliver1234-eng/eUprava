package com.auth.aplikacijaauth.service;

import com.auth.aplikacijaauth.model.Svedok;
import com.auth.aplikacijaauth.repository.SvedokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SvedokService {

    @Autowired
    private SvedokRepository svedokRepository;

    public Svedok findOne(Integer id) {
        return svedokRepository.findById(id).orElseGet(null);
    }

    public List<Svedok> findAll() {
        return svedokRepository.findAll();
    }

    public Page<Svedok> findAll(Pageable page) {
        return svedokRepository.findAll(page);
    }

    public Svedok save(Svedok svedok) {
        return svedokRepository.save(svedok);
    }

    public void remove(Integer id) {
        svedokRepository.deleteById(id);
    }
}