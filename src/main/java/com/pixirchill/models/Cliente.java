package com.pixirchill.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String rfc;
    private String razonSocial;
    private String regimenFiscal;
    private String contacto;
    private String eMail;
    private String eMail2;

}