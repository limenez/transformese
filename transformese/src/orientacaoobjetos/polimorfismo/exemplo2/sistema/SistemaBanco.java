package orientacaoobjetos.polimorfismo.exemplo2.sistema;

import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaCorrente;
import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaJuridica;
import orientacaoobjetos.polimorfismo.exemplo2.contas.ContaPoupanca;

public class SistemaBanco {

	public static void main(String[] args) {
		
		ContaPoupanca poupanca1 = new ContaPoupanca("1010", "0001", 0.5);
		
		System.out.println(poupanca1.getNumeroAgencia());
		
		ContaCorrente corrente1 = new ContaCorrente("1020", "0002", 500.00);
		
		ContaJuridica juridica1 = new ContaJuridica("1030", "0003", "Serasa");
		
	}
	
}
