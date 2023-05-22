package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "istorijapromena")
public class IstorijaPromena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Datum promene je obavezno polje!")
    @Column(name = "datum_promene", nullable = false)
    private String datumPromene;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nepokretnost_id")
    private Nepokretnost nepokretnost;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "katastar_korisnicko_ime")
    private Katastar katastar;

    public IstorijaPromena() {

    }

    public IstorijaPromena(Integer id, String datumPromene, Nepokretnost nepokretnost, Katastar katastar) {
        this.id = id;
        this.datumPromene = datumPromene;
        this.nepokretnost = nepokretnost;
        this.katastar = katastar;
    }

    public IstorijaPromena(String datumPromene, Nepokretnost nepokretnost, Katastar katastar) {
        this.datumPromene = datumPromene;
        this.nepokretnost = nepokretnost;
        this.katastar = katastar;
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

    public Nepokretnost getNepokretnost() {
        return nepokretnost;
    }

    public void setNepokretnost(Nepokretnost nepokretnost) {
        this.nepokretnost = nepokretnost;
    }

    public Katastar getKatastar() {
        return katastar;
    }

    public void setKatastar(Katastar katastar) {
        this.katastar = katastar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IstorijaPromena i = (IstorijaPromena) o;
        return id != null && id.equals(i.getId());
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "IstorijaPromena{" +
                "id=" + id +
                ", datumPromene=" + datumPromene +
                ", nepokretnost=" + nepokretnost +
                ", radnikUKatastru=" + katastar +
                '}';
    }
}

