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

public class Ccmcla {
  @Id
  @Column(name = "MCODCLA")
  private String mcodcla;

  @Column(name = "MDESCRIP")
  private String mdescrip;

  @Column(name = "MABREVI")
  private String mabrevi;

  @Column(name = "MCODTPT")
  private String mcodtpt;

  @Column(name = "MCODFAM")
  private String mcodfam;

  @Column(name = "MCODUSER")
  private String mcoduser;

  @Column(name = "MFECUACT")
  private LocalDate mfecuact;

  @Column(name = "MHORUACT")
  private String mhoruact;
}
  
