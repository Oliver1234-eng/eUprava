package com.notar.repository;

import com.notar.model.entity.Kancelarija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KancelarijaRepository extends JpaRepository<Kancelarija, String> {
}
