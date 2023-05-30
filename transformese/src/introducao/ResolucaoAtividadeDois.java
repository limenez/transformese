package introducao;

import java.util.Scanner;

public class ResolucaoAtividadeDois {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num3; 
		 
		num3 = 20.8; 
		
		System.out.println("Informe um número");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe um segundo número");
		double num2 = entrada.nextDouble();
		
		
		double resultado = (num1 + num2) / 2;
		
		//System.out.printf("A média entre o número %.2f e o número %.2f é %.2f", num1, num2, resultado);
		
        String nome = "Gabriel";
        int numero1 = 1234;

        System.out.printf
        ("Olá meu nome é %d e o número é %d", nome, numero1);

       		
		entrada.close();	
		
	}
	
}
