package com.notar.service.implementation;

import com.notar.model.dto.UgovorDTO;
import com.notar.model.entity.Ugovor;
import com.notar.repository.UgovorRepository;
import com.notar.service.functionality.UgovorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UgovorServiceImplementation implements UgovorService {
    @Autowired
    private UgovorRepository ugovorRepository;

    @Override
    public Ugovor createUgovor(UgovorDTO ugovorDTO) {
        return null;
    }
}
