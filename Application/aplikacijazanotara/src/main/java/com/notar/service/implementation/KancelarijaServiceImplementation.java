package com.notar.service.implementation;
import com.notar.model.dto.KancelarijaDTO;
import com.notar.model.entity.Kancelarija;
import com.notar.repository.KancelarijaRepository;
import com.notar.service.functionality.KancelarijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KancelarijaServiceImplementation implements KancelarijaService {
    @Autowired
    private KancelarijaRepository kancelarijaRepository;

    @Override
    public Kancelarija createKancelarija(KancelarijaDTO kancelarijaDTO) {
        Kancelarija kanc = new Kancelarija();
        kanc.setBrojKancelarije(kancelarijaDTO.getBrojKancelarije());
        kanc.setKapacitet(kancelarijaDTO.getKapacitet());

        kancelarijaRepository.save(kanc);
        return kanc;
    }
}
