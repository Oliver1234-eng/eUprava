package com.maticar.aplikacijazamaticara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "maticnaKnjigaUmrlih")
public class MaticnaKnjigaUmrlih {

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

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "dan_mesec_i_godina_smrti", nullable = false)
    private String danMesecIGodinaSmrti;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "cas_smrti", nullable = false)
    private String casSmrti;


    public MaticnaKnjigaUmrlih() {

    }

    public MaticnaKnjigaUmrlih(String jmbg, String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String danMesecIGodinaSmrti, String casSmrti) {
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
        this.danMesecIGodinaSmrti = danMesecIGodinaSmrti;
        this.casSmrti = casSmrti;

    }

    public MaticnaKnjigaUmrlih(String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String danMesecIGodinaSmrti, String casSmrti) {
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
        this.danMesecIGodinaSmrti = danMesecIGodinaSmrti;
        this.casSmrti = casSmrti;
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

    public String getDanMesecIGodinaSmrti() {
        return danMesecIGodinaSmrti;
    }

    public void setDanMesecIGodinaSmrti(String danMesecIGodinaSmrti) {
        this.danMesecIGodinaSmrti = danMesecIGodinaSmrti;
    }

    public String getCasSmrti() {
        return casSmrti;
    }

    public void setCasSmrti(String casSmrti) {
        this.casSmrti = casSmrti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaticnaKnjigaUmrlih r = (MaticnaKnjigaUmrlih) o;
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
        return "MaticnaKnjigaUmrlih{" +
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
                ", danMesecIGodinaSmrti='" + danMesecIGodinaSmrti + '\'' +
                ", casSmrti='" + casSmrti + '\'' +
                '}';
    }
}
