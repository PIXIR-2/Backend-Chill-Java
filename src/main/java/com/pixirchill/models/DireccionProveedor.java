package com.pixirchill.models;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class DireccionProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    private String calle;
    private String noInt;
    private String noExt;
    private String colonia;
    private String locaalidad;
    private Long idEntidad;
    private Long idMunicipio;
    private String pais;
    private String codPostal;
   

}