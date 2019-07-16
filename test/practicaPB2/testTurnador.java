package practicaPB2;


import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;


public class testTurnador {

	@Test
	public void testAtenderSiguienteTurno() {
		try {
			Turnador turni = new Turnador(5);
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.atenderSiguiente();
			Integer VE = 1;
			Assert.assertEquals(VE, turni.getTurnosAtendido().getLast());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testQueReseteeCuandoLlegaAlMaximoDeTurnos(){
		try {
			Turnador turni = new Turnador(5);
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			Integer VE = 1;
			Assert.assertEquals(VE, turni.getTurnosEspera().get(5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testQueDevuelvaLaCantidadDeTurnosEnEspera() {
		try {
			Turnador turni = new Turnador(5);
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			Integer VE = 2;
			Assert.assertEquals(VE, turni.contarTurnosEntregados());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testQueDevuelvaElTurnoActual() {
		try {
			Turnador turni = new Turnador(5);
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.entregarTurno();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			turni.atenderSiguiente();
			Integer VE = 4;
			Assert.assertEquals(VE, turni.obtenerTurnoActual());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(expected = Exception.class)
	public void testEsperaUnaExcepcion() throws Exception {
		
			Turnador turni = new Turnador(0); //No hace falta agregar nada mas. Al crear un Turnador con cero turnos, va a saltar la Excepcion
		
	}
	
	@Test
	public void testQueMuestreElMensajeDeLaExcepcion() {
		
			try {
				Turnador turni = new Turnador(0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //No hace falta agregar nada mas. Al crear un Turnador con cero turnos, va a saltar la Excepcion
		
	}
	
}
