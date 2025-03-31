package dev.jesus.vehiculosypeaje.models;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    @Override
    public int calcularPeaje() {
        return 50 * ejes;
    }

    @Override
    public String getTipo() {
        return "Camión (" + ejes + " ejes)";
    }
}