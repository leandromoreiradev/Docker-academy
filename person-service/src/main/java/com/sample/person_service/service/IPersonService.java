package com.sample.person_service.service;

import com.sample.person_service.dto.PersoRequestDTO;
import com.sample.person_service.dto.PessoaResponseDTO;

public interface IPersonService {
    PessoaResponseDTO createPerson(PersoRequestDTO persoRequestDTO);
}
