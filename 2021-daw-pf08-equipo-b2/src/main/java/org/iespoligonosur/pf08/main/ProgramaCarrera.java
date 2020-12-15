package org.iespoligonosur.pf08.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.iespoligonosur.pf08.clases.Correcaminos;
import org.iespoligonosur.pf08.clases.IJugador;
import org.iespoligonosur.pf08.clases.JugadorBasico;
import org.iespoligonosur.pf08.clases.Liebre;
import org.iespoligonosur.pf08.clases.Tortuga;

public class ProgramaCarrera {

	static Scanner sc = new Scanner(System.in);
	// Array con los jugadores
	private static IJugador[] jugadores = new IJugador[6];
	private static int longitudPistaCarreras = 100;
	private int turno;
	private static LocalDateTime inicioPartida;
	private static LocalDateTime finalPartida;
	public static int resPersonaje;

	public ProgramaCarrera() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este metodo ejecutara el programa de Carreras El usuario debe poder realizar
	 * tantas carreras como quiera Se pueden repetir carreras con los usuarios
	 * creados Se pueden repetir carreras creando nuevos usuarios
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int resNumCarrera;
		String nombre = "";
		int velocidadPunta = 0;
		int ultimaTirada = 0;
		int recorrido = 0;

//		Tortuga t = new Tortuga(nombre, 0, 0, 0);

		System.out.println("Bienvenido al juego de Carreras");
		System.out.println("�Cuantas carrerar desea realizar?");
		resNumCarrera = sc.nextInt();

		System.out.println("Ha elegido " + resNumCarrera + " carreras");

		for (int i = 1; i <= resNumCarrera; i++) {

			System.out.println(i + "� carrera");
			creaJugadores(jugadores);

		}
	}

	/**
	 * Este metodo se encarga de crear uno a uno hasta 6 jugadores con la ayuda del
	 * usuario que introduce los datos a través de la consola.
	 */
	private static void creaJugadores(IJugador[] jugadores) {

		int resNumJugador = 0;
		int resPersonaje = 0;
		String nombre;

		do {

			try {
				System.out.println("Elige de 2 a 6 jugadores");
				resNumJugador = sc.nextInt();
				for (int i = 0; i < jugadores.length; i++) {
					jugadores [i] = jugadores [resNumJugador];
				}

				if (resNumJugador >= 2 && resNumJugador <= 6) {

					System.out.println("Has elegido " + resNumJugador + " jugadores");
				} else {
					throw new ArithmeticException();
				}

			} catch (ArithmeticException e) {
				System.out.println("Solo se pueden introducir de 2 a 6 jugadores");

			}

		} while (resNumJugador < 2 || resNumJugador > 6);

		for (int i = 1; i <= resNumJugador; i++) {

			do {
				System.out.println(i + "� jugador");
				System.out.println("Elige personaje: \n1 Tortuga \n2 Liebre \n3 Correcaminos");
				resPersonaje = sc.nextInt();

				switch (resPersonaje) {
				case 1:
					System.out.println("Has elegido Tortuga");
					System.out.println("Escribe un nombre para tu personaje Tortuga");
					nombre = sc.next();
					Tortuga t = new Tortuga(nombre, 0, 0, 0);
					System.out.println(t);
					break;
				case 2:
					System.out.println("Has elegido Liebre");
					System.out.println("Escribe un nombre para tu personaje Liebre");
					nombre = sc.next();
					Liebre l = new Liebre(nombre, 0, 0, 0);
					System.out.println(l);
					break;
				case 3:
					System.out.println("Has elegido Correcaminos");
					System.out.println("Escribe un nombre para tu personaje Correcaminos");
					nombre = sc.next();
					Correcaminos c = new Correcaminos(nombre, 0, 0, 0);
					System.out.println(c);
					break;
				default:

					System.out.println("Personaje incorrecto");

				}
			}
			while ((resPersonaje == 1 || resPersonaje == 2 || resPersonaje == 3) == false);

		}
		iniciaPartida(longitudPistaCarreras);
	}

	/**
	 * Este metodo inicia la partida con los jugadores ya previamente creados por el
	 * usuario La partida termina cuando cualquiera de los jugadores recorre toda la
	 * longitud determinada para la pista alcanzando la meta.
	 */
	private static void iniciaPartida(int longitudPistaCarreras) {
		
		System.out.println("Inicia la carrera");
		System.out.println("*****************");
		inicioPartida = LocalDateTime.now();
		System.out.println("Temporizador: " + inicioPartida);
		for(int i = 0; i < longitudPistaCarreras; i++) {
			System.out.println("Turno Primer Jugador");
			System.out.println("Turno Segundo Jugador");
		}

	}

	/**
	 * Este metodo realiza una representacion grafica en consola de la pista y la
	 * posicion de los jugadores en la misma
	 */
	private void pintaCarrera() {

	}

	/**
	 * Este metodo llama al metodo avanza para cada uno de los participantes de la
	 * carrea para ejecutar un turno de la carrera
	 */
	private void ejecutaTurno() {

	}

	/**
	 * Este método debe imprimir la estadística de la carrera Fecha y Hora de la
	 * realización Duración en minutos Número de participantes Ranking de
	 * participantes Velocidad Punta Máxima y Jugador que la alcanzó Velocidad
	 * Media más alta y jugador que la alcanzo
	 */
	private void imprimeEstadisticaCarrera() {

	}

	/**
	 * Devuelve del array de participantes el jugador que alcanzo la mayor velocidad
	 * punta
	 * 
	 * @return
	 */
	private IJugador masVeloz() {
		return null;
	}

	/**
	 * Devuelve del array de participantes el jugador que alcanzo la mayor velocidad
	 * media
	 * 
	 * @return
	 */
	private IJugador mayorMedia() {
		return null;
	}

	/**
	 * Método que devuelve un array de Jugadores con los jugadores de la partida
	 * ordenados por puesto de carrera. En caso de que dos jugadores lleguen a meta
	 * en el mismo turno, o sin llegar a meta empaten en el numero de pasos
	 * recorridos, gana aquel que su velocidad en el ultimo turno fuera mas alta
	 * 
	 * @return
	 */
	private IJugador[] ordenaRanking() {
		return null;
	}

}
