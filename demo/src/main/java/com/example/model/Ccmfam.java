package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ccmfam {
    @Id
    private String MCODFAM;
    public String MDESCRIP ;
    public String MABREVI ;
    public String MCODTPT ;
    public String MCODUSER ;
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    public String MHORUACT ;
    public String MNOMBRE ;
    
}