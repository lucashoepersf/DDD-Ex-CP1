package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		
		double p1, soma;
		
		
		System.out.printf("Informe a nota da P1: ");
		p1 = ler.nextDouble();
		
		soma = (15 - p1)/2 ;
		
		System.out.printf("Você precisa tirar %.1f na P2 para ser aprovado!!!", soma);
		
		
		
		}
}
