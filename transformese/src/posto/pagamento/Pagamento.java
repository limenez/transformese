package posto.pagamento;

import java.util.Scanner;

public class Pagamento {

	public static void formaPagamento(int formaEscolhida, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch (formaEscolhida) {
		case 1:
			System.out.println("Será pago no dinheiro");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaEmDinheiro = entrada.nextDouble();
			
			PagamentoDinheiro.pagamentoEmDinheiro(quantiaEmDinheiro, valorAbastecido);
			
			break;

		default:
			break;
		}
		
		
	}
		
}
