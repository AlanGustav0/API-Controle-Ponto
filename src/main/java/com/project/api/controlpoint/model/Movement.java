package com.project.api.controlpoint.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {

    //Classe utilizada para fazer a serialização das chaves primárias e compostas.
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentId implements Serializable{
        private Long movimentId;
        private Long userId;
    }
    //Definição do ID e atributos da classe Moviment
    @Id
    @EmbeddedId
    private MovimentId id;
    private LocalDateTime enterDate;
    private LocalDateTime exitDate;
    private BigDecimal timeCourse;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
