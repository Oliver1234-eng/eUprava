package com.maticar.aplikacijazamaticara.repository;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.Maticar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, String> {

    @Query(nativeQuery = true, value = "select * from korisnik where korisnicko_ime = ?")
    public Korisnik findOneByKorisnickoIme(String korisnickoIme);

    public List<Korisnik> findAll();

    public Page<Korisnik> findAll(Pageable pageable);

    public List<Korisnik> findAllByJmbg(String jmbg);

    public List<Korisnik> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from katastar where jmbg = ?")
    public List<Korisnik> pronadjiKorisnikePoJmbg(String jmbg);
}
