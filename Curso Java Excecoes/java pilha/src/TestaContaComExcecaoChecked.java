
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita(100.0);
		} catch(MinhaExcecao excecao) {
			System.out.println("Tratamento...");
		}
	}

}
