package testeAviao;

public class Sistema {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto();
		
		//System.out.println(piloto1.nome);
		
		piloto1.nome = "Ariel";
		piloto1.sobreNome = "Xavier";

		Piloto piloto2 = new Piloto();
		piloto2.nome = "Tati";
		piloto2.sobreNome = "Martins";
		
		Aviao aviao1 = new Aviao();
		aviao1.fabricante = "Embraer";
		aviao1.modelo = "111-AAA";
		aviao1.passageiros = 50;
		aviao1.qtdeMotores = 2;
		aviao1.piloto = piloto1;
		
		Aviao aviao2 = new Aviao();
		aviao2.fabricante = "Embraer";
		aviao2.modelo = "222-AAA";
		aviao2.passageiros = 65;
		aviao2.qtdeMotores = 4;
		aviao2.piloto = piloto2;
		
		Aviao aviao3 = new Aviao();
		
		System.out.println("O fabricante do avião 3 : " + aviao3.fabricante);
		System.out.println("A quantidade de motores : " + aviao3.qtdeMotores);
		
		System.out.println("Dados avião 1");
		System.out.println("O modelo do avião: " + aviao1.modelo);
		System.out.println("O nome do piloto : " + aviao1.piloto.nome);
		
		System.out.println("Dados avião 2");
		System.out.println(aviao2.modelo);
		
		
		
		
		
	}
	
}
