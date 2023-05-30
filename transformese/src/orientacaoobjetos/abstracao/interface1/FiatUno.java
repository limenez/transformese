package orientacaoobjetos.abstracao.interface1;

public class FiatUno extends Carro implements FuncoesCarro, Popular {

	public FiatUno(String nome, int portas, int rodas) {
		super(nome, portas, rodas);
	}

	@Override
	public void alarme() {
	
	}

	@Override
	public void freioDisco() {
		System.out.println();
	}

	@Override
	public void ligarCarro() {
		System.out.println("O uno liga inserindo a chave no contato");
	}

	@Override
	public void passarMarcha() {
		System.out.println("O uno passa marcha manual");
	}

}
