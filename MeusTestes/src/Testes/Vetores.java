package Testes;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// [] MOSTRA QUE A VARIAVEL IRA GUARDAR VARIOS NOMES 
		String[] nomes;
		
		//PRECISAMOS INDICAR QUANTAS STRINGS SER�O ARMAZENADAS
		nomes = new String[5]; //INICIEI A VARIAVEL NOME COM 5 ESPA�OS (TAMANHO DO VETOR)
		
		//PARA UTILIZAR O VETOR, ACESSAMOS AS POSI��ES V�O DO 0 AT� TAMANHO -1. EX : 0,1,2,3,4(5)
		
		nomes[0] = "Breaking bad";
		nomes[1] = "Friends";
		nomes[2] = "Narcos";
		nomes[3] = "Peaky blinders";
		nomes[4] = "Vikings";
		
		System.out.println(nomes[3]);
	}

}
