package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = -1;

		do {
			
			System.out.print("Informe um número:  ");
			num1 = entrada.nextInt();
		} while (num1 != -1);

		System.out.println("Obrigado!");
		entrada.close();

	}

}
