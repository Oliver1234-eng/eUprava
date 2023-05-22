package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Gradjanin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GradjaninRepository extends JpaRepository<Gradjanin, String> {

    @Query(nativeQuery = true, value = "select * from gradjanin where korisnicko_ime = ?")
    public Gradjanin findOneByKorisnickoIme(String korisnickoIme);

//    Optional<Gradjanin> findFirstByKorisnickoIme(String korisnickoIme);

    @Query("select g from Gradjanin g join fetch g.nepokretnosti e where g.korisnickoIme =?1")
    public Gradjanin findOneWithNepokretnosti(String gradjaninKorisnickoIme);

//    @Query("SELECT g FROM Gradjanin g WHERE g.korisnickoIme = :korisnicko_ime")
//    Gradjanin findByKorisnickoIme(@Param("korisnickoIme") String korisnickoIme);

    public List<Gradjanin> findAll();

    public Page<Gradjanin> findAll(Pageable pageable);

    public List<Gradjanin> findAllByJmbg(String jmbg);

    public List<Gradjanin> findByKorisnickoImeAndLozinkaAllIgnoringCase(String korisnickoIme, String lozinka);

    @Query(nativeQuery = true, value = "select * from gradjanin where jmbg = ?")
    public List<Gradjanin> pronadjiKorisnikePoJmbg(String jmbg);
}
