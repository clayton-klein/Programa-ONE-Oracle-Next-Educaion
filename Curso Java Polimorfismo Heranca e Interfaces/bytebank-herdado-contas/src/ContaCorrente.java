
public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; // taxa de R$0,20 para saque
		return super.saca(valorASacar);
	}
}
