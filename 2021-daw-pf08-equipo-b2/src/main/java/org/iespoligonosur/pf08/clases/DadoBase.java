package org.iespoligonosur.pf08.clases;

import org.iespoligonosur.pf08.main.ProgramaCarrera;

/**
 * Definicion de una clase base para la implementacion de dados de N caras
 * @author angel
 *
 */
public abstract class DadoBase implements IDado{

	private static int numeroCaras;
	
	public DadoBase(int numeroCaras) {
		// TODO Auto-generated constructor stub//Comentario prueba
		int tipo = ProgramaCarrera.resPersonaje;
		if(tipo == 1) {
			numeroCaras = 3;
		} else if (tipo == 2) {
			numeroCaras = 6;
		} else {
			numeroCaras = 10;
		}
	}

	public static int getNumeroCaras() {
		return numeroCaras;
	}
	

	public void setNumeroCaras(int numeroCaras) {
		DadoBase.numeroCaras = numeroCaras;
	}

}
