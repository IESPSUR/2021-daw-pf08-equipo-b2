package org.iespoligonosur.pf08.clases;

public class Liebre extends JugadorBasico {

	private static final TipoJugador tipo = TipoJugador.LIEBRE;
	
	public Liebre(String nombre, int velocidadPunta, int ultimaTirada, int recorrido) {
		super(nombre, velocidadPunta, ultimaTirada, recorrido);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
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
		return "Nombre de la Liebre: " + nombre;
	}

}
