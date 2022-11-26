package com.example.pkmail.entities;

import javax.persistence.*;

@Entity
public class Cliente2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cliente",nullable = true)
    private String cliente;

    @Column(name = "Enero",nullable = true)
    private String Enero;

    @Column(name = "Febrero",nullable = true)
    private String Febrero;

    @Column(name = "Marzo",nullable = true)
    private String Marzo;

    @Column(name = "Abril",nullable = true)
    private String Abril;

    @Column(name = "Mayo",nullable = true)
    private String Mayo;

    @Column(name = "Junio",nullable = true)
    private String Junio;

    @Column(name = "Julio",nullable = true)
    private String Julio;

    @Column(name = "Agosto",nullable = true)
    private String Agosto;

    @Column(name = "Septiembre",nullable = true)
    private String Septiembre;

    @Column(name = "Octubre",nullable = true)
    private String Octubre;

    @Column(name = "Noviembre",nullable = true)
    private String Noviembre;

    @Column(name = "Diciembre",nullable = true)
    private String Diciembre;

    @Column(name = "Total",nullable = true)
    private String Total;

    @Column(name = "Total_impor",nullable = true)
    private String Total_impor;

    @Column(name = "anio",nullable = true)
    private String anio;

    /* GETTERS SETTERS */

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEnero() {
        return Enero;
    }

    public void setEnero(String enero) {
        Enero = enero;
    }

    public String getFebrero() {
        return Febrero;
    }

    public void setFebrero(String febrero) {
        Febrero = febrero;
    }

    public String getMarzo() {
        return Marzo;
    }

    public void setMarzo(String marzo) {
        Marzo = marzo;
    }

    public String getAbril() {
        return Abril;
    }

    public void setAbril(String abril) {
        Abril = abril;
    }

    public String getMayo() {
        return Mayo;
    }

    public void setMayo(String mayo) {
        Mayo = mayo;
    }

    public String getJunio() {
        return Junio;
    }

    public void setJunio(String junio) {
        Junio = junio;
    }

    public String getJulio() {
        return Julio;
    }

    public void setJulio(String julio) {
        Julio = julio;
    }

    public String getAgosto() {
        return Agosto;
    }

    public void setAgosto(String agosto) {
        Agosto = agosto;
    }

    public String getSeptiembre() {
        return Septiembre;
    }

    public void setSeptiembre(String septiembre) {
        Septiembre = septiembre;
    }

    public String getOctubre() {
        return Octubre;
    }

    public void setOctubre(String octubre) {
        Octubre = octubre;
    }

    public String getNoviembre() {
        return Noviembre;
    }

    public void setNoviembre(String noviembre) {
        Noviembre = noviembre;
    }

    public String getDiciembre() {
        return Diciembre;
    }

    public void setDiciembre(String diciembre) {
        Diciembre = diciembre;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getTotal_impor() {
        return Total_impor;
    }

    public void setTotal_impor(String total_impor) {
        Total_impor = total_impor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
