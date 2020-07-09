package Testes;

import java.util.Scanner;

public class Eleicao {

	public Eleicao() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a idade do individuo");
		int idade = in.nextInt();
		if (idade >= 16) {
			System.out.println("O individuo pode votar.");
		}
		else {
			System.out.println("O individuo não pode votar.");
		}
		
		in.close();
	}

}
