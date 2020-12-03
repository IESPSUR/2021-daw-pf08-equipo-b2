package org.iespoligonosur.pf08.clases;

import java.util.ArrayList;

public interface IDado {
	
	public int lanzarDado();
	public static int lanzarDado(int rango) {
		double resultado;
        resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
        return (int)resultado;
	}
	
	public static ArrayList<Integer> tirarDados(int numero,
			int rango) {
        ArrayList<Integer> resultados=new ArrayList<Integer>();
        for (int i=0; i<numero; i++) {
            resultados.add(lanzarDado(rango));
        }
        return resultados;
    }

}
