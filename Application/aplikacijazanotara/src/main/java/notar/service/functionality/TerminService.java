package notar.service.functionality;

import notar.model.dto.TerminDTO;
import notar.model.entity.Termin;

import java.util.List;

public interface TerminService {

    public Termin createTermin(TerminDTO terminDTO);

    public List<Termin> findAll();

    public Termin findById(Long id);

    public List<Termin> findByNotar(Long id);

    public List<Termin> findByStranka(Long id);

    public List<Termin> findNaCekanju();

    public Termin odobriTermin(Long id);

    public Termin zapocniTermin(Long id);

    public Termin overiTermin(Long id);
}
