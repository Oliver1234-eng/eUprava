package com.notar.service.implementation;
import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Stranka;
import com.notar.repository.StrankaRepository;
import com.notar.service.functionality.StrankaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrankaServiceImplementation implements StrankaService {
    @Autowired
    private StrankaRepository strankaReposisoty;

    @Override
    public Stranka createStranka(RegistrovaniKorisnikDTO strankaDTO) {
        return null;
    }
}
