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
public class Ccmtrs {
    @Id
    private String MCODTRSP;
    private String MNOMBRE;
    private String MDIRECC ;
    private String MTELEF1 ;
    private String MTELEF2 ;
    private String MFAX ;
    private String MCODPAI ;
    private String MPERSONA ;
    private String MRUCTRSP;
    private Date MFCHREGIS ;
    private String MPLACA ;
    private String MCAPACI ;
    private String MCHOFER ;
    private String MCODUSER ;
    
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    
    private String MHORUACT ;
    private String MCODCVE;
    private String MCODUTR ;
    private String MLOCALID;
    private String MINDACT;
    private String MTIPTRSUNAT;
    private String MUBIGEO;
}
