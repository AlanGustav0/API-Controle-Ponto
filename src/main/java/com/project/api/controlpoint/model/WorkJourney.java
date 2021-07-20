package com.project.api.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//É possível utilizar apenas a notação @Data, porém foi utilizada as outras
// notações para exemplificar e por questões didáticas
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class WorkJourney {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String description;


}
