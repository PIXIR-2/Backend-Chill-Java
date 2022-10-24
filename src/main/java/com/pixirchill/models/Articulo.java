package com.pixirchill.models;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    private String codBarras;

    private String codAsociado;


    // @ManyToOne
    // @JoinColumn(name = "id_clasificacion")
    // // private Long idClasificacion; //Clasificacion
    // private Clasificacion clasificacion;

    // @ManyToOne
    // @JoinColumn(name = "id_unidad")
    // // private Long idUnidad; //UnidadMedida
    // private UnidadMedida unidadMedida;

    // @ManyToOne
    // @JoinColumn(name = "id_proveedor")
    // // private Long idProveedor; //Proveedor
    // private Proveedor proveedor;

    // @OneToOne
    // private ArticuloImagen articuloImagen;



    private String codInterno;
    private String descripcion;
    private String descripcionCorta;
    private Long cantidadUm;
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