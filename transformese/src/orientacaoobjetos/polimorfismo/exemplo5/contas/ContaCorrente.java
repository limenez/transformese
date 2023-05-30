package orientacaoobjetos.polimorfismo.exemplo5.contas;

public class ContaCorrente extends Conta {

	
    double emprestimo;
    
   
    public ContaCorrente(String numeroDaConta, String numeroAgencia, double saldo, double emprestimo) {
    	super(numeroDaConta, numeroAgencia, saldo);
    	this.emprestimo = emprestimo;
    }
	
    @Override
    public double mostrarSaldo() {    	
    	saldo = saldo - emprestimo;
    	return saldo;
    }
    
	
    public double getEmprestimo() {
        return emprestimo;
    }
    
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
