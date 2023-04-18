package com.notar.service.functionality;

import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Notar;

public interface NotarService {

    public Notar createNotar(RegistrovaniKorisnikDTO notarDTO);

}
