package com.pixirchill.models.compositekeys;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class VentaCanceladaPK implements Serializable{
    
    private Long idPos;
    private Long idVentaCancel;
    
}
