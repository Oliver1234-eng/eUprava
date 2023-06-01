package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.PorukaNotaru;
import com.katastar.aplikacijazakatastar.repository.PorukaNotaruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PorukaNotaruService {

    @Autowired
    private PorukaNotaruRepository porukaNotaruRepository;

    public PorukaNotaru findOne(Integer id) {
        return porukaNotaruRepository.findById(id).orElseGet(null);
    }

    public List<PorukaNotaru> findAll() {
        return porukaNotaruRepository.findAll();
    }

    public Page<PorukaNotaru> findAll(Pageable page) {
        return porukaNotaruRepository.findAll(page);
    }

    public PorukaNotaru save(PorukaNotaru porukaNotaru) {
        return porukaNotaruRepository.save(porukaNotaru);
    }

    public void remove(Integer id) {
        porukaNotaruRepository.deleteById(id);
    }
}
