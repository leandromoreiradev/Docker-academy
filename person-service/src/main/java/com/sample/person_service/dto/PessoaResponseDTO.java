package com.sample.person_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PessoaResponseDTO {
    private Long perssonId;
    private String name;
    private String cpf;
}
