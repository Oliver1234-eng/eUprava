INSERT INTO katastar (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, adresa)
VALUES ('katastar', 'katastar', '2121118192123', 'Ana', 'Petrovic', 'ZENSKI', '01.01.1990', 'Beograd', 'Marko Petrovic', 'Kralja Petra 1, Beograd');

INSERT INTO gradjanin (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, adresa)
VALUES ('gradjanin', 'gradjanin', '2121854492123', 'Nikola', 'Markovic', 'MUSKI', '01.01.1995', 'Beograd', 'Milan Markovic', 'Cara Dusana 1, Beograd');

INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina, katastar, stari_vlasnik, novi_vlasnik)
VALUES ('Adresa1', 1, '1111', 'GRADJEVINSKO_ZEMLJISTE', 'NJIVA', '141', 50.0, 'katastar', 'Pera Peric', 'Zika Peric');
INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina, katastar, stari_vlasnik, novi_vlasnik)
VALUES ('Adresa2', 2, '1112', 'POLJOPRIVREDNO_ZEMLJISTE', 'SUMA', '145', 100.0, 'katastar', 'Jovan Jovanovic', 'Milan Jovanovic');

INSERT INTO istorijapromena (datum_promene, broj_parcele, katastar, stari_vlasnik, novi_vlasnik)
VALUES ('01.06.2023', '1111', 'katastar', 'Pera Peric', 'Zika Peric');
INSERT INTO istorijapromena (datum_promene, broj_parcele, katastar, stari_vlasnik, novi_vlasnik)
VALUES ('01.06.2023', '1112', 'katastar', 'Jovan Jovanovic', 'Milan Jovanovic');

INSERT INTO termin (datum_i_vreme_sastanka, ime_i_prezime_notara, jmbg, ime_i_prezime_gradjanina, broj_parcele, jmbg_vlasnika, ime_i_prezime_vlasnika, srodstvo)
VALUES ('02.06.2023 17:00', 'notar', 'nema', 'nema', 'nema', 'nema', 'nema', 'nema');
INSERT INTO termin (datum_i_vreme_sastanka, ime_i_prezime_notara, jmbg, ime_i_prezime_gradjanina, broj_parcele, jmbg_vlasnika, ime_i_prezime_vlasnika, srodstvo)
VALUES ('02.06.2023 18:00', 'notar', 'nema', 'nema', 'nema', 'nema', 'nema', 'nema');