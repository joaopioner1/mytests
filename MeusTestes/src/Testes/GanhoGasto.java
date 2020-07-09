package Testes;
import java.util.Scanner;
public class GanhoGasto {

	public GanhoGasto() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter with two values: ");
		float number1 = in.nextFloat(); 
		float number2 = in.nextFloat();
		float total = number1 - number2;
		
		if (total > number2) {
			System.out.println("You have money to buy this.");
		}
		else {
			System.out.println("You don't hava money to buy this.");
		}
	
		in.close();
	}
	

}
