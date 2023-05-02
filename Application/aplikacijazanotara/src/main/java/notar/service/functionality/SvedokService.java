package notar.service.functionality;

import notar.model.dto.OsobaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Stranka;
import notar.model.entity.Svedok;

import java.util.List;

public interface SvedokService {

    public Svedok createSvedok(OsobaDTO svedokDTO);

    public List<Svedok> findAll();

    public Svedok findById(Long id);

    public List<Svedok> findAllByIds(TerminDTO terminDTO);

}
