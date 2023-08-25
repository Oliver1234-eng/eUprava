package notar.model.dto;

import notar.model.entity.Kancelarija;
import notar.model.entity.Notar;
import notar.model.entity.Stranka;
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
public class TerminDTO {

    private long id;

    private long notar_id;

    private long kancelarija_id;

    private LocalDateTime datumIvremeSastanka;

    private short vremeTrajanja;

    private long ugovor_id;

    private VrstaUgovora vrstaUgovora;

    private StatusTermina statusTermina;

    private boolean overenUgovor;

    private String stranka_id;

    private List<Long> svedok_ids;
}
