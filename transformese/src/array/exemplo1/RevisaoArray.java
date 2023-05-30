package array.exemplo1;

public class RevisaoArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[4];
	
		numeros[0] = 1;
		numeros[1] = 3;
		numeros[2] = 6;
		numeros[3] = 5;
		
		for (int indice = 0; indice < numeros.length; indice++) {
			
			System.out.println(numeros[indice]);
		}		
		
		for (int indice : numeros) {
			System.out.println(indice);
		}
		
		for (int numero = 0; numero <= 10; numero += 2) {
			
			System.out.println(numero);
		}
		
		System.out.println("Exemplo de números pares");
		
		for (int valor = 0; valor <= 20; valor++ ) {
			
			if (valor % 2 == 0 ) {
				System.out.println(valor);
			}
			
		}
		
	}
	
}
