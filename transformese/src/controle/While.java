package controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int copos = 0;

		while (copos <= 30) {

		 System.out.println("Copo de número " + copos + " foi lavado");
		 //copos += 1;
		 //copos++;
		  copos += 1;
		 }

		Scanner entrada = new Scanner(System.in);

		int pratos = 0;

		int hora = 0;
		

		while (!(hora < 9 && hora > 12)) {

			System.out.println("Informe a hora do dia: ");
			hora = entrada.nextInt();

			pratos++;
		}

		System.out.println("A quantidade de pratos lavados foi de " + pratos);

		entrada.close();

	}

}
