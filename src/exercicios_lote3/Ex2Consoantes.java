package exercicios_lote3;

import java.util.Scanner;

public class Ex2Consoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] consoantes = new String[6];
		int qtdConsoantes = 0, count = 0;

		do {

			System.out.println("Letra: ");
			String letra = scan.next();

			if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
				consoantes[count] = letra;
				qtdConsoantes++;
			}

			count++;

		} while (count < consoantes.length);

		System.out.println("Consoantes total: " + qtdConsoantes);

		for (String consoante : consoantes) {
			if (consoante != null) {
				System.out.println(consoante);
			}
		}
		scan.close();
	}
}
