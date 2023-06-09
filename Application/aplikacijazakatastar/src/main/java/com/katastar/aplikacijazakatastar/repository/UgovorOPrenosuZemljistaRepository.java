package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.UgovorOPrenosuZemljista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UgovorOPrenosuZemljistaRepository extends JpaRepository<UgovorOPrenosuZemljista, Integer> {
}
