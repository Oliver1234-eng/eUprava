package notar.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.enumeration.StatusTermina;
import notar.model.enumeration.VrstaUgovora;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "termini")
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "kancelarija_id", referencedColumnName = "id", nullable = false)
    private Kancelarija kancelarija;

    @Column
    private LocalDateTime datumIvremeSastanka;
    @Column
    private short vremeTrajanja;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ugovor_id", referencedColumnName = "id", nullable = true)
    private  Ugovor ugovor;

    @JsonIgnore
    @ManyToMany(mappedBy = "svedok_termin")
    List<Svedok> svedoci;
    @JsonIgnore
    @ManyToMany(mappedBy = "stranka_termin")
    List<Stranka> stranke;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "notar_id", referencedColumnName = "id", nullable = true)
    private Notar notar;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stranka_id", referencedColumnName = "id", nullable = true)
    private Stranka stranka;

    @Column
    @Enumerated(EnumType.STRING)
    private VrstaUgovora vrstaUgovora;

    @Column
    @Enumerated(EnumType.STRING)
    private StatusTermina statusTermina;

    @Column
    private boolean overenUgovor;

}
