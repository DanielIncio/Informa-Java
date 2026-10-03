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

public class Cpmcos {
    @Id
    private String MCODCOS;
    private String MDESCRIP ;
    private String MABREVI ;
    private String MINDMOD ;
    private String MCODUSER;
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    private String MHORUACT;
   
}