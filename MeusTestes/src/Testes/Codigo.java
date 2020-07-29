package Testes;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o código do item: ");
		short codigo = in.nextShort();
		System.out.print("Insira a quantidade que deseja desse produto: ");
		float quantidade = in.nextShort();

		switch (codigo) {
		case 1:
			quantidade *= 4.00;
			System.out.printf("Total: R$ %.2f", quantidade);
			break;
		
		case 2:
			quantidade *= 4.50;
			System.out.printf("Total: R$ %.2f", quantidade);
			break;
			
		case 3:
			quantidade *= 5.00;
			System.out.printf("Total: R$ %.2f", quantidade);
			break;
			
		case 4:
			quantidade *= 2.00;
			System.out.printf("Total: R$ %.2f", quantidade);
			break;
			
		case 5:
			quantidade *= 1.50;
			System.out.printf("Total: R$ %.2f", quantidade);
			break;
		}

		in.close();
	}

}
