package notar.service.functionality;

import notar.model.dto.OsobaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Notar;
import notar.model.entity.Stranka;

import java.util.List;

public interface StrankaService {

    public Stranka createStranka(OsobaDTO strankaDTO);

    public List<Stranka> findAll();

    public Stranka findById(Long id);

    public List<Stranka> findAllByIds(TerminDTO terminDTO);

}
