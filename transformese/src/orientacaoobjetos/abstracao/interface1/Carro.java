package orientacaoobjetos.abstracao.interface1;

public abstract class Carro {

	String nome;
	int portas;
	int rodas;
		
	public Carro(String nome, int portas, int rodas) {
		this.nome = nome;
		this.portas = portas;
		this.rodas = rodas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
		
}
