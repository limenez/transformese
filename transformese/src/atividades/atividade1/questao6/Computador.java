package atividades.atividade1.questao6;

public class Computador {

	private boolean ligado;

	public Computador(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void imprimir() {
		
		if(ligado == true) {
			System.out.println("Computador ligado");
		} else {
			System.out.println("Computador desligado");
		}
		
	}
	
	
	String estaLigado;
	
	
	
	
	
}
