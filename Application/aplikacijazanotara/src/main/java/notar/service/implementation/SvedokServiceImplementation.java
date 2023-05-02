package notar.service.implementation;

import notar.model.dto.OsobaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Osoba;
import notar.model.entity.Stranka;
import notar.model.entity.Svedok;
import notar.repository.StrankaRepository;
import notar.repository.SvedokRepository;
import notar.service.functionality.SvedokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SvedokServiceImplementation implements SvedokService {

    @Autowired
    private SvedokRepository svedokReposisoty;
    @Override
    public Svedok createSvedok(OsobaDTO svedokDTO) {
        Svedok svedok = new Svedok();

        svedok.setAdresa(svedokDTO.getAdresa());
        //svedok.setDatumRodjenja(svedokDTO.getDatumRodjenja());
        svedok.setDatumRodjenja(LocalDate.now());
        svedok.setIme(svedokDTO.getIme());
        svedok.setImeRoditelja(svedokDTO.getImeRoditelja());
        svedok.setJmbg(svedokDTO.getJmbg());
        svedok.setMestoRodjenja(svedokDTO.getMestoRodjenja());
        svedok.setPol(svedokDTO.getPol());
        svedok.setPrezime(svedokDTO.getPrezime());
        svedok.setPrezimeRoditelja(svedokDTO.getPrezimeRoditelja());
        svedok.setZanimanjeRoditelja(svedokDTO.getZanimanjeRoditelja());


        svedokReposisoty.save(svedok);

        return svedok;
    }

    @Override
    public List<Svedok> findAll() {
        return svedokReposisoty.findAll();
    }

    @Override
    public Svedok findById(Long id) {
        return svedokReposisoty.findById(id).orElse(null);
    }

    @Override
    public List<Svedok> findAllByIds(TerminDTO terminDTO) {
        List<Svedok> svedoci = null;
        List<Long> ids = terminDTO.getSvedok_ids();
        for(int i = 0; i < terminDTO.getSvedok_ids().size(); i++)
            svedoci.add(svedokReposisoty.findById(ids.get(i)).orElse(null));
        return svedoci;
    }
}
