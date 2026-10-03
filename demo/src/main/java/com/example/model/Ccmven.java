package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ccmven {
    @Id
    private String MCODVEN;
    private String MNOMBRE ;
    private String MDIRECC;
    private String MDOCIDEN ;
    private BigDecimal MPORCEN ;
    private String MTIPVEN;
    private String MCODGVE ;
    private String MCODJVE ;
    private String MFCACOMI ;
    private String MCODUSER ;
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    private String MHORUACT ;
    private String MINDCOM ;
    private String MINDVEND ;
    private String MSITUAC ;
    private String MCLAVE ;
    
}
