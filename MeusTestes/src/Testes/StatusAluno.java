package Testes;

import java.util.Scanner;

public class StatusAluno {

	public StatusAluno() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o valor das 4 notas: \n");
		float nota1, nota2, nota3, nota4;
		nota1 = in.nextInt();
		nota2 = in.nextInt();
		nota3 = in.nextInt();
		nota4 = in.nextInt();

		float media = nota1 + nota2 + nota3 + nota4;
		int total = 100;

		if (nota1 + nota2 + nota3 + nota4 >= 60 && nota1 + nota2 + nota3 + nota4 < 100) {
			System.out.println("O aluno passou! Ele atingiu a nota: " + media);
		}

		if (nota1 + nota2 + nota3 + nota4 < 60) {
			System.out.println("O aluno não passou. Recommendar ao aluno que se esforce mais.");

		}

		if (nota1 + nota2 + nota3 + nota4 > total) {
			System.out.printf(
					"A nota ultrapassou o valor total!! Por favor,\ntente novamente e ensira os valores corretos. ");
		}

		in.close();

	}

}
