package practicaPB2;


import org.junit.Assert;
import org.junit.Test;


public class testTurnador {

	@Test
	public void testQueEntregueTurnoCorrecto() {
		Turnador turni = new Turnador();
		Integer VE = 2;
		Assert.assertTrue(turni.entregarTurno());
		Assert.assertTrue(turni.entregarTurno());
		Assert.assertEquals(VE, turni.getTurnosEspera().getLast());
	}

	@Test
	public void testAtenderTurno() {
		Turnador turni = new Turnador();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.atenderSiguiente();
		Integer VE = 1;
		Assert.assertEquals(VE, turni.getTurnosAtendido().getLast());
	}
	
	@Test
	public void testQueReseteeCuandoLlegaAlMaximoDeTurnos() {
		Turnador turni = new Turnador();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.entregarTurno();
		turni.entregarTurno();
		Integer VE = 1;
		Assert.assertEquals(VE, turni.getTurnosEspera().get(5));
	}
	
	@Test
	public void testQueDevuelvaLaCantidadDeTurnosEnEspera() {
		Turnador turni = new Turnador();
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
	}
	
	@Test
	public void testQueDevuelvaElTurnoActual() {
		Turnador turni = new Turnador();
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
	}
	
}
