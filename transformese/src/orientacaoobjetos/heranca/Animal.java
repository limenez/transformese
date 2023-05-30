package orientacaoobjetos.heranca;

public class Animal {

	private String nome;
	private String cor;
	private String mover;
	//Pessoa dona;
	
	
	public Animal() {

	}	
	
	/*
	 animal.nome = "rato";
	 animal.dona.nome = "Tati"; 
	  */

	// 
	public Animal(String nome, String cor, String mover) {
		this.nome = nome;
		this.cor = cor;
		this.mover = mover;
	}

	public Animal(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	
	public void animalMovendo() {
		System.out.println("Animal está movendo.");
	}
	
	public void emitirSom() {
		System.out.println("Animal emitindo som.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMover() {
		return mover;
	}

	public void setMover(String mover) {
		this.mover = mover;
	}
	
}
