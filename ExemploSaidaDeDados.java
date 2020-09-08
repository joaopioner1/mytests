public class Main
{
	public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.00;
        double mesure = 53.234567;

        System.out.println("products: ");
        System.out.println(product1 + ", which price is $ " + price1)
        System.out.println(product2 + ", which price is $ " + price2)
    
        System.out.println("record: " + age + " years old, code " + code + " and gender " + gender + "\n")		
       
        System.out.println("Mesue with eight decimal places: " + mesure); 
        System.out.printf("Mesue (three decimal places): %.3f", mesure);
        
        /*
        
        pode usar // para fazer comentario em uma linha determinada
        
        println pula linhas
        print continua na mesma linhas
        printf continua na mesma linha e formata casas decimais
        
        \n pula uma linha
        
        %.qualquernumerof formata a quantidade de casas decimais
        */
	}
}
