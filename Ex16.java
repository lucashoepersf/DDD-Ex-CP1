package entrada_processamento_saida;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int v1, v2, v3, a, b, c;
	
	System.out.printf("Digite o primeiro valor: ");
	v1 = ler.nextInt();
	
	System.out.printf("Digite o segundo valor: ");
	v2 = ler.nextInt();
	
	System.out.printf("Digite o terceiro valor: ");
	v3 = ler.nextInt();
	
	a = v1*v1;
	b = v2*v2;
	c = v3*v3;
	
	if (a + b == c || a + c == b || b + c == a)
		System.out.printf ("Temos um retangulo");
	else  	
		System.out.printf("Não temos um retangulo");
	
	}

}

