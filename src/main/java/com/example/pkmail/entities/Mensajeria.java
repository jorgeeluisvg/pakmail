package com.example.pkmail.entities;

import javax.persistence.*;

@Entity
@Table(name = "temporal")

public class Mensajeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "mensajeria",nullable = true,length = 18)
    private String mensajeria;

    @Column(name = "costo",nullable = true)
    private Integer costo;

    @Column(name = "cantidad",nullable = true)
    private Integer cantidad;

    public String getMensajeria() {
        return mensajeria;
    }

    public void setMensajeria(String mensajeria) {
        this.mensajeria = mensajeria;
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

    @Override
    public String toString() {
        return "Mensajeria{" +
                "mensajeria='" + mensajeria + '\'' +
                ", costo='" + costo + '\'' +
                ", cantidad='" + cantidad + '\'' +
                '}';
    }
}
