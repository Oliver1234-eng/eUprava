package notar.service.functionality;

import notar.model.dto.KancelarijaDTO;
import notar.model.entity.Kancelarija;

import java.util.List;

public interface KancelarijaService {

    public Kancelarija createKancelarija(KancelarijaDTO kancelarijaDTODTO);
    public List<Kancelarija> findAll();

    public Kancelarija findById(Long id);
}
