package transformese;

import java.util.Locale;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Informe seu nome");
		String nome = entrada.next();
		System.out.printf("O nome informado foi %s \n", nome);
		
		
//		System.out.println("Informe sua idade");
//		int idade = entrada.nextInt();		
//		System.out.printf("A idade informada foi %d \n", idade);
		
				
		System.out.println("Informe sua altura");
		float altura = entrada.nextFloat();
		
		System.out.printf("A altura informada foi: %.2f n", altura);
		
		
		
		System.out.println("Informe a letra da turma");
		
		
		char letraDaTurma = entrada.next().charAt(0); 
		System.out.printf("A letra da turma informada é %s", letraDaTurma);
		
				
//		String nomeDoTipoDeDado = nome.getClass().getSimpleName();
//		
//		System.out.printf("O tipo de dado contido na variável 'nome' é %s", nome.getClass().getSimpleName());
//		System.out.println(nome.getClass().getSimpleName());
		
		
		
		System.out.println("Informe sua altura e em seguida informe ");
		
		
		
		entrada.close();
	}
	
}
