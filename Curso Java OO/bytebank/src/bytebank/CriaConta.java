package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta); //exibe o hash da referencia ao objeto na memória.
		
		//testando métodos da classe Conta
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.saldo);
		
		Conta terceiraConta = new Conta();
		System.out.println(terceiraConta.saldo);
		
		primeiraConta.transfere(50, terceiraConta);
		System.out.println(terceiraConta.saldo);
	}
}
