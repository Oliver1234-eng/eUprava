package notar.service.implementation;
import notar.model.dto.KancelarijaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Kancelarija;
import notar.model.entity.KancelarijaTermin;
import notar.repository.KancelarijaRepository;
import notar.repository.KancelarijaTerminRepository;
import notar.service.functionality.KancelarijaService;
import notar.service.functionality.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class KancelarijaServiceImplementation implements KancelarijaService {
    @Autowired
    private KancelarijaRepository kancelarijaRepository;

    @Autowired
    private KancelarijaTerminRepository kancelarijaTerminRepository;

    @Autowired
    private TerminService terminService;
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

    @Override
    public List<Kancelarija> slobodneKancelarije(TerminDTO terminDTO) {

        List<Kancelarija> kancelarije = kancelarijaRepository.findAll();
        List<KancelarijaTermin> instanca = kancelarijaTerminRepository.findAll();
        for(int i = 0; i < kancelarije.size(); i++)
            for(int j = 0; j<instanca.size(); j++) {
                LocalDateTime pocetak = instanca.get(j).getTermin().getDatumIvremeSastanka();
                if (terminDTO.getDatumIvremeSastanka().isAfter(pocetak) && terminDTO.getVremeTrajanja()<instanca.get(j).getTermin().getVremeTrajanja()) {
                    kancelarije.remove(i);
                }
            }
        return kancelarije;
    }


}
