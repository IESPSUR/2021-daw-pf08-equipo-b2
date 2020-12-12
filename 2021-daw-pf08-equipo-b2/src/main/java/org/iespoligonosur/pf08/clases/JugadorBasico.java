package org.iespoligonosur.pf08.clases;

/**
 * Clases base de Jugadores.
 * Se deben implemenntar las clases hijas Tortuga, Liebre y CorreCaminos
 * @author eserrano
 *
 */
public abstract class JugadorBasico implements IJugador {

	protected String nombre;
	private int velocidadPunta;
	private int ultimaTirada;
	private int recorrido;
	
	private IDado dado;
	
	public JugadorBasico(String nombre, int velocidadPunta, int ultimaTirada, int recorrido) {
		this.nombre = nombre;
		this.velocidadPunta = velocidadPunta;
		this.ultimaTirada= ultimaTirada;
		this.recorrido = recorrido;
	}

	

//	public void  avanza() {
//		System.out.println("La tortuga avanza");
//	}
}
