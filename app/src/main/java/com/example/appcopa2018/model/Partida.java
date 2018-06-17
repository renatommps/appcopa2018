package com.example.appcopa2018.model;

import java.util.Date;

public class Partida {

    private int numero;
    private Date data;
    private String grupo;
    private String estadio;
    private String time1;
    private String time1flagUrl;
    private String time2;
    private String time2flagUrl;

    public Partida(int numero, Date data, String grupo, String estadio, String time1, String time1flagUrl, String time2, String time2flagUrl) {
        this.numero = numero;
        this.data = data;
        this.grupo = grupo;
        this.estadio = estadio;
        this.time1 = time1;
        this.time1flagUrl = time1flagUrl;
        this.time2 = time2;
        this.time2flagUrl = time2flagUrl;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime1flagUrl() {
        return time1flagUrl;
    }

    public void setTime1flagUrl(String time1flagUrl) {
        this.time1flagUrl = time1flagUrl;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTime2flagUrl() {
        return time2flagUrl;
    }

    public void setTime2flagUrl(String time2flagUrl) {
        this.time2flagUrl = time2flagUrl;
    }
}
