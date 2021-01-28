package org.iespoligonosur.pf08.clases;

import java.util.Random;



public class Tortuga extends JugadorBasico {

	private static final TipoJugador tipo = TipoJugador.TORTUGA;
	
	
	public Tortuga(String nombre, int velocidadPunta, int ultimaTirada, int recorrido) {
		super(nombre, velocidadPunta, ultimaTirada, recorrido);
		
	}

	public static void lanzarDadoTortuga() {
		Random dado = new Random();
		int nuno = 1+dado.nextInt(3);
	}
	
	
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public TipoJugador getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVelocidadUltimoTurno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidadAlcanzadaMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avanza() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Nombre de la Tortuga: " + nombre;
	}

}
