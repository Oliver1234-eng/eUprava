package notar.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.entity.Notar;
import notar.model.enumeration.VrstaUgovora;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KupoprodajniUgovorDTO {

    private Long id;

    private String notar_jmbg;

    private String stari_vlasnik_jmbg;

    private String novi_vlasnik_jmbg;

    private String broj_parcele;

    private LocalDateTime datumOvere;
}
