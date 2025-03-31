package dev.jesus.vehiculosypeaje.services;

import dev.jesus.vehiculosypeaje.models.EstacionPeaje;
import dev.jesus.vehiculosypeaje.models.Vehiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;


import static org.mockito.Mockito.*;

class PeajeServiceTest {

    private EstacionPeaje estacionMock;
    private PeajeService peajeService;

    @BeforeEach
    void setUp() {
        estacionMock = Mockito.mock(EstacionPeaje.class);
        peajeService = new PeajeService(estacionMock);
    }

    @Test
    void testProcesarVehiculo() {
        Vehiculo vehiculoMock = Mockito.mock(Vehiculo.class);
        when(vehiculoMock.getTipo()).thenReturn("Automóvil");
        when(vehiculoMock.getPlaca()).thenReturn("ABC123");
        when(vehiculoMock.calcularPeaje()).thenReturn(5000);

        peajeService.procesarVehiculo(vehiculoMock);

        verify(estacionMock, times(1)).atenderVehiculo(vehiculoMock);
        verify(vehiculoMock, times(1)).calcularPeaje();
        verify(vehiculoMock, times(1)).getTipo();
        verify(vehiculoMock, times(1)).getPlaca();
    }

    @Test
    void testMostrarReporteFinal() {
        Vehiculo vehiculo1 = mock(Vehiculo.class);
        Vehiculo vehiculo2 = mock(Vehiculo.class);
    
        when(vehiculo1.getPlaca()).thenReturn("XYZ789");
        when(vehiculo1.getTipo()).thenReturn("Camioneta");
        when(vehiculo1.calcularPeaje()).thenReturn(5000);
        when(vehiculo2.getPlaca()).thenReturn("MNO456");
        when(vehiculo2.getTipo()).thenReturn("Moto");
        when(vehiculo2.calcularPeaje()).thenReturn(3000);

       
        when(estacionMock.getVehiculosAtendidos()).thenReturn(Arrays.asList(vehiculo1, vehiculo2));
        when(estacionMock.getTotalRecaudado()).thenReturn(15000);

        peajeService.mostrarReporteFinal();
    
        verify(estacionMock, times(1)).getNombre();      
        verify(estacionMock, times(1)).getVehiculosAtendidos();
        verify(estacionMock, times(1)).getTotalRecaudado();
    }}