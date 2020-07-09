package Testes;
import java.util.Scanner;
public class TesteDoSimboloPorcentagem {

	public TesteDoSimboloPorcentagem() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1 = in.nextInt();
		int valor2 = in.nextInt();
		int media = valor1 % valor2;
		
		System.out.println(media);
		
		
		in.close();
	}

}
