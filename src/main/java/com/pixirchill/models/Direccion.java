package com.pixirchill.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;


    // private Long idCliente;

    @OneToOne
    private Cliente cliente;

    private Long idMunicipio;
    private Long idEntidad;
    private String codigoPostal;
    private String colonia;
    private String calle;
    private String noInterior;
    private String noExterior;

}