package com.sample.person_service.service;

import com.sample.person_service.dto.PersoRequestDTO;
import com.sample.person_service.dto.PessoaResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{
    @Override
    public PessoaResponseDTO createPerson(PersoRequestDTO persoRequestDTO) {
        return null;
    }
}
