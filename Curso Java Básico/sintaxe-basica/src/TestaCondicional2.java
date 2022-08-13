
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; //resultado será um valor booleano.

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
