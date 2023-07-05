package com.maticar.aplikacijazamaticara.service.implementation;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaUmrlih;
import com.maticar.aplikacijazamaticara.repository.MaticnaKnjigaRodjenihRepository;
import com.maticar.aplikacijazamaticara.repository.MaticnaKnjigaUmrlihRepository;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaRodjenihService;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaUmrlihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaticnaKnjigaUmrlihImpl implements MaticnaKnjigaUmrlihService {

    @Autowired
    private MaticnaKnjigaUmrlihRepository maticnaKnjigaUmrlihRepository;

    public MaticnaKnjigaUmrlih findOne(String jmbg) {
        return maticnaKnjigaUmrlihRepository.findById(jmbg).orElseGet(null);
    }

    public List<MaticnaKnjigaUmrlih> findByJmbg(String jmbg) {
        return maticnaKnjigaUmrlihRepository.findAllByJmbg(jmbg);
    }

    public List<MaticnaKnjigaUmrlih> findAll() {
        return maticnaKnjigaUmrlihRepository.findAll();
    }

    public Page<MaticnaKnjigaUmrlih> findAll(Pageable page) {
        return maticnaKnjigaUmrlihRepository.findAll(page);
    }

    public MaticnaKnjigaUmrlih save(MaticnaKnjigaUmrlih maticnaKnjigaUmrlih) {
        return maticnaKnjigaUmrlihRepository.save(maticnaKnjigaUmrlih);
    }

    public void remove(String jmbg) {
        maticnaKnjigaUmrlihRepository.deleteById(jmbg);
    }
}
