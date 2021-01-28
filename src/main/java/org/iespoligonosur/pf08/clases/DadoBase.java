package org.iespoligonosur.pf08.clases;



import org.iespoligonosur.pf08.main.ProgramaCarrera;

/**
 * Definicion de una clase base para la implementacion de dados de N caras
 * 
 * @author eserrano
 *
 */
public abstract class DadoBase implements IDado{

	private  int numeroCaras;
	
	public DadoBase(int numeroCaras) {
		this.numeroCaras = numeroCaras;
	}
	
	public int getNumeroCaras() {
		return numeroCaras;
	}

}
