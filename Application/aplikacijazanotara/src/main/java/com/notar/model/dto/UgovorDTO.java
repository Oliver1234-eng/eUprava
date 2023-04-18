package com.notar.model.dto;

import com.notar.model.entity.Notar;
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
public class UgovorDTO {

    private String brojUgovora;

    private Notar notar;

    private VrstaUgovora vrstaUgovora;

    private LocalDateTime datumOvereUgovora;

    private boolean overen;

}
