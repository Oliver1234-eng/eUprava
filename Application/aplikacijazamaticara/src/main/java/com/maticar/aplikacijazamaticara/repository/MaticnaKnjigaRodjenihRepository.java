package com.maticar.aplikacijazamaticara.repository;

import com.maticar.aplikacijazamaticara.model.Korisnik;
import com.maticar.aplikacijazamaticara.model.Maticar;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaticnaKnjigaRodjenihRepository extends JpaRepository<MaticnaKnjigaRodjenih, String> {

    public List<MaticnaKnjigaRodjenih> findAllByJmbg(String jmbg);
}
