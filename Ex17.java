package entrada_processamento_saida;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);	
	
	double peso, altura, imc;
	String sexo;
	
		System.out.printf("Digite seu sexo (m ou f): ");
		sexo = ler.nextLine();
		sexo = sexo.toLowerCase();
		
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
	if (sexo.equals("f")) {
		if (imc<19) {
			System.out.printf("Voc� � mulher, est� abaixo do peso");
		}else if (imc>=19 && imc<24) {
			System.out.printf("Voc� � mulher, est� peso ideal");
		}else {
			System.out.printf("Voc� � mulher, est� acima do peso");
		}
	}else {
		if (imc < 20) {
			System.out.printf("Voc� � homem, est� abaixo do peso");
		}else if (imc >= 20 && imc < 25) {
			System.out.printf("Voc� � homem, est� peso ideal");
		}else {
			System.out.printf("Voc� � homem, est� acima do peso");
		
		}
		
	}

	}
	
}
