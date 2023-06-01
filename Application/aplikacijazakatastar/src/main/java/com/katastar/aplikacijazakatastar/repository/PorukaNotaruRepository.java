package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.PorukaNotaru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorukaNotaruRepository extends JpaRepository<PorukaNotaru, Integer> {
}
