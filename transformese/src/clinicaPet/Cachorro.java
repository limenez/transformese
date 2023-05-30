package clinicaPet;

public class Cachorro {

	String nome;
	String raca; 
	int idade;
	String sexo;
	
	void mostrarDadoCachorro(String nomeCachorro, String racaCachorro, int idadeCachorro, String sexoCachorro) {
		System.out.println("O nome é: " + nomeCachorro + "\nA raça é: " + racaCachorro + "\nA idade é: " + idadeCachorro + "\nO sexo é: " + sexoCachorro);
	}
	
	void latir(String nomeCachorro, int idadeCachorro) {
		
		System.out.printf("O cachorro %s está latindo! A idade é %d ! \n", nomeCachorro, idadeCachorro);
		
	}
	
}
