package notar.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.entity.Notar;
import notar.model.entity.UgovorOPrenosuZemljista;
import notar.model.enumeration.VrstaUgovora;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UgovorOPrenosuZemljistaDTO {

    private Long id;
    private Notar notar;
    private VrstaUgovora vrstaUgovora;
    private LocalDateTime datumOvere;
    private boolean overen;
    private String brojParcele;
    private String stariVlasnik;
    private String noviVlasnik;
}
