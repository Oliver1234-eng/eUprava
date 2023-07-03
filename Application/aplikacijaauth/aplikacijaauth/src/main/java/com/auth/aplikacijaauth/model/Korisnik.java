package com.auth.aplikacijaauth.model;

@Entity
@Table(name = "korisnik")
public class Korisnik {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @NotBlank(message = "Username cannot be null")
    @Column(name = "korisnicko_ime", nullable = false, unique = true)
    private String korisnickoIme;

    @NotBlank(message = "Password cannot be null")
    @Column(name = "lozinka", nullable = false)
    private String lozinka;

    @NotBlank(message = "JMBG cannot be null")
    @Column(name = "jmbg", nullable = false)
    private String jmbg;

    @NotBlank(message = "Name cannot be null")
    @Column(name = "ime", nullable = false)
    private String ime;

    @NotBlank(message = "Surname cannot be null")
    @Column(name = "prezime", nullable = false)
    private String prezime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Pol pol;

    @PastOrPresent
    @Column(name = "datum_rodjenja", nullable = false)
    private LocalDate datumRodjenja;

    @NotBlank(message = "Birth place cannot be null")
    @Column(name = "mesto_rodjenja", nullable = false)
    private String mestoRodjenja;

    @NotBlank(message = "Name of parent cannot be null")
    @Column(name = "ime_roditelja", nullable = false)
    private String imeRoditelja;

    @NotBlank(message = "Surname of parent cannot be null")
    @Column(name = "prezime_roditelja", nullable = false)
    private String prezimeRoditelja;

    @NotBlank(message = "Address cannot be null")
    @Column(name = "adresa", nullable = false)
    private String adresa;

    @NotBlank(message = "Parents occupation cannot be null")
    @Column(name = "zanimanje_roditelja", nullable = false)
    private String zanimanjeRoditelja;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Uloge uloge;

    public Korisnik() {
        super();
    }

    public Korisnik(Integer id, String korisnickoIme, String lozinka, String jmbg, String ime, String prezime, Pol pol, LocalDate datumRodjenja, String mestoRodjenja, String imeRoditelja, String prezimeRoditelja, String adresa, String zanimanjeRoditelja, Uloge uloge) {
        this.id = id;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.prezimeRoditelja = prezimeRoditelja;
        this.adresa = adresa;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
        this.uloge = uloge;
    }

    public Korisnik(String korisnickoIme, String lozinka, String jmbg, String ime, String prezime, Pol pol, LocalDate datumRodjenja, String mestoRodjenja, String imeRoditelja, String prezimeRoditelja, String adresa, String zanimanjeRoditelja, Uloge uloge) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.mestoRodjenja = mestoRodjenja;
        this.imeRoditelja = imeRoditelja;
        this.prezimeRoditelja = prezimeRoditelja;
        this.adresa = adresa;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
        this.uloge = uloge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getMestoRodjenja() {
        return mestoRodjenja;
    }

    public void setMestoRodjenja(String mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getPrezimeRoditelja() {
        return prezimeRoditelja;
    }

    public void setPrezimeRoditelja(String prezimeRoditelja) {
        this.prezimeRoditelja = prezimeRoditelja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(String zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public Uloge getUloge() {
        return uloge;
    }

    public void setUloge(Uloge uloge) {
        this.uloge = uloge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Korisnik k = (Korisnik) o;
        if (k.korisnickoIme == null || korisnickoIme == null) {
            return false;
        }
        return Objects.equals(korisnickoIme, k.korisnickoIme);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(korisnickoIme);
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "id=" + id +
                ", korisnickoIme='" + korisnickoIme + '\'' +
                ", lozinka='" + lozinka + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", pol=" + pol +
                ", datumRodjenja=" + datumRodjenja +
                ", mestoRodjenja='" + mestoRodjenja + '\'' +
                ", imeRoditelja='" + imeRoditelja + '\'' +
                ", prezimeRoditelja='" + prezimeRoditelja + '\'' +
                ", adresa='" + adresa + '\'' +
                ", zanimanjeRoditelja='" + zanimanjeRoditelja + '\'' +
                ", uloge=" + uloge +
                '}';
    }
}
