package notar.service.implementation;
import notar.model.dto.OsobaDTO;
import notar.model.dto.TerminDTO;
import notar.model.entity.Notar;
import notar.model.entity.Stranka;
import notar.repository.StrankaRepository;
import notar.repository.StrankaTerminiRepository;
import notar.service.functionality.StrankaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StrankaServiceImplementation implements StrankaService {
    @Autowired
    private StrankaRepository strankaReposisoty;
    @Autowired
    private StrankaTerminiRepository strankaTerminiRepository;

    @Override
    public Stranka createStranka(OsobaDTO strankaDTO) {
        Stranka stranka = new Stranka();

        stranka.setAdresa(strankaDTO.getAdresa());
        //stranka.setDatumRodjenja(strankaDTO.getDatumRodjenja());
        stranka.setDatumRodjenja(LocalDate.now());
        stranka.setIme(strankaDTO.getIme());
        stranka.setImeRoditelja(strankaDTO.getImeRoditelja());
        stranka.setJmbg(strankaDTO.getJmbg());
        stranka.setMestoRodjenja(strankaDTO.getMestoRodjenja());
        stranka.setPol(strankaDTO.getPol());
        stranka.setPrezime(strankaDTO.getPrezime());
        stranka.setPrezimeRoditelja(strankaDTO.getPrezimeRoditelja());
        stranka.setZanimanjeRoditelja(strankaDTO.getZanimanjeRoditelja());
        stranka.setBrojTelefona(strankaDTO.getBrojTelefona());
        stranka.setE_mail(strankaDTO.getE_mail());
        stranka.setKorisnickoIme(strankaDTO.getKorisnickoIme());
        stranka.setLozinka(strankaDTO.getLozinka());

        strankaReposisoty.save(stranka);

        return stranka;
    }

    @Override
    public List<Stranka> findAll() {
        return strankaReposisoty.findAll();
    }

    @Override
    public Stranka findById(Long id) {
        return strankaReposisoty.findById(id).orElse(null);
    }

    @Override
    public List<Stranka> findAllByIds(TerminDTO terminDTO) {
        return null;
    }

//    @Override
//    public List<Stranka> findAllByIds(TerminDTO terminDTO) {
//        List<Stranka> stranke = new ArrayList<>();
//        List<Long> ids = terminDTO.getStranka_ids();
//        System.out.println("IDS: " + ids + " size: " + ids.size());
//       for(int i = 0; i < ids.size(); i++) {
//           Stranka stranka = strankaReposisoty.findById(ids.get(i)).orElse(null);
//           if(stranka!=null){
//
//           };
//       }
//
//
//        return strankaReposisoty.findAll();
//    }
}
