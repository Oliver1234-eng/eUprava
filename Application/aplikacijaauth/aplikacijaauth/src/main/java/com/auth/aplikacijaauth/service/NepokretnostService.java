package com.auth.aplikacijaauth.service;

import com.auth.aplikacijaauth.model.Nepokretnost;
import com.auth.aplikacijaauth.repository.NepokretnostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NepokretnostService {

    @Autowired
    private NepokretnostRepository nepokretnostRepository;

    public Nepokretnost findOne(Integer id) {
        return nepokretnostRepository.findById(id).orElseGet(null);
    }

    public List<Nepokretnost> findAll() {
        return nepokretnostRepository.findAll();
    }

    public Page<Nepokretnost> findAll(Pageable page) {
        return nepokretnostRepository.findAll(page);
    }

    public Nepokretnost save(Nepokretnost nepokretnost) {
        return nepokretnostRepository.save(nepokretnost);
    }

    public void remove(Integer id) {
        nepokretnostRepository.deleteById(id);
    }

}