package com.katastar.aplikacijazakatastar.dto;


import com.katastar.aplikacijazakatastar.model.IstorijaPromena;

public class IstorijaPromenaDTO {

    private Integer id;
    private String datumPromene;
    private NepokretnostDTO nepokretnost;
    private KatastarDTO katastar;

    public IstorijaPromenaDTO() {

    }

    public IstorijaPromenaDTO(IstorijaPromena istorijaPromena) {
        id = istorijaPromena.getId();
        datumPromene = istorijaPromena.getDatumPromene();
        nepokretnost = new NepokretnostDTO(istorijaPromena.getNepokretnost());
        katastar = new KatastarDTO(istorijaPromena.getKatastar());
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

    public NepokretnostDTO getNepokretnost() {
        return nepokretnost;
    }

    public void setNepokretnost(NepokretnostDTO nepokretnost) {
        this.nepokretnost = nepokretnost;
    }

    public KatastarDTO getKatastar() {
        return katastar;
    }

    public void setKatastar(KatastarDTO katastar) {
        this.katastar = katastar;
    }
}
