package Testes;
import java.util.Scanner;
public class OperadorTernario {

	public OperadorTernario() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();		
		String b;
		b = (a == 61) ? "sao paulo " : "Salvador";
		System.out.println(b);
		in.close();
	}

}
