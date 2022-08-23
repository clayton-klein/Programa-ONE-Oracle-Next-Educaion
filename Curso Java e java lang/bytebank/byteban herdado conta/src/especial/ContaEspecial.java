package especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial(987, 543);
		System.out.println(ce.saldo); // acessando a propriedade "saldo" da classe "Conta" que é visível para os seus descendentes através da herança e declaração do modificador "protected".
		ce.deposita(100);
		System.out.println(ce.saldo);
	}	
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
