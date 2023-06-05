package notar.repository;

import notar.model.entity.UgovorOPrenosuZemljista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UgovorOPrenosuZemljistaRepository extends JpaRepository<UgovorOPrenosuZemljista, Integer> {
}
