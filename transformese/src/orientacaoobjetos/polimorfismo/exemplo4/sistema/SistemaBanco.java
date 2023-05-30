package orientacaoobjetos.polimorfismo.exemplo4.sistema;

import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaCorrente;
import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaJuridica;
import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaPoupanca;
import orientacaoobjetos.polimorfismo.exemplo4.contas.Conta;

public class SistemaBanco {

	public static void main(String[] args) {
		
		ContaPoupanca poupanca1 = new ContaPoupanca("1010", "0001", 0.5);
		
		System.out.println(poupanca1.getNumeroAgencia());
		
		ContaCorrente corrente1 = new ContaCorrente("1020", "0002", 500.00);
		
		ContaJuridica juridica1 = new ContaJuridica("1030", "0003", "Serasa");
		
		// Criando objeto da classe Conta
		//Conta conta1 = new Conta("1040", "0004");
		//System.out.println(conta1.getNumeroAgencia());
		
	}
	
}
