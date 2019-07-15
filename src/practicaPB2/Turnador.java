package practicaPB2;

import java.util.LinkedList;

public class Turnador {
	private LinkedList<Integer> turnosEspera = new LinkedList<Integer>();
	private LinkedList<Integer> turnosAtendido = new LinkedList<Integer>();
	private Integer cantMaxTurno;
	private Integer contadorTurno = 0;
	
	public Turnador() {
		cantMaxTurno = 5;
	}
	
	public Integer obtenerTurnoActual() {
		return turnosAtendido.getLast();
	}
	
	public Boolean entregarTurno() {
		contadorTurno++;
		if (contadorTurno > cantMaxTurno) {
			contadorTurno = 1;
		}
		return turnosEspera.add(contadorTurno);
	}
	
	public void atenderSiguiente() {
		turnosAtendido.add(turnosEspera.getFirst());
		turnosEspera.removeFirst();
	}
	
	public Integer contarTurnosEntregados() {
		return turnosEspera.size();
	}
	
	public Integer contarTurnosAtendidos() {
		return turnosAtendido.size();
	}

	public LinkedList<Integer> getTurnosEspera() {
		return turnosEspera;
	}

	public void setTurnosEspera(LinkedList<Integer> turnosEspera) {
		this.turnosEspera = turnosEspera;
	}

	public LinkedList<Integer> getTurnosAtendido() {
		return turnosAtendido;
	}

	public void setTurnosAtendido(LinkedList<Integer> turnosAtendido) {
		this.turnosAtendido = turnosAtendido;
	}

	public Integer getCantMaxTurno() {
		return cantMaxTurno;
	}

	public void setCantMaxTurno(Integer cantMaxTurno) {
		this.cantMaxTurno = cantMaxTurno;
	}

	public Integer getContadorTurno() {
		return contadorTurno;
	}

	public void setContadorTurno(Integer contadorTurno) {
		this.contadorTurno = contadorTurno;
	}
	
	
	
}
