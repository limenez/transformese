package equalsehashcode;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		String nome1 = "Livia";
		String nome2 = "Livia";
		String nome3 = "Ana";
		String nome4 = "Chris";
		
		System.out.println(nome1.equals(nome2));
		
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println(nome4.hashCode());
		
			
	}

}
	

