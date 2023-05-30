package injecaodependencias;

import injecaodependencias.modelo.Cliente;
import injecaodependencias.modelo.Produto;
import injecaodependencias.servico.AtivacaoClienteService;
import injecaodependencias.servico.EmissaoNotaFiscalService;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente livia = new Cliente("Livia", "livia@email.com", "1197777-7777");
		Cliente samara = new Cliente("Samara", "samara@email.com", "1198888-8888");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		
		System.out.println(livia.isAtivo());
		System.out.println(samara.isAtivo());
		
		ativacaoCliente.ativar(livia);
		ativacaoCliente.ativar(samara);
		
		System.out.println(livia.isAtivo());
		System.out.println(samara.isAtivo());
		
		Produto impressora = new Produto("Impressora", 250.00);
	    Produto notebook = new Produto("Notebook", 2000.00);

	    EmissaoNotaFiscalService emitirNotaFiscal = new EmissaoNotaFiscalService();

	    emitirNotaFiscal.emitir(livia, notebook);
	    emitirNotaFiscal.emitir(samara, impressora);
	}
	

}
