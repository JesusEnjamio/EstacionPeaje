package dev.jesus.vehiculosypeaje.models;

public class Coche extends Vehiculo {

    public Coche(String placa) {
        super(placa);
    }

    @Override
    public int calcularPeaje() {
        return 100;
    }

    @Override
    public String getTipo() {
        return "Coche";
    }
}