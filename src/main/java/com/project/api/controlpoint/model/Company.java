package com.project.api.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {

    @Id
    private Long id;
    private String description;
    private String cnpj;
    private String adress;
    private String district;
    private String city;
    private String state;
    private String phone;


}
