INSERT INTO korisnik (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, prezime_roditelja, adresa, zanimanje_roditelja, uloge)
VALUES ('$2a$12$tVYXwDCo1mAiINEd2rElSOoLgJTZSwdWMLO.orQlx/fC.7ENOOGvS', 'gradjanin', '2121858192123', 'Gradjanin', 'Gradjaninic', 'MUSKI', '2001-05-21', 'Novi Sad', 'Roditelj', 'Roditeljic', 'Adresa', 'Zanimanje', 'GRADJANIN');
INSERT INTO korisnik (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, prezime_roditelja, adresa, zanimanje_roditelja, uloge)
VALUES ('$2a$12$RJ5oQvhRnKfpYvdC5iXsa.NcCoNId/Cu8q7.OSyuI7qiNM7rbTRZO', 'katastarskiRadnik', '2121858192321', 'Katastar', 'Katastaric', 'MUSKI', '2001-05-31', 'Novi Sad', 'Roditelj', 'Roditeljic', 'Adresa', 'Zanimanje', 'RADNIK_U_KATASTRU');
INSERT INTO korisnik (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, prezime_roditelja, adresa, zanimanje_roditelja, uloge)
VALUES ('$2a$12$PBOnDTjDtNWKSoLtKtoLUOzwZW79g/ce4S4INBtqpG.JlBuyNYy1u', 'maticar', '2121858192444', 'Maticar', 'Maticaric', 'MUSKI', '2001-05-26', 'Novi Sad', 'Roditelj', 'Roditeljic', 'Adresa', 'Zanimanje', 'MATICAR');
INSERT INTO korisnik (lozinka, korisnicko_ime, jmbg, ime, prezime, pol, datum_rodjenja, mesto_rodjenja, ime_roditelja, prezime_roditelja, adresa, zanimanje_roditelja, uloge)
VALUES ('$2a$12$e9kCqNSit5pbfTgWqaGzP.1aSisgU724DFkJWnkhKyMTQ0l5uUGqK', 'notar', '2121858192663', 'Notar', 'Notaric', 'MUSKI', '2001-05-20', 'Novi Sad', 'Roditelj', 'Roditeljic', 'Adresa', 'Zanimanje', 'NOTAR');

INSERT INTO kancelarija (broj_kancelarije, kapacitet) VALUES (1, 10);
INSERT INTO kancelarija (broj_kancelarije, kapacitet) VALUES (2, 20);
INSERT INTO kancelarija (broj_kancelarije, kapacitet) VALUES (3, 30);
INSERT INTO kancelarija (broj_kancelarije, kapacitet) VALUES (4, 40);

INSERT INTO svedok (adresa, ime, jmbg, prezime) VALUES ('Adresa1', 'Svedok1', '4919219481124', 'Svedokic1');
INSERT INTO svedok (adresa, ime, jmbg, prezime) VALUES ('Adresa2', 'Svedok2', '6839192048123', 'Svedokic2');
INSERT INTO svedok (adresa, ime, jmbg, prezime) VALUES ('Adresa3', 'Svedok3', '5838192814123', 'Svedokic3');
INSERT INTO svedok (adresa, ime, jmbg, prezime) VALUES ('Adresa4', 'Svedok4', '2848182918213', 'Svedokic4');

INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina)
VALUES ('Adresa1', 1, '4151', 'GRADJEVINSKO_ZEMLJISTE', 'NJIVA', '141', 50.0);
INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina)
VALUES ('Adresa2', 2, '5151', 'POLJOPRIVREDNO_ZEMLJISTE', 'SUMA', '145', 100.0);
INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina)
VALUES ('Adresa3', 3, '5141', 'VODNO_ZEMLJISTE', 'PASNJAK', '414', 150.0);
INSERT INTO nepokretnost (adresa, broj_dela_parcele, broj_parcele, nacin_koriscenja_objekta, nacin_koriscenja_zemljista, potes, povrsina)
VALUES ('Adresa4', 4, '5131', 'RUDNICKO_ZEMLJISTE', 'VOCNJAK', '511', 200.0);