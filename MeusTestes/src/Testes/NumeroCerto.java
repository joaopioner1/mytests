package Testes;
import java.util.Scanner;
public class NumeroCerto {

	public NumeroCerto() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o valor para verificar se voc� possui\ndinheiro suficiente para comprar o livro(voc� possui um bonus de 20 reais)");
		
		int nInserido = in.nextInt();
		int bonus = 20;
		int valor = 56;
		int total;
		float sobra;
		
		total = nInserido + bonus;
		
		if (total > valor) {
			sobra = total - valor;
			System.out.printf("Voc� possui dinheiro o suficiente\npara comprar o livro, e ainda sobrou" + " R$ " + sobra+"." );
		}
		else if (total == valor) {
			System.out.printf("Voc� tem exatamente a quantidade necess�ria para comprar o livro.");
		}
		else {
			System.out.println("Voc� n�o tem dinheiro suficiente para comprar o livro.");
		}
		
		in.close();
	}

}
