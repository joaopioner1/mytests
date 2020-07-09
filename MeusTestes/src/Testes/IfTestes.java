package Testes;

import java.util.Scanner;

public class IfTestes {

	public IfTestes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
		
		int idade;   
		String nome;
		
		System.out.println("Insira primeiro a idade e depois o nome da pessoa: ");
		idade = in.nextInt();
		nome = in.next();
		
		if (idade <= 13) { 
			System.out.println(nome + " é Criança");
							}
		else if (idade >= 14 && idade <= 18) {
			System.out.println(nome + " é Jovem");
			
		}else { 
			System.out.println(nome + " é Adulto");
		}
		
			in.close();
	}
	}


