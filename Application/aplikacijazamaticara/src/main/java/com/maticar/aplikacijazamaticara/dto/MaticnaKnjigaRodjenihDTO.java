package com.maticar.aplikacijazamaticara.dto;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class MaticnaKnjigaRodjenihDTO {

    private String jmbg;

    private String ime;

    private String prezime;

    private String adresaRodjenja;

    private String imeOca;

    private String prezimeOca;

    private String zanimanjeOca;

    private String imeMajke;

    private String prezimeMajke;

    private String zanimanjeMajke;

    private String drzavljanstvo;

    private String jmbgOca;

    private String jmbgMajke;

    private String mestoIOpstinaRodjenja;

    private String drzavaRodjenja;

    private String danMesecGodinaIVremeRodjenja;

    private String roditelji;

    private String deca;

    public MaticnaKnjigaRodjenihDTO() {

    }

    public MaticnaKnjigaRodjenihDTO(MaticnaKnjigaRodjenih rodjeni) {
        this(rodjeni.getJmbg(), rodjeni.getIme(), rodjeni.getPrezime(), rodjeni.getAdresaRodjenja(),
                rodjeni.getImeOca(), rodjeni.getPrezimeOca(), rodjeni.getZanimanjeOca(),
                rodjeni.getImeMajke(), rodjeni.getPrezimeMajke(), rodjeni.getZanimanjeMajke(),
                rodjeni.getDrzavljanstvo(), rodjeni.getJmbgOca(), rodjeni.getJmbgMajke(),
                rodjeni.getMestoIOpstinaRodjenja(), rodjeni.getDrzavaRodjenja(), rodjeni.getDanMesecGodinaIVremeRodjenja(),
                rodjeni.getRoditelji(), rodjeni.getDeca());
    }

    public MaticnaKnjigaRodjenihDTO(String jmbg, String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String mestoIOpstinaRodjenja, String drzavaRodjenja, String danMesecGodinaIVremeRodjenja, String roditelji, String deca) {
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

    public MaticnaKnjigaRodjenihDTO(String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String mestoIOpstinaRodjenja, String drzavaRodjenja, String danMesecGodinaIVremeRodjenja, String roditelji, String deca) {
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
}
