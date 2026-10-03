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
public class Ccmtip {
    @Id
    private String MTIPOTRAN;
    private String MDESCRIP;
    private String MABREVI;
    private String MINGSAL;
    private String MINDVALOR;
    private String MINDCANTI;
    private String MINDRELAC;
    private String MINDTRNSF;
    private String MINDSUNAT;
    private String MTTRANSR;
    private String MINDOPER;
    private String MINDCCLTE;
    private String MINDCTRLA;
    private String MINDACP;
    private String MCODSUNAT;
    private String MDESSUNAT;
    private String MCODUSER;
    private String MSNT_TOA;
    private String MINDAUTIS;
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    private String MHORUACT;
    private String MINDICA;
  
}
