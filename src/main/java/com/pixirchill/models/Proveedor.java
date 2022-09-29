package com.pixirchill.models;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    private String rfc; 
    private String razonSocial; 
    private String nombreContacto; 
    private String telPrincipal; 
    private String telMovil; 
    private String eMail; 
    private String estatus; 
    private Date fechaRegistro; 
}


