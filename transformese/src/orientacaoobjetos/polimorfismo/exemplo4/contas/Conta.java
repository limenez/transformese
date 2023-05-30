package orientacaoobjetos.polimorfismo.exemplo4.contas;

public abstract class Conta {

	
    String numeroDaConta;
    String numeroAgencia;
    
  
	public Conta(String numeroDaConta, String numeroAgencia) {
		this.numeroDaConta = numeroDaConta;
		this.numeroAgencia = numeroAgencia;
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
    
	
	
}