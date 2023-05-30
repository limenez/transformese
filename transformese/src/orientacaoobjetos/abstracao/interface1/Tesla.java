package orientacaoobjetos.abstracao.interface1;

public class Tesla extends Carro implements FuncoesCarro, Luxo {

	public Tesla(String nome, int portas, int rodas) {
		super(nome, portas, rodas);
	}

	@Override
	public void ligarCarro() {
		System.out.println("Ele liga apertando botão");
	}

	@Override
	public void passarMarcha() {
		System.out.println("A a transmissão é automática");
	}

	@Override
	public void BancoDeCouro() {
		System.out.println("O banco de couro dele é branco");
	}

}
