package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class ContaTeste {
	public static void main(String[] args) {
		Conta contaClayton = new Conta(123, 456);
		contaClayton.setTitular(new Cliente());
		contaClayton.getTitular().setNome("Clayton");
		
		System.out.println(contaClayton.getTitular().getNome());
		
	}
}
