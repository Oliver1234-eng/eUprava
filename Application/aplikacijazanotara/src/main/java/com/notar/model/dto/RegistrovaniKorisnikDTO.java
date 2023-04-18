package com.notar.model.dto;

import com.notar.model.enumeration.Pol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrovaniKorisnikDTO {

    private String jmbg;

    private String ime;

    private String prezime;

    private Pol pol;

    private LocalDate datumRodjenja;

    private String mestoRodjenja;

    private String imeRoditelja;

    private String prezimeRoditelja;

    private String zanimanjeRoditelja;

    private String adresa;

    private String korisnickoIme;

    private String lozinka;

    private String e_mail;

    private String brojTelefona;

}
