package orientacaoobjetos.polimorfismo.exemplo4.contas;

public class ContaPoupanca extends Conta{

    double rendimento;
    
	public ContaPoupanca(String numeroDaConta, String numeroAgencia, double rendimento) {
		super(numeroDaConta, numeroAgencia);
		this.rendimento = rendimento;
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
