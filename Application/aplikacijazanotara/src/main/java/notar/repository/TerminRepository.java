package notar.repository;

import notar.model.entity.Termin;
import notar.model.enumeration.VrstaUgovora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Long> {
    @Query(value = "select * from termini t where t.notar_id = ?1", nativeQuery = true)
    List<Termin> findByNotar(Long notar_id);

    @Query(value = "select termin_id from osobe o where o.id = ?1 and o.dtype = 'Stranka' ", nativeQuery = true)
    List<Termin> findByStranka(Long stranka_id);

    @Query(value = "select * from termini t where t.status_termina = 'NA_CEKANJU'", nativeQuery = true)
    List<Termin> findByStatus();

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'ZAKAZAN' where t.id=?1 ", nativeQuery = true)
    void odobriTermin(Long id);

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'ZAKAZAN', t.vrsta_ugovora=?1, t.stranka_id=?2  where t.id=?3 ", nativeQuery = true)
    void zakaziTermin(String vrstaUgovora, long stranka_id, long id);

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'U_TOKU', t.status_termina = 'ZAKAZAN' where t.id=?1  ", nativeQuery = true)
    void zapocniTermin(Long id);

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'ZAVRSEN', t.overen_ugovor = 1 where t.id=?1", nativeQuery = true)
    void overiTermin(Long id);

    @Query(value = "select * from termini", nativeQuery = true)
    List<Termin> findAlll();

    @Query(value = "select * from termini t where t.status_termina = 'KREIRAN'", nativeQuery = true)
    List<Termin> findSlobodni();

    @Query(value = "select * from termini t where t.status_termina = 'ZAKAZAN'", nativeQuery = true)
    List<Termin> findZakazani();
}
