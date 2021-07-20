package com.project.api.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Entity
public class Location {

    @Id
    private Long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
