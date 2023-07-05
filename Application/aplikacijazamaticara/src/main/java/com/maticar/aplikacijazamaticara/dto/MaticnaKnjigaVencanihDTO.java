package com.maticar.aplikacijazamaticara.dto;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaVencanih;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class MaticnaKnjigaVencanihDTO {

    private Long id;

    private String imeZene;

    private String prezimeZene;

    private String imeMuza;

    private String prezimeMuza;

    private String jmbgZene;

    private String jmbgMuza;

    private String danMesecIGodinaZakljucenjaBraka;

    private String adresaPrebivalistaZene;

    private String adresaPrebivalistaMuza;

    private String drzavljanstvoZene;

    private String drzavljanstvoMuza;

    private String imeSvedoka1;

    private String prezimeSvedoka1;

    private String imeSvedoka2;

    private String prezimeSvedoka2;

    public MaticnaKnjigaVencanihDTO() {

    }

    public MaticnaKnjigaVencanihDTO(MaticnaKnjigaVencanih vencani) {
        this(vencani.getId(), vencani.getImeZene(), vencani.getPrezimeZene(), vencani.getImeMuza(),
                vencani.getPrezimeMuza(), vencani.getJmbgZene(), vencani.getJmbgMuza(),
                vencani.getDanMesecIGodinaZakljucenjaBraka(), vencani.getAdresaPrebivalistaZene(), vencani.getAdresaPrebivalistaMuza(),
                vencani.getDrzavljanstvoZene(), vencani.getDrzavljanstvoMuza(), vencani.getImeSvedoka1(),
                vencani.getPrezimeSvedoka1(), vencani.getImeSvedoka2(), vencani.getPrezimeSvedoka2());
    }
    public MaticnaKnjigaVencanihDTO(Long id, String imeZene, String prezimeZene, String imeMuza, String prezimeMuza, String jmbgZene, String jmbgMuza, String danMesecIGodinaZakljucenjaBraka, String adresaPrebivalistaZene, String adresaPrebivalistaMuza, String drzavljanstvoZene, String drzavljanstvoMuza, String imeSvedoka1, String prezimeSvedoka1, String imeSvedoka2, String prezimeSvedoka2) {
        this.id = id;
        this.imeZene = imeZene;
        this.prezimeZene = prezimeZene;
        this.imeMuza = imeMuza;
        this.prezimeMuza = prezimeMuza;
        this.jmbgZene = jmbgZene;
        this.jmbgMuza = jmbgMuza;
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
        this.drzavljanstvoZene = drzavljanstvoZene;
        this.drzavljanstvoMuza = drzavljanstvoMuza;
        this.imeSvedoka1 = imeSvedoka1;
        this.prezimeSvedoka1 = prezimeSvedoka1;
        this.imeSvedoka2 = imeSvedoka2;
        this.prezimeSvedoka2 = prezimeSvedoka2;
    }

    public MaticnaKnjigaVencanihDTO(String imeZene, String prezimeZene, String imeMuza, String prezimeMuza, String jmbgZene, String jmbgMuza, String danMesecIGodinaZakljucenjaBraka, String adresaPrebivalistaZene, String adresaPrebivalistaMuza, String drzavljanstvoZene, String drzavljanstvoMuza, String imeSvedoka1, String prezimeSvedoka1, String imeSvedoka2, String prezimeSvedoka2) {
        this.imeZene = imeZene;
        this.prezimeZene = prezimeZene;
        this.imeMuza = imeMuza;
        this.prezimeMuza = prezimeMuza;
        this.jmbgZene = jmbgZene;
        this.jmbgMuza = jmbgMuza;
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
        this.drzavljanstvoZene = drzavljanstvoZene;
        this.drzavljanstvoMuza = drzavljanstvoMuza;
        this.imeSvedoka1 = imeSvedoka1;
        this.prezimeSvedoka1 = prezimeSvedoka1;
        this.imeSvedoka2 = imeSvedoka2;
        this.prezimeSvedoka2 = prezimeSvedoka2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImeZene() {
        return imeZene;
    }

    public void setImeZene(String imeZene) {
        this.imeZene = imeZene;
    }

    public String getPrezimeZene() {
        return prezimeZene;
    }

    public void setPrezimeZene(String prezimeZene) {
        this.prezimeZene = prezimeZene;
    }

    public String getImeMuza() {
        return imeMuza;
    }

    public void setImeMuza(String imeMuza) {
        this.imeMuza = imeMuza;
    }

    public String getPrezimeMuza() {
        return prezimeMuza;
    }

    public void setPrezimeMuza(String prezimeMuza) {
        this.prezimeMuza = prezimeMuza;
    }

    public String getJmbgZene() {
        return jmbgZene;
    }

    public void setJmbgZene(String jmbgZene) {
        this.jmbgZene = jmbgZene;
    }

    public String getJmbgMuza() {
        return jmbgMuza;
    }

    public void setJmbgMuza(String jmbgMuza) {
        this.jmbgMuza = jmbgMuza;
    }

    public String getDanMesecIGodinaZakljucenjaBraka() {
        return danMesecIGodinaZakljucenjaBraka;
    }

    public void setDanMesecIGodinaZakljucenjaBraka(String danMesecIGodinaZakljucenjaBraka) {
        this.danMesecIGodinaZakljucenjaBraka = danMesecIGodinaZakljucenjaBraka;
    }

    public String getAdresaPrebivalistaZene() {
        return adresaPrebivalistaZene;
    }

    public void setAdresaPrebivalistaZene(String adresaPrebivalistaZene) {
        this.adresaPrebivalistaZene = adresaPrebivalistaZene;
    }

    public String getAdresaPrebivalistaMuza() {
        return adresaPrebivalistaMuza;
    }

    public void setAdresaPrebivalistaMuza(String adresaPrebivalistaMuza) {
        this.adresaPrebivalistaMuza = adresaPrebivalistaMuza;
    }

    public String getDrzavljanstvoZene() {
        return drzavljanstvoZene;
    }

    public void setDrzavljanstvoZene(String drzavljanstvoZene) {
        this.drzavljanstvoZene = drzavljanstvoZene;
    }

    public String getDrzavljanstvoMuza() {
        return drzavljanstvoMuza;
    }

    public void setDrzavljanstvoMuza(String drzavljanstvoMuza) {
        this.drzavljanstvoMuza = drzavljanstvoMuza;
    }

    public String getImeSvedoka1() {
        return imeSvedoka1;
    }

    public void setImeSvedoka1(String imeSvedoka1) {
        this.imeSvedoka1 = imeSvedoka1;
    }

    public String getPrezimeSvedoka1() {
        return prezimeSvedoka1;
    }

    public void setPrezimeSvedoka1(String prezimeSvedoka1) { this.prezimeSvedoka1 = prezimeSvedoka1; }

    public String getImeSvedoka2() {
        return imeSvedoka2;
    }

    public void setImeSvedoka2(String imeSvedoka2) {
        this.imeSvedoka2 = imeSvedoka2;
    }

    public String getPrezimeSvedoka2() {
        return prezimeSvedoka2;
    }

    public void setPrezimeSvedoka2(String prezimeSvedoka2) { this.prezimeSvedoka2 = prezimeSvedoka2; }
}
