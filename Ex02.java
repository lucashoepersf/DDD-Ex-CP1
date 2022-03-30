package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main (String[] args ) {
		
		Scanner ler = new Scanner (System.in);
		
		int a, soma;
		
		System.out.printf("Digite o lado do quadrado: ");
		a = ler.nextInt();
		
		soma = a * a;
		
		System.out.printf("A área do quadrado é: %d", soma);
		
		
	
	}
}
