package com.katastar.aplikacijazakatastar.dto;

import com.katastar.aplikacijazakatastar.model.Termin;

public class TerminDTO {

    private Integer id;
    private String datumIVremeSastanka;
    private String imeIPrezimeNotara;
    private String jmbgGradjanina;
    private String imeIPrezimeGradjanina;
    private String brojParcele;
    private String jmbgVlasnika;
    private String imeIPrezimeVlasnika;
    private String srodstvo;

    public TerminDTO() {

    }

    public TerminDTO(Termin termin) {
        id = termin.getId();
        datumIVremeSastanka = termin.getDatumIVremeSastanka();
        imeIPrezimeNotara = termin.getImeIPrezimeNotara();
        jmbgGradjanina = termin.getJmbgGradjanina();
        imeIPrezimeGradjanina = termin.getImeIPrezimeGradjanina();
        brojParcele = termin.getBrojParcele();
        jmbgVlasnika = termin.getJmbgVlasnika();
        imeIPrezimeVlasnika = termin.getImeIPrezimeVlasnika();
        srodstvo = termin.getSrodstvo();
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
}
