package orientacaoobjetos.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Cavalo", "Marrom", "Galopando");
		Animal animal2 = new Animal(null, null, null);
		Animal animal3 = new Animal();
		Animal animel4 = new Animal(null, null, null);
		
		animal1.setNome("peixe");
		animal1.setCor("cinza");
		animal1.setMover("nadando");
		animal1.animalMovendo();
		animal1.emitirSom();
		
		System.out.println(animal1.getNome());
		System.out.println(animal1.getCor());
		System.out.println(animal1.getMover());

		Cachorro cachorro1 = new Cachorro();
		System.out.println("Mostrando dados do Cachorro");
		
		cachorro1.setNome("Caramelo");
		cachorro1.setCor("Caramelo");
		cachorro1.setMover("Correndo");
		cachorro1.animalMovendo();
		cachorro1.emitirSom();
		
		
		System.out.println(cachorro1.getNome());
		System.out.println(cachorro1.getCor());


		
		
	}
	
}
