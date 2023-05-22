package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Katastar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface KatastarRepository extends JpaRepository<Katastar, String> {

    @Query(nativeQuery = true, value = "select * from katastar where korisnicko_ime = ?")
    public Katastar findOneByKorisnickoIme(String korisnickoIme);

//    Optional<Katastar> findFirstByKorisnickoIme(String korisnickoIme);

    @Query("select k from Katastar k join fetch k.nepokretnosti e where k.korisnickoIme =?1")
    public Katastar findOneWithNepokretnosti(String katastarKorisnickoIme);

    @Query("select k from Katastar k join fetch k.istorijePromena e where k.korisnickoIme =?1")
    public Katastar findOneWithIstorijePromena(String katastarKorisnickoIme);

//    @Query("SELECT k FROM Katastar k WHERE k.korisnickoIme = :korisnicko_ime")
//    Katastar findByKorisnickoIme(@Param("korisnickoIme") String korisnickoIme);

    public List<Katastar> findAll();

    public Page<Katastar> findAll(Pageable pageable);

    public List<Katastar> findAllByJmbg(String jmbg);

    public List<Katastar> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from katastar where jmbg = ?")
    public List<Katastar> pronadjiKorisnikePoJmbg(String jmbg);
}
