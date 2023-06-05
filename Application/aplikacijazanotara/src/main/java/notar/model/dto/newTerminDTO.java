package notar.model.dto;

import notar.model.entity.Kancelarija;
import notar.model.entity.Notar;
import notar.model.entity.Ugovor;
import notar.model.enumeration.StatusTermina;
import notar.model.enumeration.VrstaUgovora;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class newTerminDTO {

    private String datum;
    private String vreme;
    private String kancelarija;

}
