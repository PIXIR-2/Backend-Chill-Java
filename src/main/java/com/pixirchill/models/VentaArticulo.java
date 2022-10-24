package com.pixirchill.models;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class VentaArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPos;

    
    private Long idVenta;
    private String noArticulo;
    private Long userCodeBascula;
    private Double cantidad;
    private Boolean articuloOfertado;
    private Double precioRegular;
    private Boolean cambioPrecio;
    private Double iva;
    private Double precioVta;
    private Double porcentDesc;
    private Double cantDevuelta;
    private String userName;
    private Long idPromo;
    private Long noPromoAplicado;


}