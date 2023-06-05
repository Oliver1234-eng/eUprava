package notar.repository;

import notar.model.entity.Termin;
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
    @Query(value = "update termini t set t.status_termina = 'ZAKAZAN', t.kancelarija_id =?1 where t.id =?2 ", nativeQuery = true)
    void odobriTermin(Long kancId, Long terminId);

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'U_TOKU', where t.id=?1 and t.status_termina = 'ZAKAZAN' ", nativeQuery = true)
    void zapocniTermin(Long id);

    @Modifying
    @Transactional
    @Query(value = "update termini t set t.status_termina = 'ZAVRSEN', t.overen_ugovor = 1 where t.id=?1 and t.status_termina = 'U_TOKU'", nativeQuery = true)
    void overiTermin(Long id);
}
