package com.maticar.aplikacijazamaticara.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "maticnaKnjigaVencanih")
public class MaticnaKnjigaVencanih {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Ime je obavezno polje!")
    @Column(name = "ime_zene", nullable = false)
    private String imeZene;

    @NotBlank(message = "Prezime je obavezno polje!")
    @Column(name = "prezime_zene", nullable = false)
    private String prezimeZene;

    @Column(name = "ime_muza", nullable = false)
    private String imeMuza;

    @NotBlank(message = "Mesto rodjenja je obavezno polje!")
    @Column(name = "prezime_muza", nullable = false)
    private String prezimeMuza;

    @NotBlank(message = "Ime roditelja je obavezno polje!")
    @Column(name = "jmbg_zene", nullable = false)
    private String jmbgZene;

    @NotBlank(message = "Adresa je obavezno polje!")
    @Column(name = "jmbg_muza", nullable = false)
    private String jmbgMuza;

    @Column(name = "dan_mesec_i_godina_zakljucenja_braka", nullable = false)
    private String danMesecIGodinaZakljucenjaBraka;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "adresa_prebivalista_zene", nullable = false)
    private String adresaPrebivalistaZene;

    @Column(name = "adresa_prebivalista_muza", nullable = false)
    private String adresaPrebivalistaMuza;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "drzavljanstvo_zene", nullable = false)
    private String drzavljanstvoZene;

    @Column(name = "drzavljanstvo_muza", nullable = false)
    private String drzavljanstvoMuza;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "ime_svedoka1", nullable = false)
    private String imeSvedoka1;

    @Column(name = "prezime_svedoka1", nullable = false)
    private String prezimeSvedoka1;

    @NotBlank(message = "Lozinka je obavezno polje!")
    @Column(name = "ime_svedoka2", nullable = false)
    private String imeSvedoka2;

    @Column(name = "prezime_svedoka2", nullable = false)
    private String prezimeSvedoka2;

    public MaticnaKnjigaVencanih() {

    }

    public MaticnaKnjigaVencanih(Long id, String imeZene, String prezimeZene, String imeMuza, String prezimeMuza, String jmbgZene, String jmbgMuza, String danMesecIGodinaZakljucenjaBraka, String adresaPrebivalistaZene, String adresaPrebivalistaMuza, String drzavljanstvoZene, String drzavljanstvoMuza, String imeSvedoka1, String prezimeSvedoka1, String imeSvedoka2, String prezimeSvedoka2) {
        this.id = id;
        this.imeZene = imeZene;
        this.prezimeZene = prezimeZene;
        this.imeMuza = imeMuza;
        this.prezimeMuza = prezimeMuza;
        this.jmbgZene = jmbgZene;
        this.jmbgMuza = jmbgMuza;
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
        this.drzavljanstvoZene = drzavljanstvoZene;
        this.drzavljanstvoMuza = drzavljanstvoMuza;
        this.imeSvedoka1 = imeSvedoka1;
        this.prezimeSvedoka1 = prezimeSvedoka1;
        this.imeSvedoka2 = imeSvedoka2;
        this.prezimeSvedoka2 = prezimeSvedoka2;
    }

    public MaticnaKnjigaVencanih(String imeZene, String prezimeZene, String imeMuza, String prezimeMuza, String jmbgZene, String jmbgMuza, String danMesecIGodinaZakljucenjaBraka, String adresaPrebivalistaZene, String adresaPrebivalistaMuza, String drzavljanstvoZene, String drzavljanstvoMuza, String imeSvedoka1, String prezimeSvedoka1, String imeSvedoka2, String prezimeSvedoka2) {
        this.imeZene = imeZene;
        this.prezimeZene = prezimeZene;
        this.imeMuza = imeMuza;
        this.prezimeMuza = prezimeMuza;
        this.jmbgZene = jmbgZene;
        this.jmbgMuza = jmbgMuza;
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
        this.drzavljanstvoZene = drzavljanstvoZene;
        this.drzavljanstvoMuza = drzavljanstvoMuza;
        this.imeSvedoka1 = imeSvedoka1;
        this.prezimeSvedoka1 = prezimeSvedoka1;
        this.imeSvedoka2 = imeSvedoka2;
        this.prezimeSvedoka2 = prezimeSvedoka2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImeZene() {
        return imeZene;
    }

    public void setImeZene(String imeZene) {
        this.imeZene = imeZene;
    }

    public String getPrezimeZene() {
        return prezimeZene;
    }

    public void setPrezimeZene(String prezimeZene) {
        this.prezimeZene = prezimeZene;
    }

    public String getImeMuza() {
        return imeMuza;
    }

    public void setImeMuza(String imeMuza) {
        this.imeMuza = imeMuza;
    }

    public String getPrezimeMuza() {
        return prezimeMuza;
    }

    public void setPrezimeMuza(String prezimeMuza) {
        this.prezimeMuza = prezimeMuza;
    }

    public String getJmbgZene() {
        return jmbgZene;
    }

    public void setJmbgZene(String jmbgZene) {
        this.jmbgZene = jmbgZene;
    }

    public String getJmbgMuza() {
        return jmbgMuza;
    }

    public void setJmbgMuza(String jmbgMuza) {
        this.jmbgMuza = jmbgMuza;
    }

    public String getDanMesecIGodinaZakljucenjaBraka() {
        return danMesecIGodinaZakljucenjaBraka;
    }

    public void setDanMesecIGodinaZakljucenjaBraka(String danMesecIGodinaZakljucenjaBraka) {
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
    }

    public String getAdresaPrebivalistaZene() {
        return adresaPrebivalistaZene;
    }

    public void setAdresaPrebivalistaZene(String adresaPrebivalistaZene) {
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
    }

    public String getAdresaPrebivalistaMuza() {
        return adresaPrebivalistaMuza;
    }

    public void setAdresaPrebivalistaMuza(String adresaPrebivalistaMuza) {
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
    }

    public String getDrzavljanstvoZene() {
        return drzavljanstvoZene;
    }

    public void setDrzavljanstvoZene(String drzavljanstvoZene) {
        this.drzavljanstvoZene = drzavljanstvoZene;
    }

    public String getDrzavljanstvoMuza() {
        return drzavljanstvoMuza;
    }

    public void setDrzavljanstvoMuza(String drzavljanstvoMuza) {
        this.drzavljanstvoMuza = drzavljanstvoMuza;
    }

    public String getImeSvedoka1() {
        return imeSvedoka1;
    }

    public void setImeSvedoka1(String imeSvedoka1) {
        this.imeSvedoka1 = imeSvedoka1;
    }

    public String getPrezimeSvedoka1() {
        return prezimeSvedoka1;
    }

    public void setPrezimeSvedoka1(String prezimeSvedoka1) { this.prezimeSvedoka1 = prezimeSvedoka1; }

    public String getImeSvedoka2() {
        return imeSvedoka2;
    }

    public void setImeSvedoka2(String imeSvedoka2) {
        this.imeSvedoka2 = imeSvedoka2;
    }

    public String getPrezimeSvedoka2() {
        return prezimeSvedoka2;
    }

    public void setPrezimeSvedoka2(String prezimeSvedoka2) { this.prezimeSvedoka2 = prezimeSvedoka2; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaticnaKnjigaVencanih r = (MaticnaKnjigaVencanih) o;
        if (r.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, r.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MaticnaKnjigaVencanih{" +
                "id='" + id + '\'' +
                ", imeZene='" + imeZene + '\'' +
                ", prezimeZene='" + prezimeZene + '\'' +
                ", imeMuza=" + imeMuza +
                ", prezimeMuza=" + prezimeMuza +
                ", jmbgZene='" + jmbgZene + '\'' +
                ", jmbgMuza='" + jmbgMuza + '\'' +
                ", danMesecIGodinaZakljucenjaBraka='" + danMesecIGodinaZakljucenjaBraka + '\'' +
                ", adresaPrebivalistaZene='" + adresaPrebivalistaZene + '\'' +
                ", adresaPrebivalistaMuza='" + adresaPrebivalistaMuza + '\'' +
                ", drzavljanstvoZene='" + drzavljanstvoZene + '\'' +
                ", drzavljanstvoMuza='" + drzavljanstvoMuza + '\'' +
                ", imeSvedoka1='" + imeSvedoka1 + '\'' +
                ", prezimeSvedoka1='" + prezimeSvedoka1 + '\'' +
                ", imeSvedoka2='" + imeSvedoka2 + '\'' +
                ", prezimeSvedoka2='" + prezimeSvedoka2 + '\'' +
                '}';
    }
}
