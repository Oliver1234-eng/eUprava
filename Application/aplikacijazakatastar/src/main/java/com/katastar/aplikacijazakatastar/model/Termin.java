package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "termin")
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Datum i vreme sastanka je obavezno polje!")
    @Column(name = "datum_i_vreme_sastanka", nullable = false)
    private String datumIVremeSastanka;

    @NotBlank(message = "Ime i prezime notara je obavezno polje!")
    @Column(name = "ime_i_prezime_notara", nullable = false)
    private String imeIPrezimeNotara;

    @NotBlank(message = "JMBG gradjanina je obavezno polje!")
    @Column(name = "jmbg", nullable = false)
    private String jmbgGradjanina;

    @NotBlank(message = "Ime i prezime gradjanina je obavezno polje!")
    @Column(name = "ime_i_prezime_gradjanina", nullable = false)
    private String imeIPrezimeGradjanina;

    @NotBlank(message = "Broj parcele je obavezno polje!")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @NotBlank(message = "JMBG vlasnika je obavezno polje!")
    @Column(name = "jmbg_vlasnika", nullable = false)
    private String jmbgVlasnika;

    @NotBlank(message = "Ime i prezime vlasnika je obavezno polje!")
    @Column(name = "ime_i_prezime_vlasnika", nullable = false)
    private String imeIPrezimeVlasnika;

    @NotBlank(message = "Srodstvo je obavezno polje!")
    @Column(name = "srodstvo", nullable = false)
    private String srodstvo;

    public Termin() {

    }

    public Termin(Integer id, String datumIVremeSastanka, String imeIPrezimeNotara, String jmbgGradjanina, String imeIPrezimeGradjanina, String brojParcele, String jmbgVlasnika, String imeIPrezimeVlasnika, String srodstvo) {
        this.id = id;
        this.datumIVremeSastanka = datumIVremeSastanka;
        this.imeIPrezimeNotara = imeIPrezimeNotara;
        this.jmbgGradjanina = jmbgGradjanina;
        this.imeIPrezimeGradjanina = imeIPrezimeGradjanina;
        this.brojParcele = brojParcele;
        this.jmbgVlasnika = jmbgVlasnika;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.srodstvo = srodstvo;
    }

    public Termin(String datumIVremeSastanka, String imeIPrezimeNotara, String jmbgGradjanina, String imeIPrezimeGradjanina, String brojParcele, String jmbgVlasnika, String imeIPrezimeVlasnika, String srodstvo) {
        this.datumIVremeSastanka = datumIVremeSastanka;
        this.imeIPrezimeNotara = imeIPrezimeNotara;
        this.jmbgGradjanina = jmbgGradjanina;
        this.imeIPrezimeGradjanina = imeIPrezimeGradjanina;
        this.brojParcele = brojParcele;
        this.jmbgVlasnika = jmbgVlasnika;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.srodstvo = srodstvo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatumIVremeSastanka() {
        return datumIVremeSastanka;
    }

    public void setDatumIVremeSastanka(String datumIVremeSastanka) {
        this.datumIVremeSastanka = datumIVremeSastanka;
    }

    public String getImeIPrezimeNotara() {
        return imeIPrezimeNotara;
    }

    public void setImeIPrezimeNotara(String imeIPrezimeNotara) {
        this.imeIPrezimeNotara = imeIPrezimeNotara;
    }

    public String getJmbgGradjanina() {
        return jmbgGradjanina;
    }

    public void setJmbgGradjanina(String jmbgGradjanina) {
        this.jmbgGradjanina = jmbgGradjanina;
    }

    public String getImeIPrezimeGradjanina() {
        return imeIPrezimeGradjanina;
    }

    public void setImeIPrezimeGradjanina(String imeIPrezimeGradjanina) {
        this.imeIPrezimeGradjanina = imeIPrezimeGradjanina;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }

    public String getJmbgVlasnika() {
        return jmbgVlasnika;
    }

    public void setJmbgVlasnika(String jmbgVlasnika) {
        this.jmbgVlasnika = jmbgVlasnika;
    }

    public String getImeIPrezimeVlasnika() {
        return imeIPrezimeVlasnika;
    }

    public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
    }

    public String getSrodstvo() {
        return srodstvo;
    }

    public void setSrodstvo(String srodstvo) {
        this.srodstvo = srodstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Termin t = (Termin) o;
        return id != null && id.equals(t.id);
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "id=" + id +
                ", datumIVremeSastanka='" + datumIVremeSastanka + '\'' +
                ", imeIPrezimeNotara='" + imeIPrezimeNotara + '\'' +
                ", jmbgGradjanina='" + jmbgGradjanina + '\'' +
                ", imeIPrezimeGradjanina='" + imeIPrezimeGradjanina + '\'' +
                ", brojParcele='" + brojParcele + '\'' +
                ", jmbgVlasnika='" + jmbgVlasnika + '\'' +
                ", imeIPrezimeVlasnika='" + imeIPrezimeVlasnika + '\'' +
                ", srodstvo='" + srodstvo + '\'' +
                '}';
    }
}
