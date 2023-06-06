package notar.model.dto;

import notar.model.entity.Notar;
import notar.model.entity.Termin;
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

    private String brojUgovora;

    private Notar notar;

    private Termin termin;

    private VrstaUgovora vrstaUgovora;

    private LocalDateTime datumIvremeSastanka;

    private boolean overen;

    private String potpis;

    private String dokument;

    private String brojParcele;

    private String stariVlasnik;

    private String noviVlasnik;
}
