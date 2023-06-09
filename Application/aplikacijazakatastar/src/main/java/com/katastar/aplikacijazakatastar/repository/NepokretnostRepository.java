package com.katastar.aplikacijazakatastar.repository;

import com.katastar.aplikacijazakatastar.model.Nepokretnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NepokretnostRepository extends JpaRepository<Nepokretnost, String> {

}
