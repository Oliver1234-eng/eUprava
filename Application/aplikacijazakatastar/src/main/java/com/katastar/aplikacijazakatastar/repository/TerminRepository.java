package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Termin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Integer> {
}
