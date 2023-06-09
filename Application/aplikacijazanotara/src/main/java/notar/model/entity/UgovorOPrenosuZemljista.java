package notar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.enumeration.VrstaUgovora;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UgovorOPrenosuZemljista extends Ugovor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = true)
    private Long id;

    @Column(name = "broj_parcele", nullable = true)
    private String brojParcele;

    @Column(name = "stari_vlasnik", nullable = true)
    private String stariVlasnik;

    @Column(name = "novi_vlasnik", nullable = true)
    private String noviVlasnik;

}
