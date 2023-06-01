package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Gradjanin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradjaninRepository extends JpaRepository<Gradjanin, String> {

    @Query(nativeQuery = true, value = "select * from gradjanin where korisnicko_ime = ?")
    public Gradjanin findOneByKorisnickoIme(String korisnickoIme);

    public List<Gradjanin> findAll();

    public Page<Gradjanin> findAll(Pageable pageable);

    public List<Gradjanin> findAllByJmbg(String jmbg);

    public List<Gradjanin> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from gradjanin where jmbg = ?")
    public List<Gradjanin> pronadjiKorisnikePoJmbg(String jmbg);
}
