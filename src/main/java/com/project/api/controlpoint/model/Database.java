package com.project.api.controlpoint.model;

import jdk.jfr.Category;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Database {

    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class DatabaseId implements Serializable{
        private Long databaseId;
        private Long movimentId;
        private Long userId;
    }
    @Id
    @EmbeddedId
    private DatabaseId id;
    private LocalDateTime workDate;
    private BigDecimal workHoursQuantity;
    private BigDecimal workHoursBalance;
}
