// classe criada para analisar a pilha de execução.

public class FluxoComTratamento {

	public static void main(String[] args) {
		
		System.out.println("Inicio do metodo MAIN");
		
		try {	
			metodo1();
		} catch(Exception excecao) {
			String msg = excecao.getMessage();
			System.out.println("Exceção " + msg);
			excecao.printStackTrace();
		}
		
		System.out.println("Fim do metodo MAIN");		
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			//int a = i/0; // aqui se descomentar dá uma exceção diferente
			Conta c = null;
			//c.deposita();
		}
		
		System.out.println("Fim do metodo2");
	}
}
