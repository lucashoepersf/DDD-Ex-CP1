package entrada_processamento_saida;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a, b, c ;
	
	System.out.printf("Digite o primeiro valor do triangulo: ");
	a = ler.nextInt();
	
	System.out.printf("Digite o segundo valor do triangulo: ");
	b = ler.nextInt();
	
	System.out.printf("Digite o terceiro valor do triangulo: ");
	c = ler.nextInt();
	
	if (a == b && a == c) {
		System.out.printf("equilatero");
	}else if (a == b || a == c || b == c) {
		System.out.printf("isósceles");
	}else {  
		System.out.printf("Escaleno");
	}
		
	}
}