package controle;

public class For {

	public static void main(String[] args) {

		int numero = 0;

		while(numero <= 10) {
			
			System.out.println("O número é " + numero);
						
			numero++;
		}
		
		System.out.println("A repetição acabou");

		for ( int numero1 = 0 ; numero1 <= 10 ; numero1++ ) {
			
			System.out.println("O número é " + numero1);
			
		}


		for (int quantidade = 20; quantidade >= 0; quantidade -= 2) {

			System.out.println("A quantidade é " + quantidade);
		}

	}

}
