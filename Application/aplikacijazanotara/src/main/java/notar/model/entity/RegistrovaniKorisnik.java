package notar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "registrovani_korisnici")
public abstract class RegistrovaniKorisnik extends Osoba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = true)
    protected Long id;
    @Column(unique = true)
    protected String korisnickoIme;
    @Column
    protected String lozinka;
    @Column(unique = true)
    protected String e_mail;

    @Column(unique = true)
    protected String brojTelefona;

//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Osoba.class)
//    @JoinColumn(name="osoba_id", referencedColumnName = "id", nullable = true)
//    private Osoba osoba;
//
//    @OneToMany(mappedBy="registrovaniKorisnik",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
//    private List<Notar> notari = new ArrayList<Notar>();
//
//    @OneToMany(mappedBy="registrovaniKorisnik",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
//    private List<StrankaController> stranke = new ArrayList<StrankaController>();

}
