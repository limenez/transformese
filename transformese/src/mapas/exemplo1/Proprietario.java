package mapas.exemplo1;

import java.util.Objects;

public class Proprietario {
	
	private String nome;
	private String cpf;
	
	public Proprietario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	public String getCpf() {
		return cpf;
	}

//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", cpf = " + cpf;
	}
	
	
}
