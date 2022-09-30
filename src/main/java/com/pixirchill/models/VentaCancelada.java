package com.pixirchill.models;

import javax.persistence.*;
import java.util.Date;
import lombok.Data;

@Data
@Entity
public class VentaCancelada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPos;

    private Long idVentaCancel;

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