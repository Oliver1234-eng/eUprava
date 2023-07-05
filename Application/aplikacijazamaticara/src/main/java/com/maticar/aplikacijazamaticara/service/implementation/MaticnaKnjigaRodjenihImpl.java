package com.maticar.aplikacijazamaticara.service.implementation;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.repository.MaticnaKnjigaRodjenihRepository;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaRodjenihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaticnaKnjigaRodjenihImpl implements MaticnaKnjigaRodjenihService {

    @Autowired
    private MaticnaKnjigaRodjenihRepository maticnaKnjigaRodjenihRepository;

    public MaticnaKnjigaRodjenih findOne(String jmbg) {
        return maticnaKnjigaRodjenihRepository.findById(jmbg).orElseGet(null);
    }

    public List<MaticnaKnjigaRodjenih> findByJmbg(String jmbg) {
        return maticnaKnjigaRodjenihRepository.findAllByJmbg(jmbg);
    }

    public List<MaticnaKnjigaRodjenih> findAll() {
        return maticnaKnjigaRodjenihRepository.findAll();
    }

    public Page<MaticnaKnjigaRodjenih> findAll(Pageable page) {
        return maticnaKnjigaRodjenihRepository.findAll(page);
    }

    public MaticnaKnjigaRodjenih save(MaticnaKnjigaRodjenih maticnaKnjigaRodjenih) {
        return maticnaKnjigaRodjenihRepository.save(maticnaKnjigaRodjenih);
    }

    public void remove(String jmbg) {
        maticnaKnjigaRodjenihRepository.deleteById(jmbg);
    }
}
