package br.com.exemplo.bytebank;

// importação da classe ContaCorrente que está no arquivo "bytebank herdado conta.jar" que foi criado para simular uma biblioteca externa.
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {
		// utilizando métodos da "biblioteca" importada.
		ContaCorrente cc = new ContaCorrente(123, 456);
		cc.deposita(900);
		System.out.println(cc.getSaldo());
	}

}
