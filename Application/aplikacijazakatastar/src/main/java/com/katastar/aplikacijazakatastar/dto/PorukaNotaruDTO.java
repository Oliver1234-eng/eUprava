package com.katastar.aplikacijazakatastar.dto;

import com.katastar.aplikacijazakatastar.model.PorukaNotaru;

public class PorukaNotaruDTO {

    private Integer id;
    private String datumPromene;
    private String brojParcele;
    private String stariVlasnik;
    private String noviVlasnik;

    public PorukaNotaruDTO() {

    }

    public PorukaNotaruDTO(PorukaNotaru porukaNotaru) {
        id = porukaNotaru.getId();
        datumPromene = porukaNotaru.getDatumPromene();
        brojParcele = porukaNotaru.getBrojParcele();
        stariVlasnik = porukaNotaru.getStariVlasnik();
        noviVlasnik = porukaNotaru.getNoviVlasnik();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatumPromene() {
        return datumPromene;
    }

    public void setDatumPromene(String datumPromene) {
        this.datumPromene = datumPromene;
    }

    public String getStariVlasnik() {
        return stariVlasnik;
    }

    public void setStariVlasnik(String stariVlasnik) {
        this.stariVlasnik = stariVlasnik;
    }

    public String getNoviVlasnik() {
        return noviVlasnik;
    }

    public void setNoviVlasnik(String noviVlasnik) {
        this.noviVlasnik = noviVlasnik;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }
}
