package conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		
		Set<String> pessoas = new TreeSet<>();
		
		pessoas.add("Livia");
		pessoas.add("Aline");
		pessoas.add("Giovanna");
		pessoas.add("Jessica");
		pessoas.add("Samara");
		
		System.out.println(pessoas.contains("Livia"));
		
		for (String elemento : pessoas) {
			System.out.println(elemento);
		}
		
		System.out.println(pessoas.size());
		
		System.out.println(pessoas.isEmpty());
		
	}
	
}
