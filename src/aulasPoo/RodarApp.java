package aulasPoo;

public class RodarApp {
	public static void main(String[] args) {

		//Não houve upcast nem downcast, instancio uma classe apenas.
		Funcionario funcionario = new Funcionario();

		//Upcast 
		Funcionario gerente = new Gerente();

		Funcionario vendedor = new Vendedor();
		
		Funcionario faxineiro = new Faxineiro();

		//Downcast
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}
}
