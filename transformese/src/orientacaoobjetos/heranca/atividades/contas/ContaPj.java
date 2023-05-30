package orientacaoobjetos.heranca.atividades.contas;

import java.util.Objects;

public class ContaPj extends ContaPf{

	private String nomeEmpresa;
	private String numeroCNPJ;

	public ContaPj(int numeroConta, String nomeEmpresa, double saldo, String numeroCNPJ) {
		super(numeroConta, saldo);
		
		Objects.requireNonNull(nomeEmpresa);
		Objects.requireNonNull(numeroCNPJ);
		
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
