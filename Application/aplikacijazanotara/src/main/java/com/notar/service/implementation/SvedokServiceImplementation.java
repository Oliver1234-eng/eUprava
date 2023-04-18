package com.notar.service.implementation;

import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Svedok;
import com.notar.service.functionality.SvedokService;
import org.springframework.stereotype.Service;

@Service
public class SvedokServiceImplementation implements SvedokService {
    @Override
    public Svedok createSvedok(RegistrovaniKorisnikDTO svedokDTO) {
        return null;
    }
}
