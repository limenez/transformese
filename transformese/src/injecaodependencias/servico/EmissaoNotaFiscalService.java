package injecaodependencias.servico;

import injecaodependencias.modelo.Cliente;
import injecaodependencias.modelo.Produto;
import injecaodependencias.notificao.NotificarPorSMS;

public class EmissaoNotaFiscalService {

	public void emitir (Cliente cliente, Produto produto) {
	
		NotificarPorSMS notificador = new NotificarPorSMS();

		notificador.notificar(cliente, "Sr.(a) " + cliente.getNome() + 
				" Nota fiscal do produto " + produto.getNome() + " foi emitida!");
		
	}
	
}