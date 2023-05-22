package notar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.enumeration.VrstaUgovora;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ugovori")
public class Ugovor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @JoinColumn(name = "notar_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Notar notar;

    @Column
    @Enumerated(EnumType.STRING)
    private VrstaUgovora vrstaUgovora;

    @Column
    private LocalDateTime datumOvereUgovora;

    @Column
    private boolean overen;

   // private List<Stranka> stranke;

   // private List<Svedok> svedoci;
}

