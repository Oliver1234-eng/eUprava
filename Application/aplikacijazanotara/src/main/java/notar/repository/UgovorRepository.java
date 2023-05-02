package notar.repository;

import notar.model.entity.Ugovor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UgovorRepository extends JpaRepository<Ugovor, Integer> {
}
