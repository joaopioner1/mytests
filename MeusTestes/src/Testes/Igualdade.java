package Testes;
import java.util.Scanner;
public class Igualdade {

	public Igualdade() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter with two numbers: ");
		float numero1 = in.nextFloat();
		float numero2 = in.nextFloat();
		
		if (numero1 == numero2 ) {
			System.out.println("the typed numbers are the same.");
		}
		else {
			System.out.println("the typed numbers are not the same.");
		}
		in.close();
	}

}
