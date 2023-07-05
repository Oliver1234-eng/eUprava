package com.maticar.aplikacijazamaticara.service;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaVencanih;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MaticnaKnjigaVencanihService {

    MaticnaKnjigaVencanih findByJmbgMuza(String jmbgMuza);

    List<MaticnaKnjigaVencanih> findAll();

    Page<MaticnaKnjigaVencanih> findAll(Pageable page);

    MaticnaKnjigaVencanih save(MaticnaKnjigaVencanih maticnaKnjigaVencanih);

    List<MaticnaKnjigaVencanih> findListByJmbgZene(String jmbgZene);

    void removeByJmbgZene(String jmbgZene);

    void removeByJmbgMuza(String jmbgMuza);
}
