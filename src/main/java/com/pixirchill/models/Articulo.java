package com.pixirchill.models;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Articulo {

    @Id
    private String codBarras;
    private String codAsociado;
    private Long idClasificacion; //Clasificacion
    private String codInterno;
    private String descripcion;
    private String descripcionCorta;
    private Long cantidadUm;
    private Long idUnidad; //UnidadMedida
    private Long idProveedor; //Proveedor
    private Double precioCompra;
    private Double utilidad;
    private Double precioVenta;
    private String tipoArticulo;
    private Double stock;
    private Double stockMin;
    private Double stockMax;
    private Double iva;
    private Date kitFechaIni;
    private Date kitFechaFin;
    private Boolean articuloDisponible;
    private Boolean kit;
    private Date fechaRegistro;
    private Boolean visible;
    private Long puntos;
    private Date lastUpdateInventory;
    private String cveProducto;



}