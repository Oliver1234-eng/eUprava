package notar.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notari")
public class Notar extends RegistrovaniKorisnik{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = true)
    protected Long id;

//    @JsonBackReference
//    @ManyToOne()
//    @JoinColumn(name = "termin_id", nullable = true)
//    private Termin notarTermin;

//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Osoba.class)
//    @JoinColumn(name="notar_id", referencedColumnName = "id", nullable = true)
//    private RegistrovaniKorisnik registrovaniKorisnik;

}

