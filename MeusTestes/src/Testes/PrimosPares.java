package Testes;
import java.util.Scanner;
public class PrimosPares {

	public PrimosPares() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter with one value: ");
		int numberInput = in.nextInt();
		int nVerificar;
		int nVerificar3;
		
		nVerificar = numberInput / numberInput;  
	    nVerificar3 = numberInput / numberInput;
		
		if (nVerificar == numberInput ) {
			System.out.println("The number is a prime number");
		}
		else if (nVerificar3 == 1)  {
			System.out.println("The number is an even number");
		}
		in.close();
	}

}
