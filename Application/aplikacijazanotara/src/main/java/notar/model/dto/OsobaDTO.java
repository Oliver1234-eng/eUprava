package notar.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import notar.model.entity.RegistrovaniKorisnik;
import notar.model.entity.Svedok;
import notar.model.enumeration.Pol;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OsobaDTO {


    private String adresa;

    private LocalDate datumRodjenja;
    private String ime;
    private String imeRoditelja;
    private String jmbg;
    private String prezime;

    private Pol pol;



    private String mestoRodjenja;



    private String prezimeRoditelja;

    private String zanimanjeRoditelja;



    private String korisnickoIme;

    private String lozinka;

    private String e_mail;

    private String brojTelefona;

}
