package org.iespoligonosur.pf08.main;

import java.util.Scanner;

public class turno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int turno1;
		int turno2;
		int tipoTurno = 3;
		int fTurno1 = 0;
		int fTurno2 = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tipoTurno; i++) {
			System.out.println("Turno 1");
			int resTurno1 = sc.nextInt();
			fTurno1 = resTurno1 + fTurno1;
			System.out.println("Resultado " + fTurno1);
			System.out.println("Turno 2");
			int resTurno2 = sc.nextInt();
			fTurno2 = resTurno2 + fTurno2;
			System.out.println("Resultado " + fTurno2);
		}
		
		
		System.out.println("Fin del programa");
	}
	

}
