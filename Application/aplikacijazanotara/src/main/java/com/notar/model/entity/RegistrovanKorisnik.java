package com.notar.model.entity;

import javax.persistence.Column;

public abstract class RegistrovanKorisnik extends Osoba {
    @Column(unique = true)
    protected String korisnickoIme;
    @Column
    protected String lozinka;
    @Column(unique = true)
    protected String e_mail;

    @Column(unique = true)
    protected String brojTelefona;

}
