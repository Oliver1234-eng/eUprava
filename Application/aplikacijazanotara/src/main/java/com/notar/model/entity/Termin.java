package com.notar.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.notar.model.enumeration.StatusTermina;
import com.notar.model.enumeration.VrstaUgovora;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "notar_jmbg", referencedColumnName = "jmbg", nullable = false)
    private Notar notar;

    @OneToOne(fetch = FetchType.EAGER)
    @Column
    @JoinColumn(name = "kancelarija_id", referencedColumnName = "id", nullable = false)
    private Kancelarija kancelarija;

    @Column
    private LocalDateTime datumIvremeSastanka;
    @Column
    private short vremeTrajanja;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ugovor_id", referencedColumnName = "id", nullable = false)
    private  Ugovor ugovor;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "strankaTermin")
    private Set<Stranka> stranke;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "svedokTermin")
    private Set<Svedok> svedoci;

    @Column
    @Enumerated(EnumType.STRING)
    private VrstaUgovora vrstaUgovora;

    @Column
    @Enumerated(EnumType.STRING)
    private StatusTermina statusTermina;

    @Column
    private boolean overenUgovor;
}
