package notar.service.implementation;
import notar.model.dto.TerminDTO;
import notar.model.dto.newTerminDTO;
import notar.model.entity.*;
import notar.model.enumeration.StatusTermina;
import notar.model.enumeration.VrstaUgovora;
import notar.repository.*;
import notar.service.functionality.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Long.parseLong;
import static java.time.LocalTime.parse;

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
    public Termin createTermin(newTerminDTO terminDTO) {

        Termin termin = new Termin();


        String str = terminDTO.getDatum().toString()+"T"+terminDTO.getVreme().toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY'T'HH:mm:ss");
        System.out.println(str);
        LocalDateTime div = LocalDateTime.parse(str);


        termin.setDatumIvremeSastanka(div);

        Kancelarija kanc = new Kancelarija();

        termin.setNotar(notarService.findById(parseLong("1")));
        termin.setKancelarija(kanc);
        termin.setVrstaUgovora(null);

        termin.setUgovor(null);
        termin.setOverenUgovor(false);
        termin.setVremeTrajanja((short) 30);
        termin.setStatusTermina(StatusTermina.NA_CEKANJU);
        terminRepository.save(termin);

//        List<Stranka> stranke = new ArrayList<>();
//        List<Long> ids = terminDTO.getStranka_ids();
//        if(ids.size()!=0)
//        for(int i = 0; i < terminDTO.getStranka_ids().size(); i++) {
//        StrankaTermin strankaTermin = new StrankaTermin();
//          Stranka stranka = strankaRepository.findById(ids.get(i)).orElse(null);
//          strankaTermin.setStranka(stranka);
//           strankaTermin.setTermin(termin);
//            stranke.add(stranka);
//           strankaTerminiRepository.save(strankaTermin);
//       }
//
//        List<Svedok> svedoci = new ArrayList<>();
//        List<Long> ids1 = terminDTO.getSvedok_ids();
//        if(ids1.size()!=0)
//        for(int i = 0; i < terminDTO.getSvedok_ids().size(); i++) {
//            SvedokTermin svedokTermin = new SvedokTermin();
//            Svedok svedok = svedokRepository.findById(ids1.get(i)).orElse(null);
//            svedokTermin.setSvedok(svedok);
//            System.out.println("svedok id:" + svedokTermin.getSvedok().getId());
//            svedokTermin.setTermin(termin);
//            svedoci.add(svedok);
//            svedokTerminiRepository.save(svedokTermin);
//        }

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

    @Override
    public List<LocalTime> slobodniTermini(TerminDTO terminDTO) {

        List<Termin> zauzetiTermini = findByNotar(terminDTO.getNotar_id());
        List<LocalTime> termini = new ArrayList<LocalTime>(){};
        for(int x = 0; x < 24; x++){
            LocalTime termin = LocalTime.of(8, 0, 0).plusMinutes(x*30);
            termini.add(termin);
        }
        List<LocalTime> slobodniTermini = new ArrayList<LocalTime>(){};



        for(int j = 0; j<termini.size(); j++){
            boolean overlap = false;
            for(int i = 0; i < zauzetiTermini.size(); i++) {
            if (
                    termini.get(j).plusMinutes(1).isAfter(zauzetiTermini.get(i).getDatumIvremeSastanka().toLocalTime())
                            &&
                            termini.get(j).plusMinutes(29).isBefore(zauzetiTermini.get(i).getDatumIvremeSastanka().plusMinutes(30).toLocalTime())
            )
                overlap = true;
        }
            if(overlap==false) slobodniTermini.add(termini.get(j));
        }
       // List<LocalTime> slobodniTermini1 = slobodniTermini.stream().distinct().collect(Collectors.toList());
        return slobodniTermini;
    }



}
