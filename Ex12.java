package entrada_processamento_saida;

import java.util.Scanner;

public class Ex12 {

		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a, b, area;
		
		
		System.out.printf("Digite a base do ret�ngulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite a altura do ret�ngulo: ");
		b = ler.nextInt();
		
		area = a * b;
		
		if (area > 100) 
		System.out.printf("Terreno grande");
		else
		System.out.printf("Terreno pequeno");
	

		
		}
}
