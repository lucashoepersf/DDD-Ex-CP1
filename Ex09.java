package entrada_processamento_saida;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a , b ;
			
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		if (a < b)  
		System.out.printf("O primeiro valor é menor");
		else  
		System.out.printf("O segundo valor é menor");
		
	}	

	
}
