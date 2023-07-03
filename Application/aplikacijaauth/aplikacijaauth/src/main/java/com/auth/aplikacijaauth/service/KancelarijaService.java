package com.auth.aplikacijaauth.service;

import com.auth.aplikacijaauth.model.Kancelarija;
import com.auth.aplikacijaauth.repository.KancelarijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KancelarijaService {

    @Autowired
    private KancelarijaRepository kancelarijaRepository;

    public Kancelarija findOne(Integer id) {
        return kancelarijaRepository.findById(id).orElseGet(null);
    }

    public List<Kancelarija> findAll() {
        return kancelarijaRepository.findAll();
    }

    public Page<Kancelarija> findAll(Pageable page) {
        return kancelarijaRepository.findAll(page);
    }

    public Kancelarija save(Kancelarija kancelarija) {
        return kancelarijaRepository.save(kancelarija);
    }

    public void remove(Integer id) {
        kancelarijaRepository.deleteById(id);
    }

}