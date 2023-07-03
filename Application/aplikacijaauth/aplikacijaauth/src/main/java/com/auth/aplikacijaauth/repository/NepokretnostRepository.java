package com.auth.aplikacijaauth.repository;

import com.auth.aplikacijaauth.model.Nepokretnost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NepokretnostRepository extends JpaRepository<Nepokretnost, Integer> {
}