package com.auth.aplikacijaauth.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "svedok")
public class Svedok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name cannot be null")
    @Column(name = "ime", nullable = false)
    private String ime;

    @NotBlank(message = "Surname cannot be null")
    @Column(name = "prezime", nullable = false)
    private String prezime;

    @NotBlank(message = "JMBG cannot be null")
    @Column(name = "jmbg", nullable = false)
    private String jmbg;

    @NotBlank(message = "Address cannot be null")
    @Column(name = "adresa", nullable = false)
    private String adresa;

    public Svedok() {
        super();
    }

    public Svedok(Integer id, String ime, String prezime, String jmbg, String adresa) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.adresa = adresa;
    }

    public Svedok(String ime, String prezime, String jmbg, String adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.adresa = adresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Svedok s = (Svedok) o;
        if (s.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, s.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}