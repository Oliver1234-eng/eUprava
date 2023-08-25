package notar.repository;

import notar.model.entity.Osoba;
import notar.model.entity.Stranka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface StrankaRepository extends JpaRepository<Stranka, Long> {


    @Query(value = "select * from osobe o where o.JMBG LIKE %?1 ", nativeQuery = true)
    Stranka findByJMBG(String strankaId);

}
