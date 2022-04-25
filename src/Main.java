//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Exercicio calculo 
		int escolha;
		float numero1;
		float numero2;

		Scanner leitor = new Scanner(System.in);

		System.out.println(
				"Digite a operação que deseja realizar " 
		        + "- (1)Soma, (2)Subtração, (3)Divisão e (4) Mutiplicação");

		escolha = leitor.nextInt();

		if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
			System.out.println("Escolha de operação inválida! " + escolha);
		} else {
			System.out.println("Digite o valor para o primeiro numero");

			numero1 = leitor.nextFloat();

			System.out.println("Digite o valor para o segundo numero");

			numero2 = leitor.nextFloat();

			switch (escolha) {
			case 1:
				OperacoesMath.calculoSoma(numero1, numero2);
				break;
			case 2:
				OperacoesMath.calculoSubtracao(numero1, numero2);
				break;
			case 3:
				OperacoesMath.calculoDivisao(numero1, numero2);
				break;
			default:
				OperacoesMath.calculoMultiplicacao(numero1, numero2);
			}

		}*/
		/*Exercicio mensagem
		int hora = 5;
		System.out.println("Exercicio Mensagem!");
		Mensagem.obterMensagem(hora);
		*/
		
		//Exercio emprestimo
		double valor = 1200;
		int parcela = 5;
		System.out.println("Exercicio Emprestimo");
		Emprestimo.calcular(valor, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(valor, Emprestimo.getTresParcelas());
		Emprestimo.calcular(valor, parcela);
		
	}
}