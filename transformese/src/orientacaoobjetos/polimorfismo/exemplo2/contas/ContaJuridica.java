package orientacaoobjetos.polimorfismo.exemplo2.contas;

public class ContaJuridica {

    String numeroDaConta;
    String numeroAgencia;
    String nomeEmpresa;
    
	public ContaJuridica(String numeroDaConta, String numeroAgencia, String nomeEmpresa) {
		this.numeroDaConta = numeroDaConta;
		this.numeroAgencia = numeroAgencia;
		this.nomeEmpresa = nomeEmpresa;
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

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	
    
}
