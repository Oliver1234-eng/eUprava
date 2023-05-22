package com.katastar.aplikacijazakatastar.service;

import com.katastar.aplikacijazakatastar.model.IstorijaPromena;
import com.katastar.aplikacijazakatastar.repository.IstorijaPromenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IstorijaPromenaService {

    @Autowired
    private IstorijaPromenaRepository istorijaPromenaRepository;

    public IstorijaPromena findOne(Integer id) {
        return istorijaPromenaRepository.findById(id).orElseGet(null);
    }

    public List<IstorijaPromena> findAll() {
        return istorijaPromenaRepository.findAll();
    }

    public Page<IstorijaPromena> findAll(Pageable page) {
        return istorijaPromenaRepository.findAll(page);
    }

    public IstorijaPromena save(IstorijaPromena istorijaPromena) {
        return istorijaPromenaRepository.save(istorijaPromena);
    }

    public void remove(Integer id) {
        istorijaPromenaRepository.deleteById(id);
    }
}
