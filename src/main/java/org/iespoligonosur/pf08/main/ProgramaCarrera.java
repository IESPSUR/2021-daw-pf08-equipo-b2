package org.iespoligonosur.pf08.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.iespoligonosur.pf08.clases.Correcaminos;
import org.iespoligonosur.pf08.clases.DadoBase;
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
	private static int turno;
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
			numJugadores = creaJugadores(recorrido, resultado);
			for (int j = 0; j < numJugadores; j++) {
				System.out.println(jugadores[j].getNombre());
			}

		}
	}

	/**
	 * Este metodo se encarga de crear uno a uno hasta 6 jugadores con la ayuda del
	 * usuario que introduce los datos a través de la consola.
	 */
	private static int creaJugadores(int recorrido, int resultado) {

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

				resPersonaje = eligePersonaje(resPersonaje, i);

			} while ((resPersonaje == 1 || resPersonaje == 2 || resPersonaje == 3) == false);

			System.out.println("Los jugadores son:");
		}

		iniciaPartida(resPersonaje, recorrido, resultado, resNumJugador, turno);
		return resNumJugador;

	}

	private static int eligePersonaje(int resPersonaje, int i) {

		String nombre;
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

		return resPersonaje;

	};

	/**
	 * Este metodo inicia la partida con los jugadores ya previamente creados por el
	 * usuario La partida termina cuando cualquiera de los jugadores recorre toda la
	 * longitud determinada para la pista alcanzando la meta.
	 */
	private static void iniciaPartida(int resPersonaje, int recorrido, int resultado, int resNumJugador, int turno) {

		int fTurno1 = 0;
		String iniciarCarrera;
		System.out.println("Inicia la carrera");
		System.out.println("*****************");
		inicioPartida = LocalDateTime.now();
		System.out.println("Temporizador: " + inicioPartida);

		turno = 4;
		for (int e = 0; e < turno; e++) {
			System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[0]);
			System.out.println("Escribe ok para continuar");
			String ok = sc.next();
			resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
			fTurno1 = resultado + fTurno1;
			System.out.println("Recorrido de tortuga " + fTurno1);
			
			System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[1]);
			System.out.println("Escribe ok para continuar");
			String ok2 = sc.next();
			resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
			fTurno1 = resultado + fTurno1;
			System.out.println("Recorrido de tortuga " + fTurno1);
			
			if (resNumJugador > 2) {
				
				System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[3]);
				System.out.println("Escribe ok para continuar");
				String ok3 = sc.next();
				resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
				fTurno1 = resultado + fTurno1;
				System.out.println("Recorrido de tortuga " + fTurno1);
				
				if (resNumJugador > 3) {
					
					System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[4]);
					System.out.println("Escribe ok para continuar");
					String ok4 = sc.next();
					resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
					fTurno1 = resultado + fTurno1;
					System.out.println("Recorrido de tortuga " + fTurno1);
					
					if (resNumJugador > 4) {
						
						System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[5]);
						System.out.println("Escribe ok para continuar");
						String ok5 = sc.next();
						resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
						fTurno1 = resultado + fTurno1;
						System.out.println("Recorrido de tortuga " + fTurno1);
						
						if (resNumJugador > 5) {
							
							System.out.println("Turno " + (e + 1) + " para jugador " + jugadores[6]);
							System.out.println("Escribe ok para continuar");
							String ok6 = sc.next();
							resultado = ejecutaTurno(resPersonaje, recorrido, resultado);
							fTurno1 = resultado + fTurno1;
							System.out.println("Recorrido de tortuga " + fTurno1);
							
						}
					}
				}
			}
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
	private static int ejecutaTurno(int resPersonaje, int recorrido, int resultado) {

		int resultadolongitudPistaCarreras = 0;
		int numeroCaras = 0;

		if (resPersonaje == 1) {
			numeroCaras = 3;

			DadoNCaras prueba = new DadoNCaras(numeroCaras);
			System.out.println("N�mero de caras Tortuga " + numeroCaras);
			resultado = DadoNCaras.lanzarDados(numeroCaras);
			System.out.println("Resultado de tortuga " + resultado);
			recorrido = recorrido + resultado;
//			System.out.println("Recorrido de tortuga " + recorrido);

		} else if (resPersonaje == 2) {
			numeroCaras = 6;
			DadoNCaras prueba2 = new DadoNCaras(numeroCaras);
			System.out.println("N�mero de caras Liebre " + numeroCaras);
			resultado = DadoNCaras.lanzarDados(numeroCaras);
			if (resultado == 3) {

				System.out.println("Resultado de Liebre " + resultado);
				recorrido = recorrido + resultado;
				System.out.println("Recorrido de Liebre " + recorrido);

			} else {
				System.out.println("Elige una opci�n:" + "1. El resultado del dado es menor que 3."
						+ "2. El resultado del dado es mayor que 3.");
				int res = sc.nextInt();
				if (res == 1 && resultado < 3) {
					System.out.println("Resultado de Liebre " + resultado);
					recorrido = recorrido + resultado;
					System.out.println("Recorrido de Liebre " + recorrido);
				} else if (res == 2 && resultado > 3) {
					System.out.println("Resultado de Liebre " + resultado);
					recorrido = recorrido + resultado;
					System.out.println("Recorrido de Liebre " + recorrido);
				} else {
					resultado = 0;
					System.out.println("Resultado de Liebre " + resultado);
					recorrido = recorrido + resultado;
					System.out.println("Recorrido de Liebre " + recorrido);
				}
			}

		} else {
			numeroCaras = 10;
			DadoNCaras prueba3 = new DadoNCaras(numeroCaras);
			System.out.println("Numero de caras correcaminos " + numeroCaras);
			resultado = DadoNCaras.lanzarDados(numeroCaras);
			if (resultado % 2 == 0) {
				System.out.println("Resultado de Correcaminos " + resultado);
				recorrido = recorrido + resultado;
				System.out.println("Recorrido de Correcaminos " + recorrido);
			} else {
				resultado = 0;
				System.out.println("Resultado de Correcaminos " + resultado);
				recorrido = recorrido + resultado;
				System.out.println("Recorrido de Correcaminos " + recorrido);
			}
		}
		return resultado;
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
