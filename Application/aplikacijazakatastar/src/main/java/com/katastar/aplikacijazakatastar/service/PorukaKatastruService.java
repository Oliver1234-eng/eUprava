package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.PorukaKatastru;
import com.katastar.aplikacijazakatastar.repository.PorukaKatastruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PorukaKatastruService {

    @Autowired
    private PorukaKatastruRepository porukaKatastruRepository;

    public PorukaKatastru findOne(Integer id) {
        return porukaKatastruRepository.findById(id).orElseGet(null);
    }

    public List<PorukaKatastru> findAll() {
        return porukaKatastruRepository.findAll();
    }

    public Page<PorukaKatastru> findAll(Pageable page) {
        return porukaKatastruRepository.findAll(page);
    }

    public PorukaKatastru save(PorukaKatastru porukaKatastru) {
        return porukaKatastruRepository.save(porukaKatastru);
    }

    public void remove(Integer id) {
        porukaKatastruRepository.deleteById(id);
    }
}
