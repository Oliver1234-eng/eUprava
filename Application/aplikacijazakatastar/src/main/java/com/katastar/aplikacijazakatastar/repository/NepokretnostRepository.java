package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Nepokretnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NepokretnostRepository extends JpaRepository<Nepokretnost, Integer> {

    @Query("select n from Nepokretnost n join fetch n.istorijePromena e where n.id =?1")
    public Nepokretnost findOneWithIstorijePromena(Integer nepokretnostId);
}
