package com.notar.repository;

import com.notar.model.entity.Svedok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SvedokRepository extends JpaRepository<Svedok, String> {
}
