package com.katastar.aplikacijazakatastar.dto;

import com.katastar.aplikacijazakatastar.model.UgovorOPrenosuZemljista;

public class UgovorOPrenosuZemljistaDTO {

    private Integer id;
    private String notar;
    private String vrstaUgovora;
    private String datumOvere;
    private String overen;
    private String brojParcele;
    private String stariVlasnik;
    private String noviVlasnik;

    public UgovorOPrenosuZemljistaDTO() {

    }

    public UgovorOPrenosuZemljistaDTO(UgovorOPrenosuZemljista ugovorOPrenosuZemljista) {
        id = ugovorOPrenosuZemljista.getId();
        notar = ugovorOPrenosuZemljista.getNotar();
        vrstaUgovora = ugovorOPrenosuZemljista.getVrstaUgovora();
        datumOvere = ugovorOPrenosuZemljista.getDatumOvere();
        overen = ugovorOPrenosuZemljista.getOveren();
        brojParcele = ugovorOPrenosuZemljista.getBrojParcele();
        stariVlasnik = ugovorOPrenosuZemljista.getStariVlasnik();
        noviVlasnik = ugovorOPrenosuZemljista.getNoviVlasnik();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotar() {
        return notar;
    }

    public void setNotar(String notar) {
        this.notar = notar;
    }

    public String getVrstaUgovora() {
        return vrstaUgovora;
    }

    public void setVrstaUgovora(String vrstaUgovora) {
        this.vrstaUgovora = vrstaUgovora;
    }

    public String getDatumOvere() {
        return datumOvere;
    }

    public void setDatumOvere(String datumOvere) {
        this.datumOvere = datumOvere;
    }

    public String getOveren() {
        return overen;
    }

    public void setOveren(String overen) {
        this.overen = overen;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
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
