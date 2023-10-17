package com.example.demo.Entidades;

public class ManejoDinero {
    private double monto;
    private String concepto;
    private String encargado;

    public ManejoDinero(double monto, String concepto, String encargado) {
        this.monto = monto;
        this.concepto = concepto;
        this.encargado = encargado;
    }

    public ManejoDinero() {
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
}
