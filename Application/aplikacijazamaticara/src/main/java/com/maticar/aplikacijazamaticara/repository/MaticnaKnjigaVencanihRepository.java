package com.maticar.aplikacijazamaticara.repository;

import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaRodjenih;
import com.maticar.aplikacijazamaticara.model.MaticnaKnjigaVencanih;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaticnaKnjigaVencanihRepository extends JpaRepository<MaticnaKnjigaVencanih, String> {

    public List<MaticnaKnjigaVencanih> findAllByJmbgZene(String jmbg);
}
