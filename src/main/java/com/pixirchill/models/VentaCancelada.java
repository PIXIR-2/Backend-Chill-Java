package com.pixirchill.models;

import javax.persistence.*;

import com.pixirchill.models.compositekeys.*;

import java.util.Date;
import lombok.Data;

@Data
@Entity
public class VentaCancelada {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private VentaCanceladaPK ventaCanceladaPK;
   
    // private Long idPos;

    // private Long idVentaCancel;

    private String vendedor;
    private Date fecha;
    private Double totalVendido;
    private Double pagoEfectivo;
    private Double pagoCheque;
    private Double pagoVales;
    private Double pagoTc;
    private String status;
    private String supervisor;
    private Double upload;
    


}