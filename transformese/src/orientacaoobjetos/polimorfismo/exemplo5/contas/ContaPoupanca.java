package orientacaoobjetos.polimorfismo.exemplo5.contas;

public class ContaPoupanca extends Conta{

    double rendimento;
    
	public ContaPoupanca(String numeroDaConta, double saldo, String numeroAgencia, double rendimento) {
		super(numeroDaConta, numeroAgencia, saldo);
		this.rendimento = rendimento;
	}

	@Override
	public double mostrarSaldo() {
		saldo = saldo * 1.05;
		// saldo *= 1.05;
		return saldo;
	}
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void rendimentoDaConta() {
		
	}
	
	    
}
