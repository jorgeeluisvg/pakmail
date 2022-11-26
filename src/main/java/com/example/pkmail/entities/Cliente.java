package com.example.pkmail.entities;

import javax.persistence.*;

@Entity
@Table(name = "temporal")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cliente",nullable = true,length = 18)
    private String cliente;

    @Column(name = "costo",nullable = true)
    private Integer costo;

    @Column(name = "cantidad",nullable = true)
    private Integer cantidad;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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
