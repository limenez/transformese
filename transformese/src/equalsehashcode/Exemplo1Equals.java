package equalsehashcode;

public class Exemplo1Equals {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Livia";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Giovanna";
		
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa("Aline");
		
		System.out.println(pessoa1 == pessoa2);
		
		System.out.println(pessoa1.equals(pessoa2));
		
		pessoa1.dizBomDia();
		
		pessoa1.dizBomDia("Aline");
		
		pessoa1.dizBomDia("Aline", 20);
		
		
		pessoa1.equals(pessoa2);
		
		int idade = 8;
		int idade2 = 8;
		
		System.out.println();
		
	}
	
}
