package com.maticar.aplikacijazamaticara.service;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MaticnaKnjigaRodjenihService {

    MaticnaKnjigaRodjenih findOne(String jmbg);

    List<MaticnaKnjigaRodjenih> findAll();

    Page<MaticnaKnjigaRodjenih> findAll(Pageable page);

    List<MaticnaKnjigaRodjenih> findByJmbg(String jmbg);

    MaticnaKnjigaRodjenih save(MaticnaKnjigaRodjenih maticnaKnjigaRodjenih);

    void remove(String jmbg);
}
