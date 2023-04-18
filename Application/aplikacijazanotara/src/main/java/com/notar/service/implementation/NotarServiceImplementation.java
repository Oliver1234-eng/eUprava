package com.notar.service.implementation;
import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Notar;
import com.notar.repository.NotarRepository;
import com.notar.service.functionality.NotarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotarServiceImplementation implements NotarService {
    @Autowired
    private NotarRepository notarRepository;

    @Override
    public Notar createNotar(RegistrovaniKorisnikDTO notarDTO) {
        return null;
    }
}
