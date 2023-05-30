package orientacaoobjetos.encapsulamento;

public class ContaBancaria {

	private String nome;
	private int idade;
	private double saldo;
	
	public ContaBancaria(double saldo, String nome) {
		this.saldo = saldo;
		this.nome = nome;
	}

	public double mostrarSaldo() {
		return saldo;	
	}	
	
	public String mostrarNome() {
		return nome;
	}
	
	//                           15
	public void maiorIdade(int idade) {
		
		if(idade > 18) {
			
		}
		
		System.out.println("Usando idade antes de passar " + idade);
		System.out.println("A idade é: usando this.idade antes " + this.idade);
	
		this.idade = idade;
		System.out.println("A idade é: usando this.idade " + this.idade);
		System.out.println("Usando idade depois de passar " + idade);
	}
	
	
	
}
