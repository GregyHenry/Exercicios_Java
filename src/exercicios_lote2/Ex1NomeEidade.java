package exercicios_lote2;

import java.util.Scanner;

public class Ex1NomeEidade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Nome: ");

			nome = scan.next();

			if (nome.equals("0"))
				break;

			System.out.println("Idade: ");

			idade = scan.nextInt();
		}

	}

}
