package testeAviao;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		System.out.println("Este é o modelo do avião : " + aviao.fabricante);
		System.out.println("A velocidade do motor é: " + aviao.motor.velocidadeMotor);
		
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		
		System.out.println("A velocidade do motor é: " + aviao.motor.velocidadeMotor);
		
		Piloto piloto = new Piloto();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
