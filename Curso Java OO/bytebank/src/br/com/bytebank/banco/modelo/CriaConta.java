package br.com.bytebank.banco.modelo;

public class CriaConta {
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta primeiraConta = new Conta(123, 456);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.saca(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);
		System.out.println("primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("segunda conta tem " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta); //exibe o hash da referencia ao objeto na memória.
		
		//testando métodos da classe Conta
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta terceiraConta = new Conta(789, 777);
		System.out.println(terceiraConta.getSaldo());
		
		primeiraConta.transfere(50, terceiraConta);
		System.out.println(terceiraConta.getSaldo());
		
		System.out.println(Conta.getTotal());
	}
}
