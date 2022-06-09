
public class Main {

	public static void main(String[] args) {
		
		// Instanciando dois objetos de classes diferentes
		Alunos aluno1 = new Alunos();
		Notas notas1=  new Notas();
		
		// Atribuicao de valores a atributos
		aluno1.nome = "cabeça de gelo";
		notas1.nota1 = 8.5;
		notas1.nota2 = 7.5;
		notas1.nota3 = 6;
		notas1.peso1 = 3;
		notas1.peso2 = 2;
		notas1.peso3 = 5;
	
		// Utilizacao do metodo da classe Alunos
		aluno1.media(notas1.resul1,notas1.resul2,notas1.resul3,aluno1,notas1);
		
		
	}

}
