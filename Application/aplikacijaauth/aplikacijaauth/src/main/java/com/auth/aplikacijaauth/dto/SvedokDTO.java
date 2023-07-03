package com.auth.aplikacijaauth.dto;

import com.auth.aplikacijaauth.model.Svedok;

public class SvedokDTO {

    private Integer id;
    private String ime;
    private String prezime;
    private String jmbg;
    private String adresa;

    public SvedokDTO() {

    }

    public SvedokDTO(Svedok svedok) {
        this(svedok.getId(), svedok.getIme(), svedok.getPrezime(),
                svedok.getJmbg(), svedok.getAdresa());
    }

    public SvedokDTO(Integer id, String ime, String prezime, String jmbg, String adresa) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.adresa = adresa;
    }

    public SvedokDTO(String ime, String prezime, String jmbg, String adresa) {
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
}