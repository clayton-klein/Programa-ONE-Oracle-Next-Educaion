package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numeroCC;
	private Cliente titular;
	private static int total = 0;
	
	//constructor
	public Conta(int agencia, int numeroCC) {
		this.agencia = agencia;
		this.numeroCC = numeroCC;
		this.saldo = 100;//conta nova inicia com $100.
		System.out.println("Criando uma conta " + this.numeroCC);
		total++;//ou Conta.total++
		System.out.println("O total de contas é " + Conta.total);
	}
	
	//class methods
		public void deposita(double valor) {
			this.saldo += valor;
		}
		
		public void saca(double valor) throws SaldoInsuficienteException {
			// lógica invertida, recomendado lançar exceções no início dos métodos.
			if(this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			}
			// se tudo der certo subtrai o valor de saque.
			this.saldo -= valor;
		}
		
		public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
			this.saca(valor);
			this.deposita(valor);
		}
	
	//getters and setters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não é permitido número negativo ou zero");
			return; //encerra a função e retorna;
		}
		this.agencia = agencia;
	}
	
	public int getNumeroCC() {
		return this.numeroCC;
	}
	public void setNumeroCC(int numeroCC) {
		if(numeroCC <= 0) {
			System.out.println("Não é permitido número negativo ou zero");
			return; //encerra a função e retorna;
		}
		this.numeroCC = numeroCC;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
