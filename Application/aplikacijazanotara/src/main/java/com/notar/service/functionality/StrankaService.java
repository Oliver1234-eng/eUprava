package com.notar.service.functionality;

import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Stranka;

public interface StrankaService {

    public Stranka createStranka(RegistrovaniKorisnikDTO strankaDTO);

}
