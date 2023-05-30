package escola;

public class Aluno {

	String nome;
	String sobreNome;
	int matricula;
	String serie;
	String turma;
	
	double calculaMedia(
			double nota1, double nota2, double nota3, double nota4) {
		
		double somaDasNotas = nota1 + nota2 + nota3 + nota4;
		
		return somaDasNotas / 4;
	}
	
	String bemvindoAluno (int sexoPessoa, String nome, String sobreNome) {
		
		if(sexoPessoa == 1) {
			return "Seja bem-vinda, querida aluna " + nome + " " + sobreNome;			
		} else if (sexoPessoa == 2) {
			return "Seja bem-vindo, querido aluno " + nome + " " + sobreNome;
		} else {
			return "Seja bem-vinde, queride alune " + nome + " " + sobreNome;
		}	
		
		// switch For
		
	}
	
}
