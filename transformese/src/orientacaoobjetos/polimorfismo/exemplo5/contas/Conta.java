package orientacaoobjetos.polimorfismo.exemplo5.contas;

public abstract class Conta {


    String numeroDaConta;
    String numeroAgencia;
    double saldo;
    
   
	public Conta(String numeroDaConta, String numeroAgencia, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
	}
	

	public abstract double mostrarSaldo();

	
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
    
	
}
