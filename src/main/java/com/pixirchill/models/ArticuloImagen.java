package com.pixirchill.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class ArticuloImagen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] imagen;

    private String urlImagen;
  


}