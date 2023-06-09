package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "ugovor_o_prenosu_zemljista")
public class UgovorOPrenosuZemljista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Notar je obavezno polje!")
    @Column(name = "notar", nullable = false)
    private String notar;

    @NotBlank(message = "Vrsta ugovora je obavezno polje!")
    @Column(name = "vrsta_ugovora", nullable = false)
    private String vrstaUgovora;

    @NotBlank(message = "Datum overe je obavezno polje!")
    @Column(name = "datum_overe", nullable = false)
    private String datumOvere;

    @NotBlank(message = "Overen je obavezno polje!")
    @Column(name = "overen", nullable = false)
    private String overen;

    @NotBlank(message = "Broj parcele je obavezno polje!")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @NotBlank(message = "Stari vlasnik je obavezno polje!")
    @Column(name = "stari_vlasnik", nullable = false)
    private String stariVlasnik;

    @NotBlank(message = "Novi vlasnik je obavezno polje!")
    @Column(name = "novi_vlasnik", nullable = false)
    private String noviVlasnik;

    public UgovorOPrenosuZemljista() {

    }

    public UgovorOPrenosuZemljista(Integer id, String notar, String vrstaUgovora, String datumOvere, String overen, String brojParcele, String stariVlasnik, String noviVlasnik) {
        this.id = id;
        this.notar = notar;
        this.vrstaUgovora = vrstaUgovora;
        this.datumOvere = datumOvere;
        this.overen = overen;
        this.brojParcele = brojParcele;
        this.stariVlasnik = stariVlasnik;
        this.noviVlasnik = noviVlasnik;
    }

    public UgovorOPrenosuZemljista(String notar, String vrstaUgovora, String datumOvere, String overen, String brojParcele, String stariVlasnik, String noviVlasnik) {
        this.notar = notar;
        this.vrstaUgovora = vrstaUgovora;
        this.datumOvere = datumOvere;
        this.overen = overen;
        this.brojParcele = brojParcele;
        this.stariVlasnik = stariVlasnik;
        this.noviVlasnik = noviVlasnik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotar() {
        return notar;
    }

    public void setNotar(String notar) {
        this.notar = notar;
    }

    public String getVrstaUgovora() {
        return vrstaUgovora;
    }

    public void setVrstaUgovora(String vrstaUgovora) {
        this.vrstaUgovora = vrstaUgovora;
    }

    public String getDatumOvere() {
        return datumOvere;
    }

    public void setDatumOvere(String datumOvere) {
        this.datumOvere = datumOvere;
    }

    public String getOveren() {
        return overen;
    }

    public void setOveren(String overen) {
        this.overen = overen;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
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
        UgovorOPrenosuZemljista u = (UgovorOPrenosuZemljista) o;
        return id != null && id.equals(u.id);
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "UgovorOPrenosuZemljista{" +
                "id=" + id +
                ", notar='" + notar + '\'' +
                ", vrstaUgovora='" + vrstaUgovora + '\'' +
                ", datumOvere='" + datumOvere + '\'' +
                ", overen='" + overen + '\'' +
                ", brojParcele='" + brojParcele + '\'' +
                ", stariVlasnik='" + stariVlasnik + '\'' +
                ", noviVlasnik='" + noviVlasnik + '\'' +
                '}';
    }
}
