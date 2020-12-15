package org.iespoligonosur.pf08.clases;

/**
<<<<<<< HEAD
 * Clases base de Jugadores.
 * Se deben implemenntar las clases hijas Tortuga, Liebre y CorreCaminos
 * @author angel
=======
 * Clases base de Jugadores. Se deben implemenntar las clases hijas Tortuga,
 * Liebre y CorreCaminos
 * 
 * @author eserrano
>>>>>>> ramaJavi
 *
 */
public abstract class JugadorBasico implements IJugador {

	protected String nombre;
	private int velocidadPunta;
	private int ultimaTirada;
	private int recorrido;

	private IDado dado;
<<<<<<< HEAD
	
	public JugadorBasico() {
		// TODO Auto-generated constructor stub
=======

	public JugadorBasico(String nombre, int velocidadPunta, int ultimaTirada, int recorrido) {
		this.nombre = nombre;
		this.velocidadPunta = velocidadPunta;
		this.ultimaTirada = ultimaTirada;
		this.recorrido = recorrido;
>>>>>>> ramaJavi
	}

	
}
