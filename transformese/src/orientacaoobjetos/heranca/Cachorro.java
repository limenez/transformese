package orientacaoobjetos.heranca;

public class Cachorro extends Animal{

	
	@Override
	public void animalMovendo() {
		System.out.println("O cachorro está correndo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo.");
	}
	
	
	
	public void dizNomeDoCachorro(String nomeCachorro) {
		System.out.println("O nome do cachorro é " + nomeCachorro);
	}
	
	public void dizNomeDoCachorro(String nomeCachorro, String corDoCachorro) {
		System.out.println(
			"O nome do cachorro é " + nomeCachorro + "e a cor " + corDoCachorro);
	}
}
