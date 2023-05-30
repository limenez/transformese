package orientacaoobjetos.polimorfismo.exemplo2.contas;

public class ContaCorrente extends Conta {

	
    String numeroDaConta;
    String numeroAgencia;
    double emprestimo;
    

    public ContaCorrente(String numeroDaConta, String numeroAgencia,double emprestimo) {
    	super(numeroDaConta, numeroAgencia);
    	this.emprestimo = emprestimo;
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
    public double getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
