package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, d, e, f, total, troco ;
		
		System.out.printf("Informe o valor do produto 1: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe o valor do produto 2: ");
		b = ler.nextDouble();
		
		System.out.printf("Informe o valor do produto 3: ");
		c = ler.nextDouble();
		
		System.out.printf("Informe o valor do produto 4: ");
		d = ler.nextDouble();
		
		System.out.printf("Informe o valor do produto 5: ");
		e = ler.nextDouble();
		
		total = a + b + c + d + e;
				
		System.out.printf("O valor total da compra deu: R$ %.2f ", total);
		
		System.out.printf("\nDigite o valor do pagamento: ");	
		
		f = ler.nextDouble();
			
		troco = f - total;
		
		System.out.printf("O seu troco é: R$ %.2f", troco);
		
	}
	
}
