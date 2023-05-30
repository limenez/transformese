package orientacaoobjetos.polimorfismo.exemplo4.contas;

public class ContaCorrente extends Conta {

	
    double emprestimo;
    
   
    public ContaCorrente(String numeroDaConta, String numeroAgencia, double emprestimo) {
    	super(numeroDaConta, numeroAgencia);
    	this.emprestimo = emprestimo;
    }
	
	
    public double getEmprestimo() {
        return emprestimo;
    }
    
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
