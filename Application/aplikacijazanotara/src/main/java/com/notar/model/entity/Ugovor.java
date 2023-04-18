package com.notar.model.entity;

import com.notar.model.enumeration.VrstaUgovora;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
    private String brojUgovora;

    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Notar notar;

    @Column
    @Enumerated(EnumType.STRING)
    private VrstaUgovora vrstaUgovora;

    private ArrayList<Stranka> stranke;

    private ArrayList<Svedok> svedoci;

    @Column
    private LocalDateTime datumOvereUgovora;

    @Column
    private boolean overen;
}
