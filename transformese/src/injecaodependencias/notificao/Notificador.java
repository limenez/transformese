package injecaodependencias.notificao;

import injecaodependencias.modelo.Cliente;

public interface Notificador {
	
	public void notificar(Cliente cliente, String mensagem);

}
