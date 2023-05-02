package notar.service.functionality;

import notar.model.dto.UgovorDTO;
import notar.model.entity.Termin;
import notar.model.entity.Ugovor;

import java.util.List;

public interface UgovorService {

    public Ugovor createUgovor(UgovorDTO ugovorDTO);

    public Ugovor findById(long ugovorId);
    public List<Ugovor> findAll();
}
