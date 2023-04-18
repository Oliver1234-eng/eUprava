package com.notar.repository;

import com.notar.model.entity.Stranka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrankaRepository extends JpaRepository<Stranka, String> {
}
