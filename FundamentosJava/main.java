import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Criacao da variavel x do tipo inteiro que aceita apenas numero sem virgula,
		// caso voce digite um numero decimal, ou seja,
		// um numero com virgula, ele apenas vai
		// ignorar o que esta apos a virgula.
		// E a atribuicao do valor 100 a variavel x recem criada
//		int x = 100;
		// Criacao da variavel z sendo do tipo double e a atribuicao do valor 200 a ela.
		// O tipo double difetente do tipo int aceita numeros com virgula
//		double y = 200;
		// Criacao da variavel z do tipo short que aceita numero
		// com virgula, porem o numero maximo
		// aceitado e 32767.
//		short z = (short) 32767;

		// Criacao da variavel a sendo do tipo int e a atribuicao do valor 0 a ela.
//		int a = 0;
		// Criacao da variavel b sendo do tipo double e a atribuicao do valor 0 a ela.
//		double b = 0;

//		a = (int) z; // Casting explicito//
//		b = x; // Casting implicito//

		// Utilizacao do metodo System.out.println() que imprime o parametro (que e o
		// que vai dentro dos paranteses, que nesse caso sao as variaveis b e a).
//		System.out.println(b);
//		System.out.println(a);

		// Criacao da variavel idade sendo do tipo int
//		int idade = 50000000;
//
		// Utilizacao do teste condicional if que em portugues significa se.
		// Nesse caso se a variavel idade menor do que 18, o programa ira imprimir na
		// tela a frase que foi implementada dentro dos parenteses e entre aspas("").
//		if (idade < 18) {
//			System.out.println("Vaza!");
//			System.out.println("Voce so tem " + idade + " anos");
		// Alem do uso do teste condicional if, tambem ha o uso do teste condicional
		// else if que em portugues significa senao se.
		// Nesse caso se a variavel nao for menor do que 18 que e o teste condicional
		// acima, ele parte pro proximo teste condicional.
		// Que no caso se a variavel idade for menor do que 60 o codigo novamente ira
		// imprimir na tela a frase que foi implementada dentro dos parenteses e entre
		// aspas("").
//		} else if (idade < 60) {
//			System.out.println("Pode ficar parcero ja que voce tem " + idade + " anos");
		// Outra utilizacao do teste condicional else if, que se idade nao for menor do
		// que 18 e nao for menor do que 60, ele parte pro proximo teste condicional.
		// O proximo teste condicional e que se variavel idade for menor que 100 o
		// codigo novamente ira imprimir na tela a frase que foi implementada dentro
		// dos parenteses e entre aspas("")
//		} else if (idade < 100) {
//			System.out.println("Ce tem " + idade + "anos");
//			System.out.println("Volta para o asilo, velhote!");
		// Utilizacao do teste condicional else, se nao for o(s) teste(s)
		// condicional(is)
		// anteriores, o codigo novamente ira imprimir na tela a frase que foi
		// implementada
		// dentro dos parenteses e entre aspas("").
//		} else {
//			System.out.println("Caramba ce tem " + idade + " anos");
//			System.out.println("Sai pra la, Peter do Ei Nerd kkkkkk");
//		}
		// Criacao da variavel "estacao" e atribuicao do valor "Verao a ela".
//		String estacao = "Verao";
//		
		// Utilizacao do metodo switch case que em portugues significa escolha caso,
		// que funciona da seguinte maneira, caso o parametro do metodo switch seja
		// ao caso ele ira executar os codigos implementados dentro daquele caso
		// especifico.
		// Nesse caso o parametro de switch e estacao
//		switch (estacao) {
//
		// e se caso estacao for igual a "Outono" ele ira executar os codigos
		// implementados
		// que sao imprimir na tela(System.out.println)a frase "Hora das folhas cairem!"
		// e o break que serve para parar a execucao do codigo.
