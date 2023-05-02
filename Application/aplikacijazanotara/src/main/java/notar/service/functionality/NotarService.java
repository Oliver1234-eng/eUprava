package notar.service.functionality;

import notar.model.dto.OsobaDTO;
import notar.model.entity.Kancelarija;
import notar.model.entity.Notar;

import java.util.List;

public interface NotarService {

    public Notar createNotar(OsobaDTO notarDTO);

    public List<Notar> findAll();

    public Notar findById(Long id);
}
