package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Katastar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KatastarRepository extends JpaRepository<Katastar, String> {

    @Query(nativeQuery = true, value = "select * from katastar where korisnicko_ime = ?")
    public Katastar findOneByKorisnickoIme(String korisnickoIme);

    public List<Katastar> findAll();

    public Page<Katastar> findAll(Pageable pageable);

    public List<Katastar> findAllByJmbg(String jmbg);

    public List<Katastar> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from katastar where jmbg = ?")
    public List<Katastar> pronadjiKorisnikePoJmbg(String jmbg);
}
