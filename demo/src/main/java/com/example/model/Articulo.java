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


public class Articulo {
    @Id
    private String MCODART;        // PK
    private String MDESCRIP;
    private String MABREVI;

    /* ─────────── Relaciones ─────────── */

    @JsonProperty("ccmtpt")
    @ManyToOne @JoinColumn(name = "MCODTPT", nullable = true)
    private Ccmtpt tipoProducto;

    @JsonProperty("ccmfam")
    @ManyToOne @JoinColumn(name = "MCODFAM", nullable = true)
    private Ccmfam familia;

    @JsonProperty("ccmcla")
    @ManyToOne @JoinColumn(name = "MCODCLA", nullable = true)
    private Ccmcla clase;

    /* ─────────── Campos simples ─────────── */
    private String MCODEQUI;
    private String MUNIDAD;
    private String MINDCTO;
    private String MINDDEC;
    private String MINDPRD;
    private String MINDSPRD;
    private String MINDCADU;
    private String MINDSERIE;
    private String MINDLOTE;
    private String MCTAARANC;

    private Date MFECULSA;
    private Date MFECULIN;
    private Date MFECULCO;
    private Date MFECUVEN;

    private BigDecimal MPENDING;
    private BigDecimal MPENDSAL;

    private String MCODACA;
    private String MCODLAD;
    private String MCODNOR;
    private String MCODFOR;
    private String MCOMI;
    private String MINSUMO;

    private BigDecimal MPESO;
    private BigDecimal MFACRUM;
    private String MESTADO;

    private BigDecimal MSTOCKINI;
    private String MGRUPO;
    private BigDecimal MCOSTOINI;
    private BigDecimal MCOSTO;
    private BigDecimal MCOSULCO;

    private String MCODALT;
    private String MCODCOL;

    private BigDecimal MSTOCK;
    private BigDecimal MSTOCKSAL;
    private BigDecimal MSTOCKENT;

    private String MCTAVEN;
    private String MCTADCTO;

    private BigDecimal MSTOCKMIN;
    private BigDecimal MSTOCKMAX;
    private BigDecimal MSTCOMPR;
    private BigDecimal MPVENTA;

    private String MPROCEDE;
    private String MCTACTB;

    private BigDecimal MFACUTIL;
    private BigDecimal MFACUT1;
    private BigDecimal MFACUTSG;

    private Date MFECREGI;
    private String MMDAULCO;
    private BigDecimal MVALREPOS;

    private String MLINSER;
    private BigDecimal MPORDCTO;
    private String MOFERTA;
    private Date MFCHVALOF;

    private BigDecimal MPVENTA1;
    private BigDecimal MPVTAS01;
    private BigDecimal MPVTAS02;
    private BigDecimal MPVTAS03;
    private BigDecimal MPVTAS04;
    private BigDecimal MPVTAS05;

    private BigDecimal MFACUT01;
    private BigDecimal MFACUT02;
    private BigDecimal MFACUT03;

    private BigDecimal MTIEMPO;

    private String MCODFMP;
    private String MCODPST;
    private String MCODBOC;
    private String MCAVI;

    private String MCODPRO;
    private String MCODCLI;

    private BigDecimal MTIEACA;

    private String MCODANT;
    private String MOBSERV;

    private String MCODGNR;
    private String MCODCLD;
    private String MCODTEN;

    private String MCODDESP;
    private String MCODUMED;

    private BigDecimal MPNETO;
    private BigDecimal MPBRUTO;

    private String MCODUSER;
    private Date MFECUACT;
    private String MHORUACT;

    private BigDecimal MPVTAS06;
    private BigDecimal MPVTAS07;
    private BigDecimal MPVTAS08;
    private BigDecimal MPVTAS09;
    private BigDecimal MPVTAS10;
    private BigDecimal MPVTAS11;
    private BigDecimal MPVTAS12;
    private BigDecimal MPVTAS13;
    private BigDecimal MPVTAS14;
    private BigDecimal MPVTAS15;
    private BigDecimal MPVTAS16;
    private BigDecimal MPVTAS17;
    private BigDecimal MPVTAS18;
    private BigDecimal MPVTAS19;
    private BigDecimal MPVTAS20;

    private String MAFE_IGV;
    private BigDecimal MPOR_ISC;
    private BigDecimal MPOR_COMI;

    private String MIND_ENS;
    private BigDecimal MROTA_EST;

    private BigDecimal MDIM_INT1;
    private BigDecimal MDIM_EXT1;
    private BigDecimal MDIM_ALT1;
    private BigDecimal MDIM_INT2;
    private BigDecimal MDIM_INT3M;
    private BigDecimal MDIM_EXT2;
    private BigDecimal MDIM_EXT3;
    private BigDecimal MDIM_ALT2;
    private BigDecimal MDIM_ALT3;

    private String MNRO_FAB;
    private String MGI_STRIA;
    private String MINDPROMO;

    private String MCOD_ORI;
    private String MDISENO;

    private BigDecimal MPLNCH_ESP;
    private BigDecimal MPLNCH_CAN;
    private BigDecimal MPASOSMTRZ;
    private BigDecimal MCASCO_PES;
    private BigDecimal MCASCO_ESP;
    private BigDecimal MTAPA_PES;
    private BigDecimal MTAPA_ESP;
    private BigDecimal MRESOR_PES;
    private BigDecimal MRESOR_ESP;
    private BigDecimal MRESOR_LON;
    private BigDecimal MRESOR_DIA;
    private BigDecimal MCAUCHCR_W;
    private BigDecimal MCAUCHSR_W;

    private String MN_CORECTI;
    private Date MF_CORECTI;

    private String MNRO_MEMO;
    private Date MFCH_MEMO;

    private String MNOMB_PLIS;

    private String MENVASE1;
    private BigDecimal MUNDENV1;
    private String MENVASE2;
    private BigDecimal MUNDENV2;

    private Date MFECCADU;
    private BigDecimal MPNETESC;
    private BigDecimal MNIVEXPM;

    private String MBOLIND;
    private String MBOLDES;
    private String MBOLUME;

    private BigDecimal MBOLPESO;
    private BigDecimal MBOLFCB;

    private String MCODUME1;
    private String MCODUME2;
    private String MCODUME3;
    private String MENVASE3;
    private BigDecimal MUNDENV3;
    private String MCODUME4;
    private String MENVASE4;
    private BigDecimal MUNDENV4;

    private String MINDOBSQ;
    private String MCODTIES;

    private String MRTACION;
    private String MAFEPERC;

    private String MCODSCLA;
    private String MCODVAR01;
    private String MCODVAR02;

    private BigDecimal mdisc_dia;
    private String mcoddctop;
    private String mcoddctoe;
    private BigDecimal mcantmin;
    private BigDecimal MPESOBRUTO;
    
      
}