//		case "Outono":
//
//			System.out.println("Hora das folhas cairem!");
//
//			break;
		// aqui temos outro caso, caso estacao igual a "Verao" ele ira executar os
		// codigos
		// implementados que sao imprimir na tela a frase dentro dos parenteses e entre
		// aspas("") e o
		// break
//		case "Verao":
//
//			System.out.println("Calor de 500 C vem ai");
//
//			break;
		// aqui temos outro caso, caso estacao igual a "Inverno" ele ira executar os
		// codigos
		// implementados que sao imprimir na tela a frase dentro dos parenteses e entre
		// aspas("") e o
		// break
//		case "Inverno":
//
//			System.out.println("Frio de -500 C vem ai");
//
//			break;
		// aqui temos outro caso, caso estacao igual a "Primavera" ele ira executar os
		// codigos
		// implementados que sao imprimir na tela a frase dentro dos parenteses e entre
		// aspas("") e o
		// break
//		case "Primavera":
//
//			System.out.println("Hora das flores nascerem!");
//
//			break;
//		}
		// Criacao da variavel num do tipo int sem atrbuicao de valores
//			int num;
//		
		// Criacao da variavel entrada sendo do tipo da classe Scanner
		// que serve pra escanear informacoes digitadas por usuarios e
		// a atribuicao do endereço de um objeto da classe Scanner criado usando o new
		// que
		// e utilizado pra criar uma instancia de uma determinada classe, nesse
		// caso a classe Scanner.
		// Ja o System.in indica que as informacoes irao entrar no sistema.
//			Scanner entrada = new Scanner(System.in);
		// Codigo pra imprimir na tela a frase "Escreva um numero".
//			System.out.println("Escreva um numero");
//			
		// Atribuicao do valor scaneado para a variavel num por meio da variavel
		// entrada.
//			num=Integer.parseInt(entrada.nextLine());
//
		// Utilizacao do metodo switch case que tem como parametro a variavel num.
//			switch (num) {
//
		// caso num seja igual a 1 ele ira imprimir na tela a frase "Domingo" e o break.
//			case 1:
//
//				System.out.println("Domingo");
//
//				break;
//			
		// caso num seja igual a 2 ele ira imprimir na tela a frase "Segunda" e o break.
//			case 2:
//
//				System.out.println("Segunda");
//				
//				break;
//
		// caso num seja igual a 3 ele ira imprimir na tela a frase "Terça" e o break.
//			case 3:
//
//				System.out.println("Terça");
//				
//				break;
//
		// caso num seja igual a 4 ele ira imprimir na tela a frase "Quarta" e o break.
//			case 4:
//
//				System.out.println("Quarta");
//				
//				break;
//
		// caso num seja igual a 5 ele ira imprimir na tela a frase "Quinta" e o break.
//			case 5:
//
//				System.out.println("Quinta");
//				
//				break;
//
		// caso num seja igual a 6 ele ira imprimir na tela a frase "Sexta" e o break.
//			case 6:	
//
//				System.out.println("Sexta");
//				
//				break;
//
		// caso num seja igual a 7 ele ira imprimir na tela a frase "Sabado" e o break.
//			case 7:
//
//				System.out.println("Sabado");
//				
//				break;
//				
//			default:
//		
		// Se caso num nao seja igual em nenhuma comparacao ele vai pro default que ira
		// imprimir na tela
		// a frase "Esse dia da semana não existe".
//				System.out.println("Esse dia da semana não existe");
//			}
		// Criacao da variavel caractere sendo do tipo char que aceita apenas um
		// caractere dentro de aspas('')
		// e a atribuicao do valor 'a' a essa variavel.
//		char caractere = 'a';
//		
		// Utilizacao do metodo switch case que tem como parametro a variavel caractere.
//		switch(caractere) {
		// caso caractere seja igual a 'a' ele ira imprimir na tela a frase "Seu
		// caractere é "
		// concatenado com a variavel caractere e o break.
//			case 'a':
//				System.out.println("Seu caractere é " + caractere);
//				break;
		// caso caractere seja igual a 'b' ele ira imprimir na tela a frase "Seu
		// caractere é "
		// concatenado com a variavel caractere e o break.
