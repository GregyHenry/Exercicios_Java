package exercicios_lote2;

import java.util.Scanner;

public class Ex3MaiorEMedia {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int   numero, contador = 0, maior = 0;
		float media = 0.0f;
		
		do {

			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			media += numero;
			contador += 1;
			
		} while (contador < 5);
		
		System.out.println("Maior número é: " + maior);
		System.out.println("Media é: " + media/5);
		
		scan.close();
	}
}
