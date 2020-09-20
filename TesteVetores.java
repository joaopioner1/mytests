package Testes;

import java.util.Scanner;

public class TesteVetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de notas que deseja inserir: ");
		int numAlunos = in.nextInt();
		double[] notaAlunos = new double[numAlunos];
		
		for (int i = 0; i < numAlunos; ++i) {
			System.out.print("Insira a nota do " + (i+1) + " aluno: ");
			notaAlunos[i] = in.nextDouble();
		}
		System.out.println(); //pula a linha
		
		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Nota do Aluno " + (i+1)+ ": " + notaAlunos[i]);
		}
		in.close();
	}

}

