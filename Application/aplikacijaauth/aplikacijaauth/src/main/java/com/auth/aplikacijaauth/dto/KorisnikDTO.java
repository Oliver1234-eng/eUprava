package com.auth.aplikacijaauth.dto;

import com.auth.aplikacijaauth.model.Korisnik;
import com.auth.aplikacijaauth.model.Pol;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class KorisnikDTO {

    private Integer id;

    @NotBlank
    private String korisnickoIme;

    @NotBlank
    private String lozinka;

    private String jmbg;
    private String ime;
    private String prezime;
    private Pol pol;
    private LocalDate datumRodjenja;
    private String mestoRodjenja;
    private String imeRoditelja;
    private String prezimeRoditelja;
    private String adresa;
    private String zanimanjeRoditelja;

    public KorisnikDTO() {

    }

    public KorisnikDTO(Korisnik korisnik) {
        this(korisnik.getId(), korisnik.getKorisnickoIme(), korisnik.getLozinka(), korisnik.getJmbg(),
                korisnik.getIme(), korisnik.getPrezime(), korisnik.getPol(), korisnik.getDatumRodjenja(),
                korisnik.getMestoRodjenja(), korisnik.getImeRoditelja(), korisnik.getPrezimeRoditelja(),
                korisnik.getAdresa(), korisnik.getZanimanjeRoditelja());
    }

    public KorisnikDTO(Integer id, String korisnickoIme, String lozinka, String jmbg, String ime, String prezime, Pol pol, LocalDate datumRodjenja, String mestoRodjenja, String imeRoditelja, String prezimeRoditelja, String adresa, String zanimanjeRoditelja) {
        this.id = id;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.prezimeRoditelja = prezimeRoditelja;
        this.adresa = adresa;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public KorisnikDTO(String korisnickoIme, String lozinka, String jmbg, String ime, String prezime, Pol pol, LocalDate datumRodjenja, String mestoRodjenja, String imeRoditelja, String prezimeRoditelja, String adresa, String zanimanjeRoditelja) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.prezimeRoditelja = prezimeRoditelja;
        this.adresa = adresa;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
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

    public String getPrezimeRoditelja() {
        return prezimeRoditelja;
    }

    public void setPrezimeRoditelja(String prezimeRoditelja) {
        this.prezimeRoditelja = prezimeRoditelja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(String zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }
}