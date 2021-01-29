package org.iespoligonosur.pf08.clases;

public class DadoNCaras extends DadoBase {

	

	public DadoNCaras(int numeroCaras) {
		super(numeroCaras);
	}

	@Override
	public int lanzarDado() {
		int numeroCaras = (int) (Math.random() * getNumeroCaras() + 1);
		return numeroCaras;
	}
	
	public static int lanzarDados(int numeroCaras) {
		numeroCaras = (int) (Math.random() * getNumeroCaras() + 1);
		return numeroCaras;
	}	
}
