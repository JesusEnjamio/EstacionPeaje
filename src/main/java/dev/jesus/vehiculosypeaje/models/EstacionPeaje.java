package dev.jesus.vehiculosypeaje.models;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private int totalRecaudado;
    private List<Vehiculo> vehiculosAtendidos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculosAtendidos = new ArrayList<>();
    }

    public void atenderVehiculo(Vehiculo v) {
        int peaje = v.calcularPeaje();
        totalRecaudado += peaje;
        vehiculosAtendidos.add(v);
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public List<Vehiculo> getVehiculosAtendidos() {
        return vehiculosAtendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
