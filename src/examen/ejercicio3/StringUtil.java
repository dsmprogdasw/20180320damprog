package examen.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringUtil {
	Scanner in = new Scanner(System.in);
	static Map<String, Integer> mapa = new HashMap();
	
	public static int contarLetrasUnicas(String frase) {
		frase = frase.toLowerCase();
		char letra;
		
		if(mapa.containsKey(frase)) {
			return mapa.get(frase);
		}
		
		
		int contador = 0;
		int valor = 0;
		
		for(int i=0; i<frase.length(); i++) {
			contador = 0;
			letra = frase.charAt(i);
			for(int j=0; j<frase.length(); j++) {
				if(i != j && letra == (frase.charAt(j))) {
				 contador =  1;
				}
			}
			
			if(contador == 0) {
				valor ++;
			}

		}
		mapa.put(frase, valor);
		valor = valor;
		return valor;
	}

	
	
	public static void main(String[] args) {
		System.out.println(contarLetrasUnicas("Holaa"));
		System.out.println(contarLetrasUnicas("Buenas"));
		System.out.println(contarLetrasUnicas("Buenos dias a todos"));
		
	}

}
