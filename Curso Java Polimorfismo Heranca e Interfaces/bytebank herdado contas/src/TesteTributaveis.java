
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 456);
		cc.deposita(100);
		
		SeguroDeVida seguroVida = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		
		calc.registra(cc);
		calc.registra(seguroVida);
		
		System.out.println(calc.getTotalImposto());
	}

}
