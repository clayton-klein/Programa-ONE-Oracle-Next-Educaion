package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 456);
		conta.deposita(10);
		
		try {
			// tentando sacar valor > saldo.
			conta.saca(210);
		} catch(SaldoInsuficienteException excecao) {
			System.out.println("Exception: " + excecao.getMessage());
			excecao.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
		
	}

}
