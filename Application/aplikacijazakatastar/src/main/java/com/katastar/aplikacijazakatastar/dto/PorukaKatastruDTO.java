package com.katastar.aplikacijazakatastar.dto;

import com.katastar.aplikacijazakatastar.model.PorukaKatastru;

public class PorukaKatastruDTO {

    private Integer id;
    private String datumPromene;
    private String brojParcele;
    private String stariVlasnik;
    private String noviVlasnik;

    public PorukaKatastruDTO() {

    }

    public PorukaKatastruDTO(PorukaKatastru porukaKatastru) {
        id = porukaKatastru.getId();
        datumPromene = porukaKatastru.getDatumPromene();
        brojParcele = porukaKatastru.getBrojParcele();
        stariVlasnik = porukaKatastru.getStariVlasnik();
        noviVlasnik = porukaKatastru.getNoviVlasnik();
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
