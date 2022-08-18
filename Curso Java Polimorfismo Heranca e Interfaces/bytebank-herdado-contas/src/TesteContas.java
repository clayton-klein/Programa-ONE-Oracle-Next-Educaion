
public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 456);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(789, 123);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		cc.saca(50);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
