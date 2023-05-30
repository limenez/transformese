package equalsehashcode;

import java.util.Objects;

public class Pessoa {

	String nome;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	public void dizBomDia() {
		System.out.println("Olá, bom dia!");
	}
	
	public void dizBomDia(String nome) {
		System.out.println("Olá, bom dia " + nome);
	}
	
	public void dizBomDia(String nome, int hora) {
		System.out.println("Olá, bom dia " + nome + " agora são " + hora + " horas");
	}
	
	public void cadastrar(String nome, String cpf) {
		System.out.println("Olá " + nome + " cadastro realizado.");
	}


	@Override
	public boolean equals(Object objeto) {
		
		if (this == objeto)			
			return true;
		
		if (objeto == null) 
			return false;
		
		if (getClass() != objeto.getClass())
			return false;
		
		
		Pessoa other = (Pessoa) objeto;
		return Objects.equals(nome, other.nome);
	}
	
}
