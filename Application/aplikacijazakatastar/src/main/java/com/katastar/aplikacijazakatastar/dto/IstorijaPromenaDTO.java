package com.katastar.aplikacijazakatastar.dto;


import com.katastar.aplikacijazakatastar.model.IstorijaPromena;

public class IstorijaPromenaDTO {

    private Integer id;
    private String datumPromene;
    private String brojParcele;
    private String katastar;
    private String stariVlasnik;
    private String noviVlasnik;

    public IstorijaPromenaDTO() {

    }

    public IstorijaPromenaDTO(IstorijaPromena istorijaPromena) {
        id = istorijaPromena.getId();
        datumPromene = istorijaPromena.getDatumPromene();
        brojParcele = istorijaPromena.getBrojParcele();
        katastar = istorijaPromena.getKatastar();
        stariVlasnik = istorijaPromena.getStariVlasnik();
        noviVlasnik = istorijaPromena.getNoviVlasnik();
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

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }

    public String getKatastar() {
        return katastar;
    }

    public void setKatastar(String katastar) {
        this.katastar = katastar;
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
}
