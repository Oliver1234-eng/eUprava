package notar.model.entity;

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
@Table(name = "svedok_termin")
public class SvedokTermin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "svedok_id")
    private Svedok svedok;

    @ManyToOne
    @JoinColumn(name = "termin_id")
    private Termin termin;

    // constructors, getters and setters
}
