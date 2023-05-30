package orientacaoobjetos.polimorfismo.exemplo2.contas;

public class ContaPoupanca {

    String numeroDaConta;
    String numeroAgencia;
    double rendimento;
    
	public ContaPoupanca(String numeroDaConta, String numeroAgencia, double rendimento) {
		this.numeroDaConta = numeroDaConta;
		this.numeroAgencia = numeroAgencia;
		this.rendimento = rendimento;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	    
}
