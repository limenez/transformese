package array;

import java.util.Arrays;

public class ArrayExemplo3 {

	public static void main(String[] args) {
		
		int[] idades = new int[3];
		
		idades[1] = 18;
		idades[0] = 10;
		idades[2] = 20;
		
		System.out.println(Arrays.toString(idades));
		 
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Repetindo " + i + " com o valor " + idades[i]);
			
		}
				
		for (int idade: idades) {
			System.out.println("Repetindo com Foreach " + idade);
		}
		
		System.out.println(idades[1]);

		
		
		
	}
	
	
}
