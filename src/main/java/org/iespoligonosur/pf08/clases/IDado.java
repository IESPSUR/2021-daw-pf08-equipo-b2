package org.iespoligonosur.pf08.clases;

public interface IDado {
	
	public int lanzarDado();
	public static int lanzarDado(int rango) {
		rango = DadoBase.getNumeroCaras();
		double resultado;
        resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
        return (int)resultado;
	}

}
