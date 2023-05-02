package notar.service.implementation;
import notar.model.dto.OsobaDTO;
import notar.model.entity.Notar;
import notar.repository.NotarRepository;
import notar.service.functionality.NotarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NotarServiceImplementation implements NotarService {
    @Autowired
    private NotarRepository notarRepository;


    @Override
    public Notar createNotar(OsobaDTO notarDTO) {
        Notar notar = new Notar();

        notar.setAdresa(notarDTO.getAdresa());
        //notar.setDatumRodjenja(notarDTO.getDatumRodjenja());
        notar.setDatumRodjenja(LocalDate.now());
        notar.setIme(notarDTO.getIme());
        notar.setImeRoditelja(notarDTO.getImeRoditelja());
        notar.setJmbg(notarDTO.getJmbg());
        notar.setMestoRodjenja(notarDTO.getMestoRodjenja());
        notar.setPol(notarDTO.getPol());
        notar.setPrezime(notarDTO.getPrezime());
        notar.setPrezimeRoditelja(notarDTO.getPrezimeRoditelja());
        notar.setZanimanjeRoditelja(notarDTO.getZanimanjeRoditelja());
        notar.setBrojTelefona(notarDTO.getBrojTelefona());
        notar.setE_mail(notarDTO.getE_mail());
        notar.setKorisnickoIme(notarDTO.getKorisnickoIme());
        notar.setLozinka(notarDTO.getLozinka());

        notarRepository.save(notar);

        return notar;
    }

    @Override
    public List<Notar> findAll() {
        return notarRepository.findAll();
    }

    @Override
    public Notar findById(Long id) {
        return notarRepository.findById(id).orElse(null);
    }
}
