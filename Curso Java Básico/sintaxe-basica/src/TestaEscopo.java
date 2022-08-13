
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando escopo.");

		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			boolean acompanhado = true;
		} else {
			boolean acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
		//Repare que nosso código deixa de compilar, já que nossa variável é criada dentro do if, quando chegamos ao final do if, ela deixa de existir.
		
		//Para compilar, descomente a declaração da variável na linha 8 e remova as declarações "boolean" das linhas 11 e 13.
	}
}
