package Testes;
import java.util.Scanner;
public class Habilitacao {

	public Habilitacao() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a idade da pessoa.");
		int idade = in.nextInt();
		if (idade >= 18) {
			System.out.println("A idade é: " + idade + ", ele(a) pode dirigir");
		}
		else {
			System.out.println("A idade é: " + idade + ", ele(a) pode dirigir");
		}
		
		
		in.close();
	}

}
