package lista;

import java.util.List;
import java.util.ArrayList;

public class Exemplo1Lista {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
				
		nomes.add("Tati");
		nomes.add("Ariel");
		
		nomes.set(0, "Gabriel");

		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		nomes.add(0, "Tati que vai estar brava");
		
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
				
		String terceiroElemento = nomes.get(2);
		
		System.out.println("Mostrando terceiro elemento");
		System.out.println(terceiroElemento);
		
	}
	
}
