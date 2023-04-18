package com.notar.repository;

import com.notar.model.entity.Notar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotarRepository extends JpaRepository<Notar, String> {
}
