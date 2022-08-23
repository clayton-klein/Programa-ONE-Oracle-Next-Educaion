// classe criada para verificar o erro/exceção.

public class FluxoComExcecao {

	public static void main(String[] args) {
		
		System.out.println("Inicio do metodo MAIN");
		
		try {	
			metodo1();
		// adicionando MinhaExcecao aqui tambem para funcionar.
		} catch(ArithmeticException | NullPointerException excecao) {
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
		metodo2();// chama a si mesmo num loop infinito para forçar um erro.
		
		//throw new MinhaExcecao("Deu muito ruim!"); // comentado para o erro acontecer.	
		
		System.out.println("Fim do metodo2");
	}
}
