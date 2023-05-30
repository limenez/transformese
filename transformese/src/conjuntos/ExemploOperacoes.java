package conjuntos;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOperacoes {

	public static void main(String[] args) {
		
		Set<String> grupo1 = new TreeSet<>(Arrays.asList("Maria", "João", "Ana", "Daniel"));
		Set<String> grupo2 = new TreeSet<>(Arrays.asList("Livia", "Marcos", "Lucas", "Marlus", "Camila"));
		
		Set<String> grupoUniao = new TreeSet<>(grupo1);
		
		grupoUniao.addAll(grupo2);
		System.out.println("Resultado da união do grupo1 com o grupo2");
		System.out.println(grupoUniao);
		
//		Set<String> somaDosTres = new TreeSet<>(grupoUniao);
		
		Set<String> pessoasEmComum = new TreeSet<>(grupo1);
		pessoasEmComum.retainAll(grupo2);
		System.out.println("Mostrando as pessoas em comum aos dois grupos.");
		System.out.println(pessoasEmComum);
		
		Set<String> grupoDiferenca = new TreeSet<>(grupo1);
		grupoDiferenca.removeAll(grupo2);
		System.out.println("Pessoas que só pertecem ao grupo 1.");
		System.out.println(grupoDiferenca);
		
		
		
	}
	
}
