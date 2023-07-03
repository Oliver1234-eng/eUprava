package com.auth.aplikacijaauth.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "nepokretnost")
public class Nepokretnost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Address cannot be null")
    @Column(name = "adresa", nullable = false, unique = true)
    private String adresa;

    @NotBlank(message = "Plot of land cannot be null")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @Column(name = "broj_dela_parcele", nullable = false)
    private int brojDelaParcele;

    @Column(name = "povrsina", nullable = false)
    private double povrsina;

    @NotBlank(message = "Move cannot be null")
    @Column(name = "potes", nullable = false)
    private String potes;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;

    public Nepokretnost() {
        super();
    }

    public Nepokretnost(Integer id, String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.id = id;
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
    }

    public Nepokretnost(String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nepokretnost n = (Nepokretnost) o;
        if (n.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, n.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Nepokretnost{" +
                "id=" + id +
                ", adresa='" + adresa + '\'' +
                ", brojParcele='" + brojParcele + '\'' +
                ", brojDelaParcele=" + brojDelaParcele +
                ", povrsina=" + povrsina +
                ", potes='" + potes + '\'' +
                ", nacinKoriscenjaZemljista=" + nacinKoriscenjaZemljista +
                ", nacinKoriscenjaObjekta=" + nacinKoriscenjaObjekta +
                '}';
    }
}