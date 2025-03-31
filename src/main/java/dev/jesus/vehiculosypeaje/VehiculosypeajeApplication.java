package dev.jesus.vehiculosypeaje;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.jesus.vehiculosypeaje.models.Camion;
import dev.jesus.vehiculosypeaje.models.Coche;
import dev.jesus.vehiculosypeaje.models.EstacionPeaje;
import dev.jesus.vehiculosypeaje.models.Moto;
import dev.jesus.vehiculosypeaje.services.PeajeService;

@SpringBootApplication
public class VehiculosypeajeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(VehiculosypeajeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Bogotá");
        PeajeService peajeService = new PeajeService(estacion);

        
        peajeService.procesarVehiculo(new Coche("ABC123"));
        peajeService.procesarVehiculo(new Moto("XYZ987"));
        peajeService.procesarVehiculo(new Camion("TRK555", 4));
        peajeService.procesarVehiculo(new Camion("TRK777", 2));

        peajeService.mostrarReporteFinal();
    }
}
