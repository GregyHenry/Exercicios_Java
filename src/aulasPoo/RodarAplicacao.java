package aulasPoo;

public class RodarAplicacao {
	public static void main(String[] args) {
		Carro2 carro = new Carro2();

		carro.setCor("Azul");
		carro.setModelo("BMW");
		carro.setCapacidadeTanque(59);

		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.getCapacidadeTanque());

		System.out.println(carro.totalValorTanque(6.39));

		Carro2 carro2 = new Carro2("Cinza", "Mercedes", 66);

		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());

		System.out.println(carro2.totalValorTanque(6.46));
	}
}
