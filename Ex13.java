package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a,b,c;
	
		System.out.printf("Digite o n�mero A: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o n�mero B: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o n�mero C: ");
		c = ler.nextInt();
		
		if((a > b) && (a > c))
			System.out.printf("A � o maior");
		else if ((b > a) && (b > c))
			System.out.printf("B � o maior");
		else
			System.out.printf("C � o maior");
	
	
	}
	
}
		/*
		
		if (a > b) {
			if (a > c) {
				System.out.printf("A � o maior");
			}
			else {
				System.out.printf("C � o maior");
			}
		}
		else {
			if (b > c) 
				System.out.printf("B � o maior");
				else
				System.out.printf("C � o maior");
				
			}
		}
}
*/
	
	