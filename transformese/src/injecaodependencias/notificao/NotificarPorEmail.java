package injecaodependencias.notificao;

import injecaodependencias.modelo.Cliente;

public class NotificarPorEmail implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s \n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}	
	
}