package com.pixirchill.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClasificacion;
    
    private Long idClasificacionDep;
    private String descripcion;
    private Short nivelClasificacion;
}