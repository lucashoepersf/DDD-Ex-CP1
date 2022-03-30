package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, area;
		
		System.out.printf("Digite a base do triangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite a altura do triangulo: ");
		b = ler.nextInt();
		
		area = a * b / 2;
		
		System.out.printf("A área do triangulo é: %d", area);
		
	}

		
}
