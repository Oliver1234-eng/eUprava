package notar.model.dto;

import notar.model.entity.Notar;
import notar.model.enumeration.VrstaUgovora;
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

    private Long id;
    private Notar notar;

    private VrstaUgovora vrstaUgovora;

    private LocalDateTime datumOvereUgovora;

    private boolean overen;



}
