package escola;

import java.util.Scanner;

public class SistemaEscola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Tati";
		aluno1.sobreNome = "Martins";
		aluno1.matricula = 123456;
		aluno1.serie = "7ª série";
		aluno1.turma = "B";
		
		//System.out.println(aluno1.calculaMedia(5.2, 7.1, 4.8, 4.7));
		double mediaCalculada = aluno1.calculaMedia(5.2, 7.1, 4.8, 4.7);
		
		System.out.println(mediaCalculada);
		
		//String nomeFormatado = aluno1.bemvindoAluno("Tati", "Martins");
		//System.out.println(nomeFormatado);
		
		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Informe o sexo: 1-F 2-M 3-Prefiro não informar");
//		int sexo = entrada.nextInt();
//		
//		String fraseFormatada = aluno1.bemvindoAluno(sexo , "Tati", "Martins");
//		System.out.println(fraseFormatada);
		
		
//		Professor prof1 = new Professor();
//		prof1.nome = "Ariel";
//		prof1.sobreNome = "Xavier";
//		prof1.materia = "Libras";
		
//		System.out.println(prof1.nome);
//		System.out.println(prof1.sobreNome);
		
		Professor prof2 = new Professor("Ariel", "000.000.000-00");
		prof2.materia = "Matemática";
		prof2.sobreNome = "Xavier";
		
		System.out.println(prof2.nome);
		System.out.println(prof2.cpf);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Declarei 
		String nome;
		
		//Atribui o valor 
		nome = "Gabriel";
		
		// Declarando e atribuindo
		String disciplina = "Química";
				
		
		
		
		System.out.println("O endereço da escola é " + Escola.enderecoEscola);
		
		//Escola.enderecoEscola
		
		
		
		
		
		
		
		
		entrada.close();
		
	}
	
}
