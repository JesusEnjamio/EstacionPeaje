package dev.jesus.vehiculosypeaje.services;

import dev.jesus.vehiculosypeaje.models.EstacionPeaje;
import dev.jesus.vehiculosypeaje.models.Vehiculo;

public class PeajeService {
    private EstacionPeaje estacion;

    public PeajeService(EstacionPeaje estacion) {
        this.estacion = estacion;
    }

    public void procesarVehiculo(Vehiculo vehiculo) {
        System.out.println("Procesando vehículo: " + vehiculo.getTipo() + " - Placa: " + vehiculo.getPlaca());
        int valor = vehiculo.calcularPeaje();
        System.out.println("Valor del peaje: $" + valor);
        estacion.atenderVehiculo(vehiculo);
    }

    public void mostrarReporteFinal() {
        System.out.println("\n--- Reporte Final ---");
        System.out.println("Estación: " + estacion.getNombre() + " - Ciudad: " + estacion.getCiudad());
        System.out.println("Vehículos atendidos:");
        for (Vehiculo v : estacion.getVehiculosAtendidos()) {
            System.out.println("• " + v.getTipo() + " - Placa: " + v.getPlaca());
        }
        System.out.println("Total recaudado: $" + estacion.getTotalRecaudado());
    }
}