package introducao;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		
		int idade = 10; 
		double altura = 1.70; 
		String nome = "Gabriel"; 
		boolean estaCalor = true;
		
		final int media = 5;
		
		System.out.println("O valor da média é " + media);
		
		final int HORA = 24;

		String sobreNome = "Tatiana";
		
		System.out.println(sobreNome.length());
		System.out.println(sobreNome.toUpperCase());
		System.out.println(sobreNome.toLowerCase());
		
		System.out.println(sobreNome.equals("Tatiana"));
		
		int a = 5;
		int b = 5;
		
		System.out.println("Operadores Aritméticos");
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println("O resto da divisão é " + 11 % 3);

	}
	
}
