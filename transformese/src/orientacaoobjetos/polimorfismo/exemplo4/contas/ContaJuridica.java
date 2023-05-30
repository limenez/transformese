package orientacaoobjetos.polimorfismo.exemplo4.contas;

public class ContaJuridica extends Conta {


	String nomeEmpresa;
	String numeroCNPJ;
    
	public ContaJuridica(
		String numeroDaConta, String numeroAgencia, String nomeEmpresa, String numeroCNPJ) {
		super(numeroDaConta, numeroAgencia);
		this.nomeEmpresa = nomeEmpresa;
		this.numeroCNPJ = numeroCNPJ;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNumeroCNPJ() {
		return numeroCNPJ;
	}

	public void setNumeroCNPJ(String numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}
    
}
