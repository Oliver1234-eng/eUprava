package notar.repository;

import notar.model.entity.KancelarijaTermin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KancelarijaTerminRepository extends JpaRepository<KancelarijaTermin, Long> {
}