//			case 'b':
//				System.out.println("Seu caractere é " + caractere);
//				break;
		// Se caso caractere nao seja igual em nenhuma comparacao ele vai pro default
		// que ira
		// imprimir na tela
		// a frase "Valor invalido".
//			default:
//				System.out.println("Valor invalido");
//		
//		}
//
		// Criacao da variavel cor do tipo String
//		String cor;
//
		// Criacao da variavel entrada sendo do tipo da classe Scanner e
		// a atribuicao do endereço de um objeto da classe Scanner criado usando o new
		// Scanner
//		Scanner entrada = new Scanner(System.in);
//
		// Codigo para imprimir na tela a frase "Qual a cor do semaforo?".
//		System.out.println("Qual a cor do semaforo?");
//
		// Atribuicao do valor de entrada para a variavel cor.
//		cor = entrada.next();
//
		// Utilizacao do metodo switch case que tem como parametro a variavel cor.
//		switch (cor) {
		// caso num seja igual a "Verde" ele ira imprimir na tela a frase "Poem na
		// quinta e vai!!!" e o break.
//		case "Verde":
//			System.out.println("Poem na quinta e vai!!!");
//			break;
		// caso num seja igual a "Amarelo" ele ira imprimir na tela a frase "Vai que
		// da!" e o break.
//		case "Amarelo":
//			System.out.println("Vai que da!");
//			break;
		// caso num seja igual a "Vermelho" ele ira imprimir na tela a frase "Parar pra
		// nao ser multado LOL" e o break.
//		case "Vermelho":
//			System.out.println("Parar pra nao ser multado LOL");
//			break;
//		}
		// Criacao da variavel x do tipo int e a atribuicao do valor 0 a ela.
//		int x=0;
//		
		// Utilizacao do metodo while, que e um laco de repeticao em que ha uma
		// indefinicao da quantidade de vezes que a repeticao acontecera.
		// O parametro desse metodo e x<10, entao enquanto x menor que 10 ele ira
		// executar os codigos implementados
//		while(x<10) {
//			x = x+1;
//			System.out.println(x);
//		}
//	}
//}
		// Utilizacao do metodo for, que e outro laco de repeticao em que esta
		// predefinida a quantidade de vezes que a repeticao acontecera.
		// O parametro desse metodo int x=0(Criacao da variavel x do tipo int e
		// atribuicao do valor 0 a essa variavel); x<11(enquanto x<11 o laco se
		// repetira); x+=2(e cada vez que o laco se repetir o x somara 2 a seu valor
		// atual).
		// Depois disso serao executados os codigos implementados dentro do for.
//		for(int x=0; x<11; x+=2) {
//			System.out.println(x);
//		}
		// Criacao da variavel a do tipo int e a atribuicao do valor 0 a ela.
//		int a=0;
//		
		// Criacao da variavel entrada sendo do tipo da classe Scanner e
		// a atribuicao do endereço de um objeto da classe Scanner criado usando o new
		// Scanner.
//		Scanner entrada = new Scanner(System.in);
//		
		// Imprimir na tela a frase implementada dentro dos paranteses e aspas("").
//		System.out.println("Escolha a tabuada");
//		
		// Atribuicao do valor de entrada a variavel a.
//		a=Integer.parseInt(entrada.nextLine());
//		
		// Utilizacao do metodo for com os parametros int b=a(criacao da variavel b do
		// tipo int e atribuicao do valor de a a ela); b<a*10.5(enquanto b<a*10.5 havera
		// repeticao do laco); b+=a(e cada vez que o laco se repetir b somara o valor de
		// a a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro do for.
//		for(int b=a; b<a*10.5; b+=a) {
//			System.out.println(b + " x " + a + " = " + b);
//		}

		// Criacao das variaveis z,x e y do tipo double e a atribuicao do valor 0 a
		// todas elas.
		// E a criacao da variavel op e a atribuicao do valor "" a ela.
