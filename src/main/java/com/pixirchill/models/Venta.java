package com.pixirchill.models;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPos;

    private Long idVenta;

    private String vendedor;
    private Long folio;
    private Date fechaVenta;
    private Double totalVendido;
    private Double pagoEfectivo;
    private Double pagoCheque;
    private Double pagoVales;
    private Double pagoTc;
    private String supervisor;
    private Double upload;
    private Long numRegistros;
    


}