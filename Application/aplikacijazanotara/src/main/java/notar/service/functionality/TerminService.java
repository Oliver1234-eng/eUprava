package notar.service.functionality;

import notar.model.dto.TerminDTO;
import notar.model.dto.newTerminDTO;
import notar.model.entity.Termin;

import java.time.LocalTime;
import java.util.List;

public interface TerminService {

    public Termin createTermin(newTerminDTO terminDTO);

    public List<Termin> findAll();

    public Termin findById(Long id);

    public List<Termin> findByNotar(Long id);

    public List<Termin> findByStranka(Long id);

    public List<Termin> findNaCekanju();

    public Termin odobriTermin(Long id);

    public Termin zapocniTermin(Long id);

    public Termin overiTermin(Long id);

    public List<LocalTime> slobodniTermini(TerminDTO terminDTO);

}
