package com.auth.aplikacijaauth.dto;

import com.auth.aplikacijaauth.model.Kancelarija;

public class KancelarijaDTO {

    private Integer id;
    private int brojKancelarije;
    private int kapacitet;

    public KancelarijaDTO() {

    }

    public KancelarijaDTO(Kancelarija kancelarija) {
        this(kancelarija.getId(), kancelarija.getBrojKancelarije(), kancelarija.getKapacitet());
    }

    public KancelarijaDTO(Integer id, int brojKancelarije, int kapacitet) {
        super();
        this.id = id;
        this.brojKancelarije = brojKancelarije;
        this.kapacitet = kapacitet;
    }

    public KancelarijaDTO(int brojKancelarije, int kapacitet) {
        this.brojKancelarije = brojKancelarije;
        this.kapacitet = kapacitet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getBrojKancelarije() {
        return brojKancelarije;
    }

    public void setBrojKancelarije(int brojKancelarije) {
        this.brojKancelarije = brojKancelarije;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }
}