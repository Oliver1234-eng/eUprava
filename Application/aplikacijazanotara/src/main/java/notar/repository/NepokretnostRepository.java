package notar.repository;


import notar.model.entity.Nepokretnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NepokretnostRepository extends JpaRepository<Nepokretnost, String> {

}
