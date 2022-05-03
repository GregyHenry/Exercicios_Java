package exercicios_lote2;

import java.util.Scanner;

public class Ex4ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros de entrada:");

		int qtdNumeros = scan.nextInt(), count = 0, numero = 0, qtdPares = 0, qtdImpares = 0;

		while (count < qtdNumeros) {
			System.out.println("\nInforme o numero:");

			numero = scan.nextInt();

			if (numero % 2 == 0) {
				System.out.println("\n>>>>> Numero Par: " + numero);
				qtdPares++;
			} else {
				System.out.println("\n***** Numero Impar: " + numero);
				qtdImpares++;
			}

			count++;
		}
		System.out.println(
				"\nQuantidade de numeros pares: " + qtdPares + " e quantidade de numeros impares: " + qtdImpares);
		
		scan.close();
	}
}
