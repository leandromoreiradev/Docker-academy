package com.sample.person_service.controller;

import com.sample.person_service.dto.PersoRequestDTO;
import com.sample.person_service.dto.PessoaResponseDTO;
import com.sample.person_service.service.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "v1/persons")
public class PersonController {

    private final IPersonService IPersonService;

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping
    public ResponseEntity<PessoaResponseDTO> createPerson(@RequestBody PersoRequestDTO persoRequestDTO) {
        PessoaResponseDTO personDTO = IPersonService.createPerson(persoRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(personDTO);
    }
}
