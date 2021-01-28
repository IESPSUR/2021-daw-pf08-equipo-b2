package org.iespoligonosur.pf08.clases;

public class DadoNCaras extends DadoBase {

	public static int resultado;

	public DadoNCaras(int numeroCaras) {
		super(numeroCaras);
	}

	@Override
	public int lanzarDado() {
		resultado = (int) (Math.random() * getNumeroCaras() + 1);
		return resultado;
	}	
}
