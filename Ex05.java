package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in) ;
		
		int a;
		double fahrenheit;
		
		System.out.printf("Informe a temperatura em graus Celsius: ");
		a = ler.nextInt();
		
		fahrenheit = ( a - 32 ) / 1.8;
				
		System.out.printf("A temperatura em fahrenheit é: %f", fahrenheit);
		
 	}
	
}
