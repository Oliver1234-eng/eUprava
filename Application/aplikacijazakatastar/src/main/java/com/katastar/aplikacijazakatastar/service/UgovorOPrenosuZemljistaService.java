package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.UgovorOPrenosuZemljista;
import com.katastar.aplikacijazakatastar.repository.UgovorOPrenosuZemljistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UgovorOPrenosuZemljistaService {

    @Autowired
    private UgovorOPrenosuZemljistaRepository ugovorOPrenosuZemljistaRepository;

    public UgovorOPrenosuZemljista findOne(Integer id) {
        return ugovorOPrenosuZemljistaRepository.findById(id).orElseGet(null);
    }

    public List<UgovorOPrenosuZemljista> findAll() {
        return ugovorOPrenosuZemljistaRepository.findAll();
    }

    public Page<UgovorOPrenosuZemljista> findAll(Pageable page) {
        return ugovorOPrenosuZemljistaRepository.findAll(page);
    }

    public UgovorOPrenosuZemljista save(UgovorOPrenosuZemljista ugovorOPrenosuZemljista) {
        return ugovorOPrenosuZemljistaRepository.save(ugovorOPrenosuZemljista);
    }

    public void remove(Integer id) {
        ugovorOPrenosuZemljistaRepository.deleteById(id);
    }
}
