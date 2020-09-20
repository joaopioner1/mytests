package Testes;

import java.util.Scanner;

public class TesteVetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de notas que deseja inserir: ");
		int numAlunos = in.nextInt();
		double[] notaAlunos = new double[numAlunos]; //vetor armazena as notas
		String[] nomeAlunos = new String[numAlunos]; //vetor armazena os nomes
		
		for (int i = 0; i < numAlunos; ++i) {
			System.out.print("Insira o nome do " + (i+1) + " aluno: ");
			nomeAlunos[i] = in.next();
			System.out.print("Insira a nota do " + (i+1) + " aluno: ");
			notaAlunos[i] = in.nextDouble();
		}
		System.out.println(); //pula a linha
		
		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Nota do Aluno(a) " + nomeAlunos[i] + ": " + notaAlunos[i]);
			if (notaAlunos[i] >= 60 ) {
				System.out.println("O aluno(a) " + nomeAlunos[i] + " esta acima da media.");
			} else {
				System.out.println("O aluno(a) " + nomeAlunos[i] + " esta abaixo da media.");
			}
		}
		in.close();
	}

}