//		double z = 0;
//		double x = 0;
//		double y = 0;
//		String op = "";

//		// Criacao da variavel entrada sendo do tipo da classe Scanner e
		// a atribuicao do endereço de um objeto da classe Scanner criado usando o new
		// Scanner
//		Scanner entrada = new Scanner(System.in);
//		
		// Imprimir na tela a frase implementada dentro do parenteses e aspas para pedir
		// a digitacao de tres numeros e um simbolo de operacao para atribui-los atraves
		// da variavel entrada para as
		// variaveis x,y e op.
//		System.out.println("Escreva o primeiro número");
//		x=Integer.parseInt(entrada.nextLine());
//		System.out.println("Escreva o segundo número");
//		y=Integer.parseInt(entrada.nextLine());
//		System.out.println("Escreva a operação");
//		op=entrada.next();
//
		// Utilizacao do metodo switch case que tem como parametro a variavel op.
//		switch (op) {
		// caso num seja igual a "+" ele ira calcular x+y e ira atribuir o resultado a z
		// e ira imprimir na tela z e o metodo break.
//		case "+":
//			z = x + y;
//			System.out.println(z);
//			break;
		// caso num seja igual a "-" ele ira calcular x-y e ira atribuir o resultado a z
		// e ira imprimir na tela z e o metodo break.
//		case "-":
//			z = x - y;
//			System.out.println(z);
//			break;
		// caso num seja igual a "*" ele ira calcular x*y e ira atribuir o resultado a z
		// e ira imprimir na tela z e o metodo break.
//		case "*":
//			z = x * y;
//			System.out.println(z);
//			break;
		// caso num seja igual a "/" ele ira calcular x/y e ira atribuir o resultado a z
		// e ira imprimir na tela z e o metodo break.
//		case "/":
//			z = x / y;
//			System.out.println(z);
//			break;
//		}
		// Utilizacao do for com os parametros int x=0(criacao da variavel x do tipo int
		// e atribuicao do valor 0 a ela);x<=100(enquanto x menor que 100 havera
		// repeticao do laco); x+=1(e cada vez que o laco se repetir x somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro do for.
//		for(int x=0; x<=100; x+=1) {
//			System.out.println(x);
//		}
//
		// Criacao das variaveis z1,x1 e y1 do tipo int e a atribuicao do valores 5,3 e
		// 7(na sequencia) a
		// elas.
//		int x1 = 3;
//		int z1 = 5;
//		int y1 = 7;
//
		// Imprimir na tela todas as variaveis e um syso para pular linha
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//
		// Criacao da matriz x de double que e uma tabela com linhas e colunas
		// Essa matriz tem indices indeterminados e sao apenas usadas linhas
		// Atribuicao dos valores a essa matriz dentro das chaves{}.
//		double x[] = { 3, 5, 3, 5 };
//
		// Utilizacao do for com os parametros int aux=0(criacao da variavel aux do tipo
		// int
		// e atribuicao do valor 0 a ela);aux<=x.lenght(enquanto aux menor que o tamanho
		// da matriz x havera a repeticao do laco).
		// repeticao do laco); x+=1(e cada vez que o laco se repetir x somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro do for.
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("valor do indice " + aux + " = " + x[aux]);
//		}
		// Criacao da matriz x de String que e uma tabela com linhas e colunas
		// Atribuicao dos valores a essa matriz dentro das chaves{}.
//		String nome[] = { "Luan", "Marquinhos", "Emanuel", "Vitão" };
//
		// Utilizacao do for com os parametros int x=0(criacao da variavel x do tipo int
		// e atribuicao do valor 0 a ela);x<=100(enquanto x menor que 100 havera
		// repeticao do laco); x+=1(e cada vez que o laco se repetir x somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro do for.
