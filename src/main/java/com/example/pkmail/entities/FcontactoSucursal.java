package com.example.pkmail.entities;

import javax.persistence.*;

@Entity
@Table(name = "temporal")
public class FcontactoSucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "forma_de_contacto",nullable = true,length = 18)
    private String formacontacto;

    @Column(name = "sucursal",nullable = true,length = 18)
    private String sucursal;

    @Column(name = "costo",nullable = true)
    private Integer costo;

    @Column(name = "cantidad",nullable = true)
    private Integer cantidad;

    public String getFormacontacto() {
        return formacontacto;
    }

    public void setFormacontacto(String formacontacto) {
        this.formacontacto = formacontacto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
