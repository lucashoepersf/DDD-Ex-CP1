package entrada_processamento_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);	
	
	double p1, p2, media;
	
	System.out.printf("Informe a nota da P1: ");
	p1 = ler.nextDouble();
	
	System.out.printf("Informe a nota da p2: ");
	p2 = ler.nextDouble();
	
	media = (p1 + (p2 * 2))/3;
	
	if (media >= 5) {
		System.out.printf("Nota %.1f Aprovado!", media);
	}else {
		System.out.printf("Nota %.1f reprovado!", media);
	}

	}
}
