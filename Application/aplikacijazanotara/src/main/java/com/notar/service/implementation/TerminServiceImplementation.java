package com.notar.service.implementation;
import com.notar.model.dto.TerminDTO;
import com.notar.model.entity.Termin;
import com.notar.repository.TerminRepository;
import com.notar.service.functionality.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminServiceImplementation implements TerminService {
    @Autowired
    private TerminRepository terminRepository;

    @Override
    public Termin createTermin(TerminDTO terminDTO) {
        return null;
    }
}
