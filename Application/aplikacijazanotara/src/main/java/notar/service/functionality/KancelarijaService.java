package notar.service.functionality;

import notar.model.dto.KancelarijaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Kancelarija;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface KancelarijaService {

    public Kancelarija createKancelarija(KancelarijaDTO kancelarijaDTODTO);
    public List<Kancelarija> findAll();

    public Kancelarija findById(Long id);

    public List<Kancelarija> slobodneKancelarije(Long id);

}
