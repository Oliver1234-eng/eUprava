package notar.service.implementation;

import notar.model.dto.UgovorDTO;
import notar.model.entity.*;
import notar.model.enumeration.StatusTermina;
import notar.model.enumeration.VrstaUgovora;
import notar.repository.TerminRepository;
import notar.repository.UgovorRepository;
import notar.service.functionality.UgovorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UgovorServiceImplementation implements UgovorService {
    @Autowired
    private UgovorRepository ugovorRepository;

    @Autowired
    private TerminRepository terminRepository;

    @Override
    public Ugovor createUgovor(UgovorDTO ugovorDTO) {

        terminRepository.overiTermin(ugovorDTO.getTermin().getId());

        if(ugovorDTO.getVrstaUgovora()== VrstaUgovora.OVERA_NEPOKRETNOSTI){
            UgovorOPrenosuZemljista ugovor = new UgovorOPrenosuZemljista();

            ugovor.setNotar(ugovorDTO.getNotar());
            ugovor.setOveren(true);

            ugovor.setDatumOvereUgovora(LocalDateTime.now());

            ugovor.setVrstaUgovora(ugovorDTO.getVrstaUgovora());

            ugovor.setBrojParcele(ugovorDTO.getBrojParcele());
            ugovor.setNoviVlasnik(ugovorDTO.getNoviVlasnik());
            ugovor.setStariVlasnik(ugovorDTO.getStariVlasnik());

            return ugovorRepository.save(ugovor);
        }
        if(ugovorDTO.getVrstaUgovora()== VrstaUgovora.OVERA_DOKUMENTA){
            UgovorDokument ugovor = new UgovorDokument();

            ugovor.setNotar(ugovorDTO.getNotar());
            ugovor.setOveren(true);
            ugovor.setDatumOvereUgovora(LocalDateTime.now());

            ugovor.setVrstaUgovora(ugovorDTO.getVrstaUgovora());

            ugovor.setDokument(ugovorDTO.getDokument());

            return ugovorRepository.save(ugovor);
        }

        if(ugovorDTO.getVrstaUgovora() == VrstaUgovora.OVERA_POTPISA){
            UgovorPotpis ugovor = new UgovorPotpis();

            ugovor.setNotar(ugovorDTO.getNotar());
            ugovor.setOveren(true);
            ugovor.setDatumOvereUgovora(LocalDateTime.now());
            ugovor.setVrstaUgovora(ugovorDTO.getVrstaUgovora());

            ugovor.setPotpis(ugovorDTO.getPotpis());

            return ugovorRepository.save(ugovor);
        }
        else{ return null;}
    }

    @Override
    public Ugovor findById(long ugovorId) {
        return null;
    }

    @Override
    public List<Ugovor> findAll() {
        return ugovorRepository.findAll();
    }


}
