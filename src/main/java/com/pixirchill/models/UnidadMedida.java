package com.pixirchill.models;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class UnidadMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnidad;
    private String descripcion;
    private Date fechaRegistro;
    private String cveSat;
   
}