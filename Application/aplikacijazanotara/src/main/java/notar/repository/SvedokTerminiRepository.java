package notar.repository;

import notar.model.entity.StrankaTermin;
import notar.model.entity.SvedokTermin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SvedokTerminiRepository extends JpaRepository<SvedokTermin, Long> {
}