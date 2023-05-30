package testeAviao;

public class Aviao {

		
	String fabricante = "Embraer";
	String modelo;
	int qtdeMotores;
	int passageiros;
	Piloto piloto;
	Motor motor = new Motor();
	
	
	void acelerarAviao() {
		motor.velocidadeMotor += 10;
	}
	
}
