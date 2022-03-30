package entrada_processamento_saida;

import java.util.Scanner;

public class Ex10 {

		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a, b ;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();

		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		if (a > b) 
			System.out.printf("O primeiro valor é maior: %d", a);
		else  
		if (b > a) 
			System.out.printf("O segundo valor é maior: %d", b);
		else 
			System.out.printf("Os dois valores são iguais.");
		}
		
		
		
		

	}


