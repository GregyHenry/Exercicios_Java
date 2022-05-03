package exercicios_lote3;

import java.io.IOException;
import java.util.Scanner;

public class Ex5Idades {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		double soma = 0.0d, n = 0.0d;
		while ( n >= 0) {
			n = leitor.nextInt();
			if (n >= 0) {
				soma += n;
				cont++;
			}
		}
		double media = soma / cont;
		System.out.println(String.format("%.2f", media));
	}
}
