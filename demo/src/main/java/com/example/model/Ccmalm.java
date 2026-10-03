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
public class Ccmalm {
    @Id
    private String MCODALM;
   
    private String MDESCRIP;
    private String MDIRECC;
    private String MCODUSER;
    
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    
    private String MHORUACT;
    private String MINDUBI;
    private String MINDISP;
    private String MINDDPR;
    private String MINDPASE;
    private String MSITUAC;
    private String MINDICA;
    
}
