package entrada_processamento_saida;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		
		double peso, altura, imc ;
		
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);

		if (imc < 20) 
			System.out.printf("Não está com o pesso ideal");
		else if(imc < 25) 
			System.out.printf("Peso ideal %d");
		
		else 
			System.out.printf("Não está com o peso ideal ");
		

	}
	
}
