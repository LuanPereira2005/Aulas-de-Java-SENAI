
public class Main {

	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos();
		
		aluno1.nome = "cabeça de gelo";
		aluno1.nota1= 8.5;
		aluno1.nota2= 7.5;
		aluno1.nota3= 6;
		aluno1.peso1= 3;
		aluno1.peso2= 2;
		aluno1.peso3= 5;
		
		aluno1.cal_média(Alunos);
		System.out.println(aluno1.resultotal);
	}

}
