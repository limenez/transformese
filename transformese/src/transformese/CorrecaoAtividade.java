package transformese;

import java.util.Scanner;

public class CorrecaoAtividade {

	public static void main(String[] args) {
			
		Scanner   entrada   = new Scanner(System.in);
		
		entrada.nextInt();
		
//      Superman  Nazare = new Superman();		
//      Nazare.voar();
		
			
		double juros;
		
		
		System.out.println("Informe o valor do boleto: ");
		double valorBoleto = entrada.nextDouble();
		
		System.out.println("Informe o dia do vencimento: ");
		int diaVencimento = entrada.nextInt();
		
		System.out.println("Informe a data de pagamento: ");
		int diaPagamento = entrada.nextInt();
				
		
		int diasEmAtraso = diaPagamento - diaVencimento;
		
		
		if (diaVencimento >= diaPagamento) {
			System.out.println("Obrigado, o seu boleto foi pago sem juros.");
		
	
		} else if (diaPagamento < 1 || diaPagamento > 31) {
			System.out.println("O dia de pagamento informado é inválido");

		} else if (diaVencimento < 1 || diaVencimento > 31) {
			System.out.println("O dia de vencimento informado é inválido");
				
		} else if (diaVencimento < diaPagamento && diasEmAtraso <= 10) {
			
			juros = diasEmAtraso * 1.00;
			
			double valorCorrigido = valorBoleto + juros;
			
			System.out.println("O valor do boleto corrigido, para 10 dias é " + valorCorrigido);
			
		} else if (diaVencimento < diaPagamento && diasEmAtraso > 10) {
			
			juros = diasEmAtraso * 1.50;
			double valorCorrigido = valorBoleto + juros;
			System.out.println("O valor do boleto corrigido, para 15 dias é " + valorCorrigido);
			
		} 
				
		entrada.close();
	}
}
