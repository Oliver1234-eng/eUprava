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
@Table(name = "stranka")
public class Stranka extends RegistrovaniKorisnik{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    protected Long id;

        @ManyToMany()
        @JoinTable(
                name = "stranka_termin",
                joinColumns = @JoinColumn(name = "stranka_id"),
                inverseJoinColumns = @JoinColumn(name = "termin_id"))
        List<Termin> stranka_termin;


}

