package com.auth.aplikacijaauth.repository;

import com.auth.aplikacijaauth.model.Korisnik;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface KorisnikRepository extends JpaRepository<Korisnik, Integer> {

    @Query(nativeQuery = true, value = "select * from korisnik where korisnickoIme = ?")
    public Korisnik findOneByKorisnickoIme(String username);

    Optional<Korisnik> findFirstByKorisnickoIme(String username);

    @Query("SELECT k FROM Korisnik k WHERE k.korisnickoIme = :korisnickoIme")
    Korisnik findByKorisnickoIme(@Param("korisnickoIme") String korisnickoIme);

    public List<Korisnik> findAll();

    public Page<Korisnik> findAll(Pageable pageable);

    public List<Korisnik> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

}