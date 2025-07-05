package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ccmfam {
    @Id
    public String MCODFAM ;
    public String MDESCRIP ;
    public String MABREVI ;
    public String MCODTPT ;
    public String MCODUSER ;
    public Date MFECUACT ;
    public String MHORUACT ;
    public String MNOMBRE ;
    
}
