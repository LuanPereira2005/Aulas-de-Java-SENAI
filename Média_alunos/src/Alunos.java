// Criacao de uma classe
public class Alunos {
	// Criacao de atributos
	String nome;
	double resultotal;
	
	// Metodo para calculo das medias e imprimi-las nas telas
	void media(double resul1, double resul2, double resul3, Alunos aluno, Notas notas) {
		
		// Uso do metodo da classe Notas
		notas.peso(notas.nota1,notas.nota2,notas.nota3,3,2,5);
		
		resultotal=notas.resul1+notas.resul2+notas.resul3/3;
		
		System.out.println(aluno.resultotal);
		
	}
}