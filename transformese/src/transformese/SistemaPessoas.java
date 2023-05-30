package transformese;

import java.util.Scanner;

public class SistemaPessoas {

	public static void main(String[] args) {
		
		String nome = "Gabriel";
		String sobreNome = "Nunes";
		
		Scanner entrada = new Scanner(System.in);
		String  apelido = "Valor";
		
//		entrada.nextInt();		
//		entrada.nextInt();
		
		
		Pessoa tati = new Pessoa();
		
		tati.nome = "Tatiana";
		tati.sobreNome = "Martins";
		//tati.altura = 1.60;
		
		Pessoa ariel = new Pessoa();
		ariel.nome = "Ariel";
		ariel.sobreNome = "Xavier";
		//ariel.altura = 1.87;
		
		
		Pessoa cliente = new Pessoa();
		cliente.nome = "Nath";
		cliente.sobreNome = "Pereira";
		//cliente.altura = 1.55;
		
				
		Carro carro1 = new Carro();
		
		carro1.nome = "Gol";
		carro1.marca = "Volks";
		carro1.ano = 2017;
		carro1.cor = "branco";
		
		System.out.println(carro1.nome);
		
		System.out.println(cliente.nome);
		System.out.println(
				"O nome do cliente " + cliente.nome + " de sobrenome " + cliente.sobreNome);
		System.out.printf(
				"O modelo do carro é %s de marca %s, com ano %d, na cor %s.",
				carro1.nome, carro1.marca, carro1.ano, carro1.cor );
		
				
		Carro carro2 = new Carro();
		
		// let idade = 10;
		// idade = "Qualquer coisa"
		
		//console.log(idade) // iria sair no console -> Qualquer coisa
	    // Quando vai usar o Javascript no Backend geralmente, utiliza-se o Typescript
		
		// Tipada = 
		
		
	}
	
}
