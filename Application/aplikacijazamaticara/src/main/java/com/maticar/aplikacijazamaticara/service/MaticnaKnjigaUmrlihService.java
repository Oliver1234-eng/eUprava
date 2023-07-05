package com.maticar.aplikacijazamaticara.service;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaUmrlih;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MaticnaKnjigaUmrlihService {

    MaticnaKnjigaUmrlih findOne(String jmbg);

    List<MaticnaKnjigaUmrlih> findAll();

    Page<MaticnaKnjigaUmrlih> findAll(Pageable page);

    List<MaticnaKnjigaUmrlih> findByJmbg(String jmbg);

    MaticnaKnjigaUmrlih save(MaticnaKnjigaUmrlih maticnaKnjigaUmrlih);

    void remove(String jmbg);
}
