package com.katastar.aplikacijazakatastar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "nepokretnost")
public class Nepokretnost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Adresa je obavezno polje!")
    @Column(name = "adresa", nullable = false)
    private String adresa;

    @NotBlank(message = "Broj parcele je obavezno polje!")
    @Column(name = "broj_parcele", nullable = false)
    private String brojParcele;

    @Column(name = "broj_dela_parcele", nullable = false)
    private int brojDelaParcele;

    @Column(name = "povrsina", nullable = false)
    private double povrsina;

    @NotBlank(message = "Potes je obavezno polje!")
    @Column(name = "potes", nullable = false)
    private String potes;

    @Enumerated(EnumType.STRING)
    @Column(name = "nacin_koriscenja_zemljista", nullable = false)
    private NacinKoriscenjaZemljista nacinKoriscenjaZemljista;

    @Enumerated(EnumType.STRING)
    @Column(name = "nacin_koriscenja_objekta", nullable = false)
    private NacinKoriscenjaObjekta nacinKoriscenjaObjekta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "katastar_korisnicko_ime")
    private Katastar katastar;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gradjanin_korisnicko_ime")
    private Gradjanin gradjanin;

    @OneToMany(mappedBy = "nepokretnost", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<IstorijaPromena> istorijePromena = new HashSet<IstorijaPromena>();

    public Nepokretnost() {

    }

    public Nepokretnost(int id, String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta, Katastar katastar, Gradjanin gradjanin) {
        this.id = id;
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
        this.katastar = katastar;
        this.gradjanin = gradjanin;
    }

    public Nepokretnost(String adresa, String brojParcele, int brojDelaParcele, double povrsina, String potes, NacinKoriscenjaZemljista nacinKoriscenjaZemljista, NacinKoriscenjaObjekta nacinKoriscenjaObjekta, Katastar katastar, Gradjanin gradjanin) {
        this.adresa = adresa;
        this.brojParcele = brojParcele;
        this.brojDelaParcele = brojDelaParcele;
        this.povrsina = povrsina;
        this.potes = potes;
        this.nacinKoriscenjaZemljista = nacinKoriscenjaZemljista;
        this.nacinKoriscenjaObjekta = nacinKoriscenjaObjekta;
        this.katastar = katastar;
        this.gradjanin = gradjanin;
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

    public Katastar getKatastar() {
        return katastar;
    }

    public void setKatastar(Katastar katastar) {
        this.katastar = katastar;
    }

    public Gradjanin getGradjanin() {
        return gradjanin;
    }

    public void setGradjanin(Gradjanin gradjanin) {
        this.gradjanin = gradjanin;
    }

    public Set<IstorijaPromena> getIstorijePromena() {
        return istorijePromena;
    }

    public void setIstorijePromena(Set<IstorijaPromena> istorijePromena) {
        this.istorijePromena = istorijePromena;
    }

    public void addIstorijaPromena(IstorijaPromena istorijaPromena) {
        istorijePromena.add(istorijaPromena);
        istorijaPromena.setNepokretnost(this);
    }

    public void removeIstorijaPromena(IstorijaPromena istorijaPromena) {
        istorijePromena.remove(istorijaPromena);
        istorijaPromena.setNepokretnost(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nepokretnost n = (Nepokretnost) o;
        return id != null && id.equals(n.getId());
    }

    @Override
    public int hashCode() {
        return 1337;
    }

    @Override
    public String toString() {
        return "Nepokretnost{" +
                "id=" + id +
                ", adresa='" + adresa + '\'' +
                ", brojParcele='" + brojParcele + '\'' +
                ", brojDelaParcele=" + brojDelaParcele +
                ", povrsina=" + povrsina +
                ", potes='" + potes + '\'' +
                ", nacinKoriscenjaZemljista=" + nacinKoriscenjaZemljista +
                ", nacinKoriscenjaObjekta=" + nacinKoriscenjaObjekta +
                ", radnikUKatastru=" + katastar +
                ", gradjanin=" + gradjanin +
                ", istorijePromena=" + istorijePromena +
                '}';
    }
}
