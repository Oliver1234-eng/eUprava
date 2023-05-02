package notar.service.implementation;
import notar.model.dto.KancelarijaDTO;
import notar.model.entity.Kancelarija;
import notar.repository.KancelarijaRepository;
import notar.service.functionality.KancelarijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KancelarijaServiceImplementation implements KancelarijaService {
    @Autowired
    private KancelarijaRepository kancelarijaRepository;

    @Override
    public Kancelarija createKancelarija(KancelarijaDTO kancelarijaDTO) {
        Kancelarija kanc = new Kancelarija();
        kanc.setKapacitet(kancelarijaDTO.getKapacitet());
        kancelarijaRepository.save(kanc);
        return kanc;
    }

    @Override
    public List<Kancelarija> findAll() {
        return kancelarijaRepository.findAll();
    }

    @Override
    public Kancelarija findById(Long id) {
        return kancelarijaRepository.findById(id).orElse(null);
    }
}
