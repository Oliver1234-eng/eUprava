package notar.service.implementation;
import notar.model.dto.TerminDTO;
import notar.model.entity.*;
import notar.model.enumeration.VrstaUgovora;
import notar.repository.*;
import notar.service.functionality.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TerminServiceImplementation implements TerminService {
    @Autowired
    private TerminRepository terminRepository;

    @Autowired
    private NotarService notarService;

    @Autowired
    private UgovorService ugovorService;

    @Autowired
    private StrankaService strankaService;

    @Autowired
    private SvedokService svedokService;

    @Autowired
    private KancelarijaService kancelarijaService;

    @Autowired
    private StrankaTerminiRepository strankaTerminiRepository;

    @Autowired
    private StrankaRepository strankaRepository;

    @Autowired
    private SvedokRepository svedokRepository;

    @Autowired
    private SvedokTerminiRepository svedokTerminiRepository;

    @Autowired
    private UgovorRepository ugovorRepository;
    @Override
    public Termin createTermin(TerminDTO terminDTO) {
        Termin termin = new Termin();
        termin.setKancelarija(kancelarijaService.findById(terminDTO.getKancelarija_id()));
        termin.setDatumIvremeSastanka(terminDTO.getDatumIvremeSastanka());
        termin.setNotar(notarService.findById(terminDTO.getNotar_id()));
        termin.setVrstaUgovora(terminDTO.getVrstaUgovora());

        termin.setUgovor(ugovorService.findById(terminDTO.getUgovor_id()));
        termin.setOverenUgovor(terminDTO.isOverenUgovor());
        termin.setVremeTrajanja(terminDTO.getVremeTrajanja());
        termin.setStatusTermina(terminDTO.getStatusTermina());

        terminRepository.save(termin);

        List<Stranka> stranke = new ArrayList<>();
        List<Long> ids = terminDTO.getStranka_ids();
        if(ids.size()!=0)
        for(int i = 0; i < terminDTO.getStranka_ids().size(); i++) {
        StrankaTermin strankaTermin = new StrankaTermin();
          Stranka stranka = strankaRepository.findById(ids.get(i)).orElse(null);
          strankaTermin.setStranka(stranka);
           strankaTermin.setTermin(termin);
            stranke.add(stranka);
           strankaTerminiRepository.save(strankaTermin);
       }

        List<Svedok> svedoci = new ArrayList<>();
        List<Long> ids1 = terminDTO.getSvedok_ids();
        if(ids1.size()!=0)
        for(int i = 0; i < terminDTO.getSvedok_ids().size(); i++) {
            SvedokTermin svedokTermin = new SvedokTermin();
            Svedok svedok = svedokRepository.findById(ids1.get(i)).orElse(null);
            svedokTermin.setSvedok(svedok);
            System.out.println("svedok id:" + svedokTermin.getSvedok().getId());
            svedokTermin.setTermin(termin);
            svedoci.add(svedok);
            svedokTerminiRepository.save(svedokTermin);
        }

        return termin;

    }

    @Override
    public List<Termin> findAll() {
        return terminRepository.findAll();
    }

    @Override
    public Termin findById(Long id) {
        return terminRepository.findById(id).orElse(null);
    }

    @Override
    public List<Termin> findByNotar(Long id) {
        return terminRepository.findByNotar(id);
    }

    @Override
    public List<Termin> findByStranka(Long id) {
        return terminRepository.findByStranka(id);
    }

    @Override
    public List<Termin> findNaCekanju() {
        return terminRepository.findByStatus();
    }

    @Override
    public Termin odobriTermin(Long id) {
        terminRepository.odobriTermin(id);
        return terminRepository.findById(id).orElse(null);
    }
    @Override
    public Termin zapocniTermin(Long id) {
        terminRepository.zapocniTermin(id);
        return terminRepository.findById(id).orElse(null);
    }

    @Override
    public Termin overiTermin(Long id) {
        terminRepository.overiTermin(id);
        Ugovor ugovor = new Ugovor();
        Termin termin = terminRepository.findById(id).orElse(null);
        ugovor.setOveren(true);
        ugovor.setDatumOvereUgovora(LocalDateTime.now());
        ugovor.setNotar(termin.getNotar());

        ugovor.setVrstaUgovora(termin.getVrstaUgovora());

        ugovorRepository.save(ugovor);

        return termin;
    }


}