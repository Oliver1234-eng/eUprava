package com.notar.model.entity;

import com.notar.model.enumeration.Pol;

import javax.persistence.*;
import java.time.LocalDate;


abstract class Osoba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    protected String jmbg;
    @Column
    protected String ime;
    @Column
    protected String prezime;
    @Column
    @Enumerated(EnumType.STRING)
    protected Pol pol;
    @Column
    protected LocalDate datumRodjenja;
    @Column
    protected String mestoRodjenja;
    @Column
    protected String imeRoditelja;
    @Column
    protected String prezimeRoditelja;
    @Column
    protected String zanimanjeRoditelja;
    @Column
    protected String adresa;



}
