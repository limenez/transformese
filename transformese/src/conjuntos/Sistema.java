package conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Sistema {

	public static void main(String[] args) {
		
		Set<String> pessoas = new HashSet<>();
		
		pessoas.add("Livia");
		pessoas.add("Aline");
		pessoas.add("Giovanna");
		pessoas.add("Jessica");
		pessoas.add("Samara");
		
		System.out.println(pessoas.contains("Tati"));
		
		
		for (String elemento : pessoas) {
			System.out.println(elemento);
		}
		
	}
	
}
