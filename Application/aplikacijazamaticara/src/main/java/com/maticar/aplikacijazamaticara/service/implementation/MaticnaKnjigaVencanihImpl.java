package com.maticar.aplikacijazamaticara.service.implementation;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaVencanih;
import com.maticar.aplikacijazamaticara.repository.MaticnaKnjigaVencanihRepository;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaUmrlihService;
import com.maticar.aplikacijazamaticara.service.MaticnaKnjigaVencanihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaticnaKnjigaVencanihImpl implements MaticnaKnjigaVencanihService {

    @Autowired
    private MaticnaKnjigaVencanihRepository maticnaKnjigaVencanihRepository;

    public MaticnaKnjigaVencanih findByJmbgMuza(String jmbgMuza) {
        return maticnaKnjigaVencanihRepository.findById(jmbgMuza).orElseGet(null);
    }

    public List<MaticnaKnjigaVencanih> findListByJmbgZene(String jmbgZene) {
        return maticnaKnjigaVencanihRepository.findAllByJmbgZene(jmbgZene);
    }

    public List<MaticnaKnjigaVencanih> findAll() {
        return maticnaKnjigaVencanihRepository.findAll();
    }

    public Page<MaticnaKnjigaVencanih> findAll(Pageable page) {
        return maticnaKnjigaVencanihRepository.findAll(page);
    }

    public MaticnaKnjigaVencanih save(MaticnaKnjigaVencanih maticnaKnjigaVencanih) {
        return maticnaKnjigaVencanihRepository.save(maticnaKnjigaVencanih);
    }

    public void removeByJmbgZene(String jmbgZene) {
        maticnaKnjigaVencanihRepository.deleteById(jmbgZene);
    }

    public void removeByJmbgMuza(String jmbgMuza) {
        maticnaKnjigaVencanihRepository.deleteById(jmbgMuza);
    }
}
