package dev.jesus.vehiculosypeaje.models;

public class Moto extends Vehiculo {

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public int calcularPeaje() {
        return 50;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}