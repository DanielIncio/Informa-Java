package com.example.model;
import com.fasterxml.jackson.annotation.JsonProperty; //Permite cambiar el nombre de un atributo cuando se serializa/deserializa JSON. Ej.: @JsonProperty("codigo") private String mcodtpt.
import jakarta.persistence.Column; //Personaliza columnas (nombre, nullable, length, etc.) con @Column.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;//Se usan cuando el @Id es autoincremental o se genera con una secuencia.
import jakarta.persistence.GenerationType;//Se usan cuando el @Id es autoincremental o se genera con una secuencia.
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ccmtpt {
    @Id
    public String MCODTPT;
    public String MDESCRIP;
    public String MABREVI;
    public String MCODUSER;
    
    @Column(name = "MFECUACT")
    private LocalDate mfecuact;
    
    public String MHORUACT;
    
}
