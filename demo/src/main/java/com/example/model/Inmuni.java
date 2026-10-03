package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Inmuni {
    @Id
    private String MCODUMED ;
    private String MDESCRIP ;
    private String MABREVI ;
    private String MFACTOR ;
    private String MPORCEN ;
    private String MUNIDAD ;
    private String MSNT_UME ;
    private String MSNT_UMEXT ;
    
}
