package com.maticar.aplikacijazamaticara.repository;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaUmrlih;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaticnaKnjigaUmrlihRepository extends JpaRepository<MaticnaKnjigaUmrlih, String> {

    public List<MaticnaKnjigaUmrlih> findAllByJmbg(String jmbg);
}
