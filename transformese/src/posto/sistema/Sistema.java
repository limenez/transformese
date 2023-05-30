package posto.sistema;

import java.util.Scanner;

import posto.pagamento.Pagamento;
import posto.servicos.Abastecimento;

public class Sistema {

	public static void main(String[] args) {
		
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		double qtdeCombustivel;
		
		Scanner entrada = new Scanner(System.in);
		
//		Cliente c1 = new Cliente();
//		c1.nome = "Gabriel";
//		c1.sobreNome = "Nunes";
		
//		Cliente c2 = new Cliente("Gilcemar", "Borges");		
//		Cliente c3 = new Cliente("Renan", "Teixeira");
//		Cliente c4 = new Cliente("Ariel", "Xavier");
//		
//		System.out.println(c2.nome);
//		System.out.println(c2.sobreNome);
//		c2.dizNomeCliente("Gilcemar");
//		
//				
//		System.out.println(Funcionario.enderecoPosto);
//		
//		Credito.pagoNoCredito("Richard");
//		Credito.pagoNoCredito("Qualquer nome");
		
				
		System.out.println("Olá seja bem-vindo(a) ao posto Transforme-se");
		
		System.out.println("Qual serviço deseja fazer? 1-Abastecer ");
		escolhaCliente = entrada.nextInt();
		
		if(escolhaCliente == 1) {
			System.out.println("O preço dos combustíveis: 1-Gasolina - R$ 4.75 2-Etanol - R$ 3.85 3-Diesel - R$ 5.15" );
			System.out.println("Qual combustível gostaria de abastecer?");
			tipoCombustivel = entrada.nextInt();
			
			System.out.println("Quanto gostaria de abastecer?");
			valorAbastecer = entrada.nextDouble();
			
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
			
			System.out.println("Qual seria a forma de pagamento? 1-Dinheiro 2-Débito 3-Crédito");
			int formaPagamento = entrada.nextInt();
			
			Pagamento.formaPagamento(formaPagamento, valorAbastecer);
			
			// ABSTRAÇÃO / DESACOPLAR
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
	
}
