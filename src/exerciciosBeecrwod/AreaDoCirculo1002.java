package exerciciosBeecrwod;

public class AreaDoCirculo1002 {
	public static void main(String[] args) {
		double n = 3.14159, raio = 150.00, area = 0.0;
		
		area = n * (Math.pow(raio, 2));
		
		System.out.print(String.format("A=" + "%.4f", area));
	}
}
