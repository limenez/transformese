package orientacaoobjetos.encapsulamento.flamengo;

public class ViniciusJr {
	
	
	public String nome = "Vinicius Junior";	

	private String formaDeJogar = "Atacar pela esquerda";	
	
	String planoDeDefesa = "Defender pelo meio";	
	
	protected String baterFalta = "Por cima da barreira";

	public void alteraFormaDeJogar(String novaForma) {
		
		System.out.println("Forma antiga de jogar: " + formaDeJogar);
		
		formaDeJogar = novaForma;
		
		System.out.println("A nova forma de jogar: " +formaDeJogar);
	}


	public void setFormaDeJogar(String formaDeJogar) {
		this.formaDeJogar = formaDeJogar;
	}

	
	
	
}
