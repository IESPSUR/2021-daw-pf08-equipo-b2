package org.iespoligonosur.pf08.clases;

/**
 * Definicion de una clase base para la implementacion de dados de N caras
 * @author angel
 *
 */
public abstract class DadoBase implements IDado{

	public static int numeroCaras;
	
	public DadoBase(int numeroCaras) {
		// TODO Auto-generated constructor stub//Comentario prueba
		numeroCaras = lanzarDado(numeroCaras);
	}

	public static int lanzarDado(int numeroCaras) {
		int resultado = (int) (Math.random() * numeroCaras + 1);
		return resultado;
	}
	
	public static int getNumeroCaras() {
		return numeroCaras;
	}
	

	public void setNumeroCaras(int numeroCaras) {
		DadoBase.numeroCaras = numeroCaras;
	}

}
