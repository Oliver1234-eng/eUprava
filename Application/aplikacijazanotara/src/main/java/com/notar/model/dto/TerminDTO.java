package com.notar.model.dto;

import com.notar.model.entity.Kancelarija;
import com.notar.model.entity.Notar;
import com.notar.model.entity.Ugovor;
import com.notar.model.enumeration.StatusTermina;
import com.notar.model.enumeration.VrstaUgovora;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TerminDTO {

    private Notar notar;

    private Kancelarija kancelarija;

    private LocalDateTime datumIvremeSastanka;

    private short vremeTrajanja;

    private Ugovor ugovor;

    private VrstaUgovora vrstaUgovora;

    private StatusTermina statusTermina;

    private boolean overenUgovor;
}
