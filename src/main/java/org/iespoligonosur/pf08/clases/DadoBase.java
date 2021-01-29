package org.iespoligonosur.pf08.clases;



import org.iespoligonosur.pf08.main.ProgramaCarrera;

/**
 * Definicion de una clase base para la implementacion de dados de N caras
 * 
 * @author eserrano
 *
 */
public abstract class DadoBase implements IDado{

	private static  int numeroCaras;
	
	public DadoBase(int numeroCaras) {
		this.numeroCaras = numeroCaras;
	}
	
	public static int getNumeroCaras() {
		return numeroCaras;
	}

	public int lanzarDado() {
		// TODO Auto-generated method stub
		return 10;
	}

}
