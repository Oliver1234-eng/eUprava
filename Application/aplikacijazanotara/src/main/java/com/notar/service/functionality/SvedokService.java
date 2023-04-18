package com.notar.service.functionality;

import com.notar.model.dto.RegistrovaniKorisnikDTO;
import com.notar.model.entity.Svedok;

public interface SvedokService {

    public Svedok createSvedok(RegistrovaniKorisnikDTO svedokDTO);

}
