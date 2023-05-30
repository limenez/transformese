package injecaodependencias.servico;

import injecaodependencias.modelo.Cliente;
import injecaodependencias.notificao.Notificador;
import injecaodependencias.notificao.NotificarPorSMS;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService() {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		System.out.println("O cliente foi ativado");
		
		NotificarPorSMS notificador = new NotificarPorSMS();
		
		notificador.notificar(cliente, "Seu cadastro está ativado");
	}	
}
