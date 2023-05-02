package notar.repository;

import notar.model.entity.StrankaTermin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrankaTerminiRepository extends JpaRepository<StrankaTermin, Long> {
}
