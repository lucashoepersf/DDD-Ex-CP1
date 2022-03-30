package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a,b,c;
	
		System.out.printf("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o número C: ");
		c = ler.nextInt();
		
		if((a > b) && (a > c))
			System.out.printf("A é o maior");
		else if ((b > a) && (b > c))
			System.out.printf("B é o maior");
		else
			System.out.printf("C é o maior");
	
	
	}
	
}
		/*
		
		if (a > b) {
			if (a > c) {
				System.out.printf("A é o maior");
			}
			else {
				System.out.printf("C é o maior");
			}
		}
		else {
			if (b > c) 
				System.out.printf("B é o maior");
				else
				System.out.printf("C é o maior");
				
			}
		}
}
*/
	
	