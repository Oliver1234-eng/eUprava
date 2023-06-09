package com.katastar.aplikacijazakatastar.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "katastar")
public class Katastar {

    @NotBlank(message = "JMBG je obavezno polje!")
    @Column(name = "jmbg", nullable = false)
    private String jmbg;

    @NotBlank(message = "Ime je obavezno polje!")
    @Column(name = "ime", nullable = false)
    private String ime;

    @NotBlank(message = "Prezime je obavezno polje!")
    @Column(name = "prezime", nullable = false)
    private String prezime;

    @Enumerated(EnumType.STRING)
    @Column(name = "pol", nullable = false)
    private Pol pol;

    @Column(name = "datum_rodjenja", nullable = false)
    private String datumRodjenja;

    @NotBlank(message = "Mesto rodjenja je obavezno polje!")
    @Column(name = "mesto_rodjenja", nullable = false)
    private String mestoRodjenja;

    @NotBlank(message = "Ime roditelja je obavezno polje!")
    @Column(name = "ime_roditelja", nullable = false)
    private String imeRoditelja;

    @NotBlank(message = "Adresa je obavezno polje!")
    @Column(name = "adresa", nullable = false)
    private String adresa;

    @Id
    @Column(name = "korisnicko_ime", nullable = false)
    private String korisnickoIme;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "lozinka", nullable = false)
    private String lozinka;

    public Katastar() {

    }

    public Katastar(String jmbg, String ime, String prezime, Pol pol, String datumRodjenja, String mestoRodjenja, String imeRoditelja, String adresa, String korisnickoIme, String lozinka) {
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

    public Katastar(String ime, String prezime, Pol pol, String datumRodjenja, String mestoRodjenja, String imeRoditelja, String adresa, String korisnickoIme, String lozinka) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Katastar r = (Katastar) o;
        if (r.korisnickoIme == null || korisnickoIme == null) {
            return false;
        }
        return Objects.equals(korisnickoIme, r.korisnickoIme);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(korisnickoIme);
    }

    @Override
    public String toString() {
        return "Katastar{" +
                "jmbg='" + jmbg + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", pol=" + pol +
                ", datumRodjenja=" + datumRodjenja +
                ", mestoRodjenja='" + mestoRodjenja + '\'' +
                ", imeRoditelja='" + imeRoditelja + '\'' +
                ", adresa='" + adresa + '\'' +
                ", korisnickoIme='" + korisnickoIme + '\'' +
                ", lozinka='" + lozinka + '\'' +
                '}';
    }
}
