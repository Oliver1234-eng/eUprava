package notar.repository;

import notar.model.entity.Stranka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StrankaRepository extends JpaRepository<Stranka, Long> {
    //@Query(value = "select * from osobe o where o.id = ?1", nativeQuery = true)
    //List<Stranka> findAllByIds(long id);
}
