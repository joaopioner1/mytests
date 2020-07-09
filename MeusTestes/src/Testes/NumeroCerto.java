package Testes;
import java.util.Scanner;
public class NumeroCerto {

	public NumeroCerto() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o valor para verificar se você possui\ndinheiro suficiente para comprar o livro(você possui um bonus de 20 reais)");
		
		int nInserido = in.nextInt();
		int bonus = 20;
		int valor = 56;
		int total;
		float sobra;
		
		total = nInserido + bonus;
		
		if (total > valor) {
			sobra = total - valor;
			System.out.printf("Você possui dinheiro o suficiente\npara comprar o livro, e ainda sobrou" + " R$ " + sobra+"." );
		}
		else if (total == valor) {
			System.out.printf("Você tem exatamente a quantidade necessária para comprar o livro.");
		}
		else {
			System.out.println("Você não tem dinheiro suficiente para comprar o livro.");
		}
		
		in.close();
	}

}
