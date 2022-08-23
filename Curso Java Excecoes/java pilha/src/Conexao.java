// foi necessário implementar a interface AutoCloseable, pois é uma exigência para utilizar a forma moderna de try/catch.
public class Conexao implements AutoCloseable {
	public Conexao() {
		System.out.println("Abrindo a conexão");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados...");
		throw new IllegalStateException(); // simulando o erro.
	}
	
//	public void fecha() {
//        System.out.println("Fechando conexao.");
//    } // parte do jeito antigo de se fazer try/catch.

	@Override
	public void close() {
		System.out.println("Fechando conexão.");
	}
}
