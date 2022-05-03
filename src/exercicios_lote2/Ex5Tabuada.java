package exercicios_lote2;

import java.util.Scanner;

public class Ex5Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.println("Digite o número desejado da tabuada: ");
		numero = scan.nextInt();

		while (numero < 1 || numero > 10) {
			System.out.println("Digite número válido entre 1 e 10: ");
			numero = scan.nextInt();
		}

		System.out.println("Tabuada de " + numero + ":\n");

		for (int count = 1; count <= 10; count++) {
			System.out.println("" + numero + " X " + count + " = " + numero * count);
		}
		scan.close();
	}
}
