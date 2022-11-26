package com.example.pkmail.entities;

import javax.persistence.*;

@Entity
@Table(name = "temporal")

public class pakmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "fecha_envio",nullable = true,length = 50)
    private String fecha_envio;

    @Column(name = "destino",nullable = true,length = 45)
    private String destino;

    @Column(name = "mensajeria",nullable = true,length = 18)
    private String mensajeria;

    @Column(name = "tipo_de_servicio",nullable = true,length = 28)
    private String tipo_de_servicio;

    @Column(name = "costo",nullable = true)
    private Integer costo;

    @Column(name = "sucursal",nullable = true,length = 12)
    private String sucursal;

    @Column(name = "cliente",nullable = true,length = 25)
    private String cliente;

    @Column(name = "tipo_de_envio",nullable = true,length = 9)
    private String tipo_de_envio;

    @Column(name = "forma_de_contacto",nullable = true,length = 22)
    private String forma_de_contacto;

    /*Getters n Setters*/


    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMensajeria() {
        return mensajeria;
    }

    public void setMensajeria(String mensajeria) {
        this.mensajeria = mensajeria;
    }

    public String getTipo_de_servicio() {
        return tipo_de_servicio;
    }

    public void setTipo_de_servicio(String tipo_de_servicio) {
        this.tipo_de_servicio = tipo_de_servicio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /* TO STRING */
    @Override
    public String toString() {
        return "pakmail{" +
                ", fecha_envio='" + fecha_envio + '\'' +
                ", destino='" + destino + '\'' +
                ", mensajeria='" + mensajeria + '\'' +
                ", tipo_de_servicio='" + tipo_de_servicio + '\'' +
                ", costo=" + costo +
                ", sucursal='" + sucursal + '\'' +
                ", cliente='" + cliente + '\'' +
                ", tipo_de_envio='" + tipo_de_envio + '\'' +
                ", forma_de_contacto='" + forma_de_contacto + '\'' +
                '}';
    }

    public String getTipo_de_envio() {
        return tipo_de_envio;
    }

    public void setTipo_de_envio(String tipo_de_envio) {
        this.tipo_de_envio = tipo_de_envio;
    }

    public String getForma_de_contacto() {
        return forma_de_contacto;
    }

    public void setForma_de_contacto(String forma_de_contacto) {
        this.forma_de_contacto = forma_de_contacto;
    }
}
