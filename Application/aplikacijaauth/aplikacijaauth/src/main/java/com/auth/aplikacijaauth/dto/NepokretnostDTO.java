package com.auth.aplikacijaauth.dto;

import com.auth.aplikacijaauth.model.NacinKoriscenjaObjekta;
import com.auth.aplikacijaauth.model.NacinKoriscenjaZemljista;
import com.auth.aplikacijaauth.model.Nepokretnost;

public class NepokretnostDTO {

    private Integer id;
    private String adresa;
    private String brojParcele;
    private int brojDelaParcele;
    private double povrsina;
    private String potes;
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;

    public NepokretnostDTO() {

    }

    public NepokretnostDTO(Nepokretnost nepokretnost) {
        this(nepokretnost.getId(), nepokretnost.getAdresa(), nepokretnost.getBrojParcele(),
                nepokretnost.getBrojDelaParcele(), nepokretnost.getPovrsina(), nepokretnost.getPotes(),
                nepokretnost.getNacinKoriscenjaZemljista(), nepokretnost.getNacinKoriscenjaObjekta());
    }

    public NepokretnostDTO(Integer id, String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.id = id;
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
    }

    public NepokretnostDTO(String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojParcele() {
        return brojParcele;
    }

    public void setBrojParcele(String brojParcele) {
        this.brojParcele = brojParcele;
    }

    public int getBrojDelaParcele() {
        return brojDelaParcele;
    }

    public void setBrojDelaParcele(int brojDelaParcele) {
        this.brojDelaParcele = brojDelaParcele;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public String getPotes() {
        return potes;
    }

    public void setPotes(String potes) {
        this.potes = potes;
    }

    public NacinKoriscenjaZemljista getNacinKoriscenjaZemljista() {
        return nacinKoriscenjaZemljista;
    }

    public void setNacinKoriscenjaZemljista(NacinKoriscenjaZemljista nacinKoriscenjaZemljista) {
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
    }

    public NacinKoriscenjaObjekta getNacinKoriscenjaObjekta() {
        return nacinKoriscenjaObjekta;
    }

    public void setNacinKoriscenjaObjekta(NacinKoriscenjaObjekta nacinKoriscenjaObjekta) {
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
    }
}