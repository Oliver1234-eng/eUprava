package notar.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "svedok")
public class Svedok extends Osoba{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    protected Long id;

    @ManyToMany()
    @JoinTable(
            name = "svedok_termin",
            joinColumns = @JoinColumn(name = "svedok_id"),
            inverseJoinColumns = @JoinColumn(name = "termin_id")
    )
    List<Termin> svedok_termin;

//    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Osoba.class)
//    @JoinColumn(name="svedok_id", referencedColumnName = "id", nullable = true)
//    private Osoba osoba;
}
