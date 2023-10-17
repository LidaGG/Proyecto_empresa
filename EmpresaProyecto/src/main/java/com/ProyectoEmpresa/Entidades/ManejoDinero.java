package com.ProyectoEmpresa.Entidades;

public class ManejoDinero {
    private double monto;
    private String concepto;
    private String encargado;

    public ManejoDinero(double monto, String concepto, String encargado) {
        this.monto = monto;
        this.concepto = concepto;
        this.encargado = encargado;
    }

    // Métodos para obtener y modificar el monto del movimiento
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Métodos para crear montos positivos y negativos
    public void agregarMonto(double monto) {
        this.monto += monto;
    }

    public void restarMonto(double monto) {
        this.monto -= monto;
    }

    // Métodos para obtener y modificar el concepto del movimiento
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    // Métodos para definir qué usuario fue encargado de registrar el movimiento
    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setEmpresaId(Long empresaId) {
    }

    public Object getEmpresaId() {
    }

    // Otros métodos y propiedades relacionados con el manejo de dinero
}
