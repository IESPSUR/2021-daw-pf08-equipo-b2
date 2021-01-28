package org.iespoligonosur.pf08.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.iespoligonosur.pf08.clases.Correcaminos;
import org.iespoligonosur.pf08.clases.DadoNCaras;
import org.iespoligonosur.pf08.clases.IJugador;
import org.iespoligonosur.pf08.clases.JugadorBasico;
import org.iespoligonosur.pf08.clases.Liebre;
import org.iespoligonosur.pf08.clases.Tortuga;

public class ProgramaCarrera {

	static Scanner sc = new Scanner(System.in);
	// Array con los jugadores
	private static IJugador jugadores[] = new IJugador[6];
	private static int longitudPistaCarreras = 100;
	private int turno;
	private static LocalDateTime inicioPartida;
	private static LocalDateTime finalPartida;

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
		int resultado = 0;
		int resPersonaje = 0;
		int resNumJugador = 0;

		System.out.println("Bienvenido al juego de Carreras");
		System.out.println("Cuantas carrerar desea realizar?");
		resNumCarrera = sc.nextInt();

		System.out.println("Ha elegido " + resNumCarrera + " carreras");

		int numJugadores = 0;

		for (int i = 1; i <= resNumCarrera; i++) {

			System.out.println(i + " carrera");
			numJugadores = creaJugadores();
			for (int j = 0; j < numJugadores; j++) {
				System.out.println(jugadores[j].getNombre());
			}
			iniciaPartida(resPersonaje, recorrido, resultado, resNumJugador);
		}
	}

	/**
	 * Este metodo se encarga de crear uno a uno hasta 6 jugadores con la ayuda del
	 * usuario que introduce los datos a través de la consola.
	 */
	private static int creaJugadores() {

		int resNumJugador = 0;
		int resPersonaje = 0;
		String nombre = "";

		System.out.println("Elige de 2 a 6 jugadores");
		do {

			try {

				resNumJugador = sc.nextInt();

				if (resNumJugador >= 2 && resNumJugador <= 6) {

					System.out.println("Has elegido " + resNumJugador + " jugadores");

				} else {
					throw new ArithmeticException();
				}

			} catch (ArithmeticException e) {
				System.out.println("Solo se pueden introducir de 2 a 6 jugadores");

			}

		} while (resNumJugador < 2 || resNumJugador > 6);

		for (int i = 0; i < resNumJugador; i++) {

			do {
				System.out.println((i + 1) + " jugador");
				System.out.println("Elige personaje: \n1 Tortuga \n2 Liebre \n3 Correcaminos");
				resPersonaje = sc.nextInt();

				switch (resPersonaje) {
				case 1:
					System.out.println("Has elegido Tortuga");
					System.out.println("Escribe un nombre para tu personaje Tortuga");
					nombre = sc.next();
					System.out.println("Tu personaje tortuga se llama " + nombre);
					jugadores[i] = new Tortuga(nombre, 0, 0, 0);
					break;
				case 2:
					System.out.println("Has elegido Liebre");
					System.out.println("Escribe un nombre para tu personaje Liebre");
					nombre = sc.next();
					System.out.println("Tu personaje liebre se llama " + nombre);
					jugadores[i] = new Liebre(nombre, 0, 0, 0);
					break;
				case 3:
					System.out.println("Has elegido Correcaminos");
					System.out.println("Escribe un nombre para tu personaje Correcaminos");
					nombre = sc.next();
					System.out.println("Tu personaje correcaminos se llama " + nombre);
					jugadores[i] = new Correcaminos(nombre, 0, 0, 0);
					break;
				default:

					System.out.println("Personaje incorrecto");

				}

			} while ((resPersonaje == 1 || resPersonaje == 2 || resPersonaje == 3) == false);

			System.out.println("Los jugadores son:");
		}
		return resNumJugador;

	}

	/**
	 * Este metodo inicia la partida con los jugadores ya previamente creados por el
	 * usuario La partida termina cuando cualquiera de los jugadores recorre toda la
	 * longitud determinada para la pista alcanzando la meta.
	 */
	private static void iniciaPartida(int resPersonaje, int recorrido, int resultado, int resNumJugador) {

		String iniciarCarrera;

//		do {
//
//			System.out.println("Escribe ok para iniciar la carrera");
//			iniciarCarrera = sc.next();
//			break;
//			
//		} while (iniciarCarrera.equals("ok") == false);

		System.out.println("Inicia la carrera");
		System.out.println("*****************");
		inicioPartida = LocalDateTime.now();
		System.out.println("Temporizador: " + inicioPartida);

		int ronda = 0;
		for (int i = 0; i < resNumJugador; i++) {

			System.out.println("Prueba");
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
	private static void ejecutaTurno(int resPersonaje, int recorrido, int resultado) {

		if (resPersonaje == 1) {
			DadoNCaras dtortuga = new DadoNCaras(3);
			resultado = DadoNCaras.resultado;
			recorrido = recorrido + resultado;
			longitudPistaCarreras = longitudPistaCarreras - recorrido;
			System.out.println(longitudPistaCarreras);
		} else if (resPersonaje == 2) {
			DadoNCaras dliebre = new DadoNCaras(6);
			resultado = DadoNCaras.resultado;
			if (resultado == 3) {
				recorrido = recorrido + resultado;
				longitudPistaCarreras = longitudPistaCarreras - recorrido;
			} else {
				System.out.println("Elige una opcion:" + "1. El resultado del dado es menor que 3."
						+ "2. El resultado del dado es mayor que 3.");
				int res = sc.nextInt();
				if (res == 1) {
					recorrido = recorrido + resultado;
					longitudPistaCarreras = longitudPistaCarreras - recorrido;
				} else if (res == 2) {
					recorrido = recorrido + resultado;
					longitudPistaCarreras = longitudPistaCarreras - recorrido;
				} else {
					resultado = 0;
					recorrido = recorrido + resultado;
					longitudPistaCarreras = longitudPistaCarreras - recorrido;
				}
			}
			System.out.println(longitudPistaCarreras);
		} else {
			DadoNCaras dcorrecaminos = new DadoNCaras(10);
			resultado = DadoNCaras.resultado;
			if (resultado % 2 == 0) {
				recorrido = recorrido + resultado;
				longitudPistaCarreras = longitudPistaCarreras - recorrido;
			} else {
				resultado = 0;
				recorrido = recorrido + resultado;
				longitudPistaCarreras = longitudPistaCarreras - recorrido;
			}
			System.out.println(longitudPistaCarreras);
		}

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
