package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "nepokretnost")
public class Nepokretnost {

    @Id
    @NotBlank(message = "Broj parcele je obavezno polje!")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @NotBlank(message = "Adresa je obavezno polje!")
    @Column(name = "adresa", nullable = false)
    private String adresa;

    @Column(name = "broj_dela_parcele", nullable = false)
    private int brojDelaParcele;

    @Column(name = "povrsina", nullable = false)
    private double povrsina;

    @NotBlank(message = "Potes je obavezno polje!")
    @Column(name = "potes", nullable = false)
    private String potes;

    @Enumerated(EnumType.STRING)
    @Column(name = "nacin_koriscenja_zemljista", nullable = false)
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;

    @Enumerated(EnumType.STRING)
    @Column(name = "nacin_koriscenja_objekta", nullable = false)
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;

    @NotBlank(message = "Katastar je obavezno polje!")
    @Column(name = "katastar", nullable = false)
    private String katastar;

    @NotBlank(message = "Stari vlasnik je obavezno polje!")
    @Column(name = "stari_vlasnik", nullable = false)
    private String stariVlasnik;

    @NotBlank(message = "Novi vlasnik je obavezno polje!")
    @Column(name = "novi_vlasnik", nullable = false)
    private String noviVlasnik;

    public Nepokretnost() {

    }

    public Nepokretnost(String brojParcele, String adresa, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta, String katastar, String stariVlasnik, String noviVlasnik) {
        this.brojParcele = brojParcele;
        this.adresa = adresa;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
        this.katastar = katastar;
        this.stariVlasnik = stariVlasnik;
        this.noviVlasnik = noviVlasnik;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBrojDelaParcele() {
        return brojDelaParcele;
    }

    public void setBrojDelaParcele(int brojDelaParcele) {
        this.brojDelaParcele = brojDelaParcele;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public String getPotes() {
        return potes;
    }

    public void setPotes(String potes) {
        this.potes = potes;
    }

    public NacinKoriscenjaZemljista getNacinKoriscenjaZemljista() {
        return nacinKoriscenjaZemljista;
    }

    public void setNacinKoriscenjaZemljista(NacinKoriscenjaZemljista nacinKoriscenjaZemljista) {
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
    }

    public NacinKoriscenjaObjekta getNacinKoriscenjaObjekta() {
        return nacinKoriscenjaObjekta;
    }

    public void setNacinKoriscenjaObjekta(NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
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
        Nepokretnost n = (Nepokretnost) o;
        return brojParcele != null && brojParcele.equals(n.getBrojParcele());
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "Nepokretnost{" +
                "brojParcele='" + brojParcele + '\'' +
                ", adresa='" + adresa + '\'' +
                ", brojDelaParcele=" + brojDelaParcele +
                ", povrsina=" + povrsina +
                ", potes='" + potes + '\'' +
                ", nacinKoriscenjaZemljista=" + nacinKoriscenjaZemljista +
                ", nacinKoriscenjaObjekta=" + nacinKoriscenjaObjekta +
                ", katastar='" + katastar + '\'' +
                ", stariVlasnik='" + stariVlasnik + '\'' +
                ", noviVlasnik='" + noviVlasnik + '\'' +
                '}';
    }
}
