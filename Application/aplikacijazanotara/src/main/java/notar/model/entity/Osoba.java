package notar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.enumeration.Pol;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "osobe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Osoba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = true)
    protected Long id;

//    @OneToMany(mappedBy="osoba",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
//    private List<RegistrovaniKorisnik> registrovaniKorisnici = new ArrayList<RegistrovaniKorisnik>();
//
//    @OneToMany(mappedBy="osoba",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
//    private List<SvedokController> svedoci = new ArrayList<SvedokController>();

    @Column
    protected String jmbg;
    @Column
    protected String ime;
    @Column
    protected String prezime;
    @Column
    @Enumerated(EnumType.STRING)
    protected Pol pol;
    @Column
    protected LocalDate datumRodjenja;
    @Column
    protected String mestoRodjenja;
    @Column
    protected String imeRoditelja;
    @Column
    protected String prezimeRoditelja;
    @Column
    protected String zanimanjeRoditelja;
    @Column
    protected String adresa;


}