package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in) ;
		
		double a, b, resultado;
		
		System.out.printf("Informe o valor da cotação do dolar: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe a quantidade que deseja comprar: ");
		b = ler.nextDouble();
				
		resultado = a * b;
				
		System.out.printf("O valor em reais da compra é: %.2f", resultado);
		
 	}
}
