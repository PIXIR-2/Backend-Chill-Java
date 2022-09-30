package com.pixirchill.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class VentaCanceladaArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPos;

    private Long idVentaCancel;



    // private Long noArticulo;
    // private Articulo articulo;


    private String codBarras;
    private Double cantidad;
    private Boolean articuloOfertado;
    private Double precioRegular;
    private Boolean cambioPrecio;
    private Double precioVta;
    private Double porcentDesc;
    private String userName;
    



}