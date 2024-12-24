package com.sample.person_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "tb_person")
public class Person implements Serializable {


    @Serial
    private static final long serialVersionUID = -4199444844216494919L;

    @EqualsAndHashCode.Include
    @Id
    private Long perssonId;
    private String name;
    private String cpf;
}