//		for (int aux = 0; aux < nome.length; aux++) {
//			System.out.println(nome[aux]);
//			if (nome[aux] == "Marquinhos") {
//				System.out.println("O indice de " + nome[aux] + " é = " + aux);
//			}
//		}
		// Criacao das matriz a,b e c de int, String e double que e uma tabela com
		// linhas e colunas
		// Atribuicao da quantidade de indices dessas matrizes dentro das chaves[].
//		int[] a = new int[5];
//		String[] b = new String[4];
//		double[] c = new double[3];
//
		// Atribuicao do valor 5 ao indice 3 da matriz a
//		a[3] = 5;
//
		// Criacao da matriz numero de int e atribuindo new int para ela
		// Esse new int mostra a quantidade de indices de numero
//		int[] numero = new int[3];
//		Scanner teclado = new Scanner(System.in);
//
		// Utilizacao de dois metodos for com os parametros int aux=0(criacao da
		// variavel aux do tipo
		// int.
		// e atribuicao do valor 0 a ela);aux < numero.lenght(enquanto aux menor que o
		// tamanho da matriz numero havera.
		// repeticao do laco); aux++(e cada vez que o laco se repetir aux somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro dos metodos
		// for.
//		for (int aux = 0; aux < numero.length; aux++) {
//			System.out.println("Digite um número qualquer");
//			numero[aux] = teclado.nextInt();
//		}
//		for (int aux = 0; aux < numero.length; aux++) {
//			System.out.println("Indice " + aux + " = " + numero[aux]);
//		}
//
		// Criacao da matriz arrayQualquer de int e atribuindo new int para ela.
		// Esse new int mostra a quantidade de indices de arrayQualquer.
//		int[] arrayQualquer = new int[5];
//		
		// Criacao da matriz arrayObject de int e atribuindo new int para ela.
		// Esse new int mostra a quantidade de indices de arrayObject.
//		Object [] arrayObject = new Object[7];
//		
		// Atribuindo valores a indices de arrayObject.
		// Observa-se que como arrayObject e do tipo Object, ela aceita qualquer tipo de
		// dado.
//		arrayObject[0] = "Queijo de pão";
//		arrayObject[1] = 25;
//		arrayObject[2] = 'A';
//		arrayObject[3] = 2554545845455465454.2;
//		arrayObject[4] = true;
//		arrayObject[5] = arrayQualquer;
//		
//		
		// Utilizacao do for com os parametros int aux=0(criacao da variavel aux do tipo
		// int.
		// e atribuicao do valor 0 a ela);aux < arrayObject.lenght(enquanto aux menor
		// que o
		// tamanho da matriz numero havera.
		// repeticao do laco); aux++(e cada vez que o laco se repetir aux somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro dos metodos
		// for.
//		for (int aux = 0; aux < arrayObject.length;aux++) {
//			System.out.println("Indice "+aux+ " = "+arrayObject[aux]);
//		}
		// Criacao da matriz arrayBidirecional de int que agora tem dois parametros, que representam suas linhas e colunas
		// tambem atribuindo new int para ela.
		// Esse new int mostra a quantidade de indices de arrayBidirecional.
		// Nessa matriz portanto existem 5 linhas e 3 colunas.
		int[][] arrayBidirecional = new int[5][3];

		// Atribuindo valores a indices de arrayObject.
		// Observa-se que existem dois indices, que mostram a linha e a coluna em que a informacao sera guardada.
		arrayBidirecional[0][0] = 8;
		arrayBidirecional[4][1] = 5;

		// Utilizacao do for com os parametros int linha=0(criacao da variavel linha do tipo int
		// e atribuicao do valor 0 a ela);linha<=arrayBidirecional(enquanto linha menor que o tamanho da matriz arrayBidirecional havera
		// repeticao do laco); linha++(e cada vez que o laco se repetir linha somara o valor
		// 1 a seu valor atual).
		// Depois disso serao executados os codigos implementados dentro do for.
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out
						.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + "    ");
			}
			System.out.println();

		}
	}
}