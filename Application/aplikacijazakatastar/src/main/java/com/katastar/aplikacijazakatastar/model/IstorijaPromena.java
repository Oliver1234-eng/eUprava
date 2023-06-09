package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "istorijapromena")
public class IstorijaPromena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Datum promene je obavezno polje!")
    @Column(name = "datum_promene", nullable = false)
    private String datumPromene;

    @NotBlank(message = "Broj parcele je obavezno polje!")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @NotBlank(message = "Katastar je obavezno polje!")
    @Column(name = "katastar", nullable = false)
    private String katastar;

    @NotBlank(message = "Stari vlasnik je obavezno polje!")
    @Column(name = "stari_vlasnik", nullable = false)
    private String stariVlasnik;

    @NotBlank(message = "Novi vlasnik je obavezno polje!")
    @Column(name = "novi_vlasnik", nullable = false)
    private String noviVlasnik;

    public IstorijaPromena() {

    }

    public IstorijaPromena(Integer id, String datumPromene, String brojParcele, String katastar, String stariVlasnik, String noviVlasnik) {
        this.id = id;
        this.datumPromene = datumPromene;
        this.brojParcele = brojParcele;
        this.katastar = katastar;
        this.stariVlasnik = stariVlasnik;
        this.noviVlasnik = noviVlasnik;
    }

    public IstorijaPromena(String datumPromene, String brojParcele, String katastar, String stariVlasnik, String noviVlasnik) {
        this.datumPromene = datumPromene;
        this.brojParcele = brojParcele;
        this.katastar = katastar;
        this.stariVlasnik = stariVlasnik;
        this.noviVlasnik = noviVlasnik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatumPromene() {
        return datumPromene;
    }

    public void setDatumPromene(String datumPromene) {
        this.datumPromene = datumPromene;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }

    public String getKatastar() {
        return katastar;
    }

    public void setKatastar(String katastar) {
        this.katastar = katastar;
    }

    public String getStariVlasnik() {
        return stariVlasnik;
    }

    public void setStariVlasnik(String stariVlasnik) {
        this.stariVlasnik = stariVlasnik;
    }

    public String getNoviVlasnik() {
        return noviVlasnik;
    }

    public void setNoviVlasnik(String noviVlasnik) {
        this.noviVlasnik = noviVlasnik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IstorijaPromena i = (IstorijaPromena) o;
        return id != null && id.equals(i.getId());
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "IstorijaPromena{" +
                "id=" + id +
                ", datumPromene='" + datumPromene + '\'' +
                ", brojParcele='" + brojParcele + '\'' +
                ", katastar='" + katastar + '\'' +
                ", stariVlasnik='" + stariVlasnik + '\'' +
                ", noviVlasnik='" + noviVlasnik + '\'' +
                '}';
    }
}

