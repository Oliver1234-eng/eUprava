package notar.service.implementation;

import notar.model.dto.UgovorDTO;
import notar.model.entity.Ugovor;
import notar.repository.UgovorRepository;
import notar.service.functionality.UgovorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UgovorServiceImplementation implements UgovorService {
    @Autowired
    private UgovorRepository ugovorRepository;

    @Override
    public Ugovor createUgovor(UgovorDTO ugovorDTO) {
        return null;
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
