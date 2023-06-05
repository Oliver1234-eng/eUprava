package notar.model.dto;

import notar.model.entity.NacinKoriscenjaObjekta;
import notar.model.entity.NacinKoriscenjaZemljista;
import notar.model.entity.Nepokretnost;

public class NepokretnostDTO {

    private String adresa;
    private String brojParcele;
    private int brojDelaParcele;
    private double povrsina;
    private String potes;
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;
    private String katastar;
    private String stariVlasnik;
    private String noviVlasnik;

    public NepokretnostDTO() {

    }

    public NepokretnostDTO(Nepokretnost nepokretnost) {
        adresa = nepokretnost.getAdresa();
        brojParcele = nepokretnost.getBrojParcele();
        povrsina = nepokretnost.getPovrsina();
        potes = nepokretnost.getPotes();
        nacinKoriscenjaZemljista = nepokretnost.getNacinKoriscenjaZemljista();
        nacinKoriscenjaObjekta = nepokretnost.getNacinKoriscenjaObjekta();
        katastar = nepokretnost.getKatastar();
        stariVlasnik = nepokretnost.getStariVlasnik();
        noviVlasnik = nepokretnost.getNoviVlasnik();
    }

    public NepokretnostDTO(String brojParcele) {

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
