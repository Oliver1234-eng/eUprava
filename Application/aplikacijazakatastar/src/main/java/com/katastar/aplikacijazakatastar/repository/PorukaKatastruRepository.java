package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.PorukaKatastru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorukaKatastruRepository extends JpaRepository<PorukaKatastru, Integer> {
}
