package transformese;

public class MetodosTeste {

	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gabriel";
		pessoa1.sobreNome = "Nunes";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Leticia";
		pessoa2.sobreNome = "Matos";
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.sobreNome);
		
		//System.out.println(pessoa1.dadosDaPessoa());
		
//		pessoa1.dadosDaPessoa();
//		pessoa2.dadosDaPessoa();
		
				
		
//		System.out.println("A idade da pessoa somado 5 é " + pessoa1.mostrarIdadeCom5(10));
		
			
		pessoa1.dizBomDia("Anderson", "boa noite");
		
	}
	
}
