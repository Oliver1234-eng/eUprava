package com.katastar.aplikacijazakatastar.dto;

import com.katastar.aplikacijazakatastar.model.NacinKoriscenjaObjekta;
import com.katastar.aplikacijazakatastar.model.NacinKoriscenjaZemljista;
import com.katastar.aplikacijazakatastar.model.Nepokretnost;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class NepokretnostDTO {

    private Integer id;
    private String adresa;
    private String brojParcele;
    private int brojDelaParcele;
    private double povrsina;
    private String potes;
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;
    private KatastarDTO katastar;
    private GradjaninDTO gradjanin;

    public NepokretnostDTO() {

    }

    public NepokretnostDTO(Nepokretnost nepokretnost) {
        id = nepokretnost.getId();
        adresa = nepokretnost.getAdresa();
        brojParcele = nepokretnost.getBrojParcele();
        povrsina = nepokretnost.getPovrsina();
        potes = nepokretnost.getPotes();
        nacinKoriscenjaZemljista = nepokretnost.getNacinKoriscenjaZemljista();
        nacinKoriscenjaObjekta = nepokretnost.getNacinKoriscenjaObjekta();
        katastar = new KatastarDTO(nepokretnost.getKatastar());
        gradjanin = new GradjaninDTO(nepokretnost.getGradjanin());
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

    public KatastarDTO getKatastar() {
        return katastar;
    }

    public void setKatastar(KatastarDTO katastar) {
        this.katastar = katastar;
    }

    public GradjaninDTO getGradjanin() {
        return gradjanin;
    }

    public void setGradjanin(GradjaninDTO gradjanin) {
        this.gradjanin = gradjanin;
    }
}
