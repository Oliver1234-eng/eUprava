package com.maticar.aplikacijazamaticara.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "maticnaKnjigaRodjenih")
public class MaticnaKnjigaRodjenih {

    @Id
    @NotBlank(message = "JMBG je obavezno polje!")
    @Column(name = "jmbg", nullable = false)
    private String jmbg;

    @NotBlank(message = "Ime je obavezno polje!")
    @Column(name = "ime", nullable = false)
    private String ime;

    @NotBlank(message = "Prezime je obavezno polje!")
    @Column(name = "prezime", nullable = false)
    private String prezime;

    @Column(name = "adresa_rodjenja", nullable = false)
    private String adresaRodjenja;

    @NotBlank(message = "Mesto rodjenja je obavezno polje!")
    @Column(name = "ime_oca", nullable = false)
    private String imeOca;

    @NotBlank(message = "Ime roditelja je obavezno polje!")
    @Column(name = "prezime_oca", nullable = false)
    private String prezimeOca;

    @NotBlank(message = "Adresa je obavezno polje!")
    @Column(name = "zanimanje_oca", nullable = false)
    private String zanimanjeOca;

    @Column(name = "ime_majke", nullable = false)
    private String imeMajke;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "prezime_majke", nullable = false)
    private String prezimeMajke;

    @Column(name = "zanimanje_majke", nullable = false)
    private String zanimanjeMajke;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "drzavljanstvo", nullable = false)
    private String drzavljanstvo;

    @Column(name = "jmbg_oca", nullable = false)
    private String jmbgOca;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "jmbg_majke", nullable = false)
    private String jmbgMajke;

    @Column(name = "mesto_i_opstina_rodjenja", nullable = false)
    private String mestoIOpstinaRodjenja;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "drzava_odjenja", nullable = false)
    private String drzavaRodjenja;

    @Column(name = "dan_mesec_godina_i_vreme_rodjenja", nullable = false)
    private String danMesecGodinaIVremeRodjenja;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "roditelji", nullable = false)
    private String roditelji;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "deca", nullable = false)
    private String deca;

    public MaticnaKnjigaRodjenih() {

    }

    public MaticnaKnjigaRodjenih(String jmbg, String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String mestoIOpstinaRodjenja, String drzavaRodjenja, String danMesecGodinaIVremeRodjenja, String roditelji, String deca) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.adresaRodjenja = adresaRodjenja;
        this.imeOca = imeOca;
        this.prezimeOca = prezimeOca;
        this.zanimanjeOca = zanimanjeOca;
        this.imeMajke = imeMajke;
        this.prezimeMajke = prezimeMajke;
        this.zanimanjeMajke = zanimanjeMajke;
        this.drzavljanstvo = drzavljanstvo;
        this.jmbgOca = jmbgOca;
        this.jmbgMajke = jmbgMajke;
        this.mestoIOpstinaRodjenja = mestoIOpstinaRodjenja;
        this.drzavaRodjenja = drzavaRodjenja;
        this.danMesecGodinaIVremeRodjenja = danMesecGodinaIVremeRodjenja;
        this.roditelji = roditelji;
        this.deca = deca;
    }

    public MaticnaKnjigaRodjenih(String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String mestoIOpstinaRodjenja, String drzavaRodjenja, String danMesecGodinaIVremeRodjenja, String roditelji, String deca) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresaRodjenja = adresaRodjenja;
        this.imeOca = imeOca;
        this.prezimeOca = prezimeOca;
        this.zanimanjeOca = zanimanjeOca;
        this.imeMajke = imeMajke;
        this.prezimeMajke = prezimeMajke;
        this.zanimanjeMajke = zanimanjeMajke;
        this.drzavljanstvo = drzavljanstvo;
        this.jmbgOca = jmbgOca;
        this.jmbgMajke = jmbgMajke;
        this.mestoIOpstinaRodjenja = mestoIOpstinaRodjenja;
        this.drzavaRodjenja = drzavaRodjenja;
        this.danMesecGodinaIVremeRodjenja = danMesecGodinaIVremeRodjenja;
        this.roditelji = roditelji;
        this.deca = deca;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
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

    public String getAdresaRodjenja() {
        return adresaRodjenja;
    }

    public void setAdresaRodjenja(String adresaRodjenja) {
        this.adresaRodjenja = adresaRodjenja;
    }

    public String getImeOca() {
        return imeOca;
    }

    public void setImeOca(String imeOca) {
        this.imeOca = imeOca;
    }

    public String getPrezimeOca() {
        return prezimeOca;
    }

    public void setPrezimeOca(String prezimeOca) {
        this.prezimeOca = prezimeOca;
    }

    public String getZanimanjeOca() {
        return zanimanjeOca;
    }

    public void setZanimanjeOca(String zanimanjeOca) {
        this.zanimanjeOca = zanimanjeOca;
    }

    public String getImeMajke() {
        return imeMajke;
    }

    public void setImeMajke(String imeMajke) {
        this.imeMajke = imeMajke;
    }

    public String getPrezimeMajke() {
        return prezimeMajke;
    }

    public void setPrezimeMajke(String prezimeMajke) {
        this.prezimeMajke = prezimeMajke;
    }

    public String getZanimanjeMajke() {
        return zanimanjeMajke;
    }

    public void setZanimanjeMajke(String zanimanjeMajke) {
        this.zanimanjeMajke = zanimanjeMajke;
    }

    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(String drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }

    public String getJmbgOca() {
        return jmbgOca;
    }

    public void setJmbgOca(String jmbgOca) {
        this.jmbgOca = jmbgOca;
    }

    public String getJmbgMajke() {
        return jmbgMajke;
    }

    public void setJmbgMajke(String jmbgMajke) {
        this.jmbgMajke = jmbgMajke;
    }

    public String getMestoIOpstinaRodjenja() {
        return mestoIOpstinaRodjenja;
    }

    public void setMestoIOpstinaRodjenja(String mestoIOpstinaRodjenja) {
        this.mestoIOpstinaRodjenja = mestoIOpstinaRodjenja;
    }

    public String getDrzavaRodjenja() {
        return drzavaRodjenja;
    }

    public void setDrzavaRodjenja(String drzavaRodjenja) {
        this.drzavaRodjenja = drzavaRodjenja;
    }

    public String getDanMesecGodinaIVremeRodjenja() {
        return danMesecGodinaIVremeRodjenja;
    }

    public void setDanMesecGodinaIVremeRodjenja(String danMesecGodinaIVremeRodjenja) {
        this.danMesecGodinaIVremeRodjenja = danMesecGodinaIVremeRodjenja;
    }

    public String getRoditelji() {
        return roditelji;
    }

    public void setRoditelji(String roditelji) {
        this.roditelji = roditelji;
    }

    public String getDeca() {
        return deca;
    }

    public void setDeca(String deca) {
        this.deca = deca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaticnaKnjigaRodjenih r = (MaticnaKnjigaRodjenih) o;
        if (r.jmbg == null || jmbg == null) {
            return false;
        }
        return Objects.equals(jmbg, r.jmbg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(jmbg);
    }

    @Override
    public String toString() {
        return "MaticnaKnjigaRodjenih{" +
                "jmbg='" + jmbg + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresaRodjenja=" + adresaRodjenja +
                ", imeOca=" + imeOca +
                ", prezimeOca='" + prezimeOca + '\'' +
                ", zanimanjeOca='" + zanimanjeOca + '\'' +
                ", imeMajke='" + imeMajke + '\'' +
                ", prezimeMajke='" + prezimeMajke + '\'' +
                ", zanimanjeMajke='" + zanimanjeMajke + '\'' +
                ", drzavljanstvo='" + drzavljanstvo + '\'' +
                ", jmbgOca='" + jmbgOca + '\'' +
                ", jmbgMajke='" + jmbgMajke + '\'' +
                ", mestoIOpstinaRodjenja='" + mestoIOpstinaRodjenja + '\'' +
                ", drzavaRodjenja='" + drzavaRodjenja + '\'' +
                ", danMesecGodinaIVremeRodjenja='" + danMesecGodinaIVremeRodjenja + '\'' +
                ", roditelji='" + roditelji + '\'' +
                ", deca='" + deca + '\'' +
                '}';
    }
}
