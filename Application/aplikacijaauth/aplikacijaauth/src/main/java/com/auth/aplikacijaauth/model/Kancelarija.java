package com.auth.aplikacijaauth.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kancelarija")
public class Kancelarija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "broj_kancelarije", nullable = false)
    private int brojKancelarije;

    @Column(name = "kapacitet", nullable = false)
    private int kapacitet;

    public Kancelarija() {

    }

    public Kancelarija(Integer id, int brojKancelarije, int kapacitet) {
        this.id = id;
        this.brojKancelarije = brojKancelarije;
        this.kapacitet = kapacitet;
    }

    public Kancelarija(int brojKancelarije, int kapacitet) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Kancelarija k = (Kancelarija) o;
        if (k.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, k.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}