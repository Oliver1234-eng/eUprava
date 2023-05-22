package notar.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kancelarija_termin")
public class KancelarijaTermin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "kancelarija_id", referencedColumnName = "id")
    private Kancelarija kancelarija;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "termin_id", referencedColumnName = "id")
    private Termin termin;


}
