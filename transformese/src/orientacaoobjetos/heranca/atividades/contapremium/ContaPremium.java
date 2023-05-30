package orientacaoobjetos.heranca.atividades.contapremium;

import orientacaoobjetos.encapsulamento.PessoaThis;
import orientacaoobjetos.heranca.atividades.contas.ContaPf;

public class ContaPremium extends ContaPf {

	private String beneficios;
	PessoaThis titular;
	PessoaThis conjuge;

	public ContaPremium(int numeroConta, double saldo, String beneficios) {
		super(numeroConta, saldo);
		this.beneficios = beneficios;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double emprestimo(double valor) {
		this.saldo += valor;
		return saldo;		
	}	
	

}
