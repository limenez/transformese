package array;

import java.util.Arrays;

public class ArrayExemplo1 {

	public static void main(String[] args) {
		
		int[] idades = new int[4];
		
		idades[0] = 5;
		idades[1] = 4;
		idades[2] = 6;


		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);

		
		System.out.println(idades);
		
		System.out.println(Arrays.toString(idades));
	
		String[] nomes = new String[5];
		
		nomes[0] = "Ana";
		nomes[1] = "Eduardo";
		nomes[2] = "Diego";
		nomes[3] = "Jessica";
		nomes[4] = "Michael";

		
		System.out.println(Arrays.toString(nomes));
		
		System.out.println(nomes.length);
		
		
		
	}
	
}




















