package com.maticar.aplikacijazamaticara.dto;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaUmrlih;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class MaticnaKnjigaUmrlihDTO {

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

    private String danMesecIGodinaSmrti;

    private String casSmrti;


    public MaticnaKnjigaUmrlihDTO() {

    }

    public MaticnaKnjigaUmrlihDTO(MaticnaKnjigaUmrlih umrli) {
        this(umrli.getJmbg(), umrli.getIme(), umrli.getPrezime(), umrli.getAdresaRodjenja(),
                umrli.getImeOca(), umrli.getPrezimeOca(), umrli.getZanimanjeOca(),
                umrli.getImeMajke(), umrli.getPrezimeMajke(), umrli.getZanimanjeMajke(),
                umrli.getDrzavljanstvo(), umrli.getJmbgOca(), umrli.getJmbgMajke(),
                umrli.getDanMesecIGodinaSmrti(), umrli.getCasSmrti());
    }

    public MaticnaKnjigaUmrlihDTO(String jmbg, String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String danMesecIGodinaSmrti, String casSmrti) {
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

    public MaticnaKnjigaUmrlihDTO(String ime, String prezime, String adresaRodjenja, String imeOca, String prezimeOca, String zanimanjeOca, String imeMajke, String prezimeMajke, String zanimanjeMajke, String drzavljanstvo, String jmbgOca, String jmbgMajke, String danMesecIGodinaSmrti, String casSmrti) {
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
}
