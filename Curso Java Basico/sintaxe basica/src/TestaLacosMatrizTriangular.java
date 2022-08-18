
public class TestaLacosMatrizTriangular {
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break; //interrompe a execução do laço, fazendo com que pule para o laço mais externo.
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Podemos melhorar o código colocando "coluna <= linha" no teste condicional do sgundo laço for e eliminando o "if".
	}
}
