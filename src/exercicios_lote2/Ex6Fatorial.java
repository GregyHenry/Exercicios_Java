package exercicios_lote2;

import java.util.Scanner;

public class Ex6Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero para fatorial: ");
		int numero = scan.nextInt(), multiplicacao = 1;

		for (int i = numero; i >= 1; i--) {
			multiplicacao *= i;
		}

		System.out.println("Fatorial do número " + numero + "! é: " + multiplicacao);
	}
}
