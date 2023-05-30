package excecoes.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número, por favor");
			int numeroRecebido = entrada.nextInt();	
			
			System.out.println("O número digitado é: " + numeroRecebido);
		} catch (InputMismatchException erroDeEntrada) {
			System.out.println("O tipo de dado informado é invalido.");
		} catch (Exception erroDeEntrada) {
			System.out.println("O banco de dados, não está respondendo");
		} finally {
			entrada.close();
			System.out.println("O Finally, foi executado.");
		}
		
		System.out.println("Uma mensagem depois");
		
	}
	
}
