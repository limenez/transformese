package clinicaPet;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		c1.nome = "Qualquer";
		c1.sexo = "M";
		c1.idade = 7;
		c1.raca = "Yorkshire";
		
		Cachorro c2 = new Cachorro();
		
		c2.nome = "Spike";
		c2.idade = 5;
		c2.raca = "Pincher";
		c2.sexo = "M";
		
		System.out.println(
		  "O nome é " + c1.nome + " a raça é " + c1.raca + " a idade " + c1.idade + " o sexo " + c1.sexo);
		
		c1.latir("Qualquer", 12);
		
		c1.mostrarDadoCachorro("Max", "Pastor Alemão", 4, "M");
		
		c2.mostrarDadoCachorro(c2.nome, c2.raca, c2.idade, c2.sexo);
		
		Veterinario vet1 = new Veterinario();
		vet1.nome = "Ana";
		vet1.CFMV = "A1B1C1";
		
				
		Scanner entrada = new Scanner(System.in);
		
//  	int verificacao;
		
//		do {
//			
//			System.out.println("Informe o nome do cachorro: ");
//			String nomeDoCachorro = entrada.next();
//			 
//			System.out.println("Deseja adicionar mais um cachorro? 1-Sim e 2- Não");
//			verificacao = entrada.nextInt();
//			
//		} while (verificacao != 2);
		
		
		entrada.close();
		
	}
	
}
