package notar.service.implementation;
import notar.model.dto.KancelarijaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Kancelarija;
import notar.model.entity.KancelarijaTermin;
import notar.model.entity.Termin;
import notar.repository.KancelarijaRepository;
import notar.repository.KancelarijaTerminRepository;
import notar.service.functionality.KancelarijaService;
import notar.service.functionality.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
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
    public List<Kancelarija> slobodneKancelarije(Long id) {

        Termin terminDTO = terminService.findById(id);
        List<Kancelarija> kancelarije = kancelarijaRepository.findAll();
        List<KancelarijaTermin> ktList = kancelarijaTerminRepository.findAll();
        List<Kancelarija> slobodne = new ArrayList<>();
        for(int j = 0; j<kancelarije.size(); j++){
            boolean overlap = false;
            for(int i = 0; i < ktList.size(); i++) {
                if(kancelarije.get(j).getId()==ktList.get(i).getId())
                if (
                        terminDTO.getDatumIvremeSastanka().plusMinutes(1).isAfter(ktList.get(i).getTermin().getDatumIvremeSastanka())
                                &&
                                terminDTO.getDatumIvremeSastanka().plusMinutes(29).isBefore(ktList.get(i).getTermin().getDatumIvremeSastanka().plusMinutes(30))
                )
                    overlap = true;
            }
            if(overlap==false) slobodne.add(kancelarije.get(j));
        }
        return kancelarije;
    }

}
