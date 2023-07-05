package com.maticar.aplikacijazamaticara.repository;

import com.maticar.aplikacijazamaticara.model.Maticar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaticarRepository extends JpaRepository<Maticar, String> {

    @Query(nativeQuery = true, value = "select * from maticar where korisnicko_ime = ?")
    public Maticar findOneByKorisnickoIme(String korisnickoIme);

    public List<Maticar> findAll();

    public Page<Maticar> findAll(Pageable pageable);

    public List<Maticar> findAllByJmbg(String jmbg);

    public List<Maticar> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from maticar where jmbg = ?")
    public List<Maticar> pronadjiKorisnikePoJmbg(String jmbg);
}
