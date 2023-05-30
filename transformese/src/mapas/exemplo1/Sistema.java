package mapas.exemplo1;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
	
	public static void main(String[] args) {
		
		Proprietario livia = new Proprietario( "Livia" ,"777.777.777-77");
		Proprietario samara = new Proprietario("Samara", "888.888.888-88");
		Proprietario ana = new Proprietario("Ana", "111.111.111-11");
				
		Carro carro1 = new Carro("LLL-7777", "Honda City");
		Carro carro2 = new Carro("SSS-8888", "Chevrolet Cruze");
		Carro carro3 = new Carro("AAA-1111", "Jeep Compass");
				
		Map<Carro, Proprietario> proprietarios = new HashMap<>();
		
		proprietarios.put(carro1, livia);
		proprietarios.put(carro2, samara);
		proprietarios.put(carro3, ana);
		
//		System.out.println(proprietarios);
//		
//		System.out.println(carro1.getPlaca());
//		System.out.println(carro1);
		
		for(Carro carro : proprietarios.keySet()) {
			System.out.println(carro);
		}
		
		for(Proprietario dono : proprietarios.values()) {
			System.out.println(dono);
		}
		
		for(Carro carro : proprietarios.keySet()) {
			Proprietario proprietario = proprietarios.get(carro);
			System.out.printf("A placa \s do carro \s pertence o \s \n", 
					carro.getPlaca(), 
					carro.getModelo(),
					proprietario.getNome());
			
		}
		
		
	}

}
