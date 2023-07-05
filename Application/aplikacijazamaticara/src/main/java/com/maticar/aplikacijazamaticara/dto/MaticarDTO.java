package com.maticar.aplikacijazamaticara.dto;

import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.model.Pol;

public class MaticarDTO {
    private String jmbg;
    private String ime;
    private String prezime;
    private Pol pol;
    private String datumRodjenja;
    private String mestoRodjenja;
    private String imeRoditelja;
    private String adresa;
    private String korisnickoIme;
    private String lozinka;

    public MaticarDTO() {

    }

    public MaticarDTO(Maticar maticar) {
        this(maticar.getJmbg(), maticar.getIme(), maticar.getPrezime(), maticar.getPol(),
                maticar.getDatumRodjenja(), maticar.getMestoRodjenja(), maticar.getImeRoditelja(),
                maticar.getAdresa(), maticar.getKorisnickoIme(), maticar.getLozinka());
    }

    public MaticarDTO(String jmbg, String ime, String prezime, Pol pol, String datumRodjenja, String mestoRodjenja, String imeRoditelja, String adresa, String korisnickoIme, String lozinka) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.adresa = adresa;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public MaticarDTO(String ime, String prezime, Pol pol, String datumRodjenja, String mestoRodjenja, String imeRoditelja, String adresa, String korisnickoIme, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.adresa = adresa;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
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

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getMestoRodjenja() {
        return mestoRodjenja;
    }

    public void setMestoRodjenja(String mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
}
