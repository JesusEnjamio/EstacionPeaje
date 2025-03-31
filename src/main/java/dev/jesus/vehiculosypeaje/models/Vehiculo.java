package dev.jesus.vehiculosypeaje.models;

public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract int calcularPeaje();

    public abstract String getTipo();
}