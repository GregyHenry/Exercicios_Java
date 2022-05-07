package exerciciosBeecrwod;

public class Salario1008 {
	public static void main(String[] args) {
		int numeroFuncionario = 6, horasTrabalhadas = 145;
		double valorHora = 15.55;
		
		System.out.println("Numero = " + numeroFuncionario);
		System.out.println(String.format("Salario = R$ " + "%.2f", horasTrabalhadas * valorHora));
	}
}
