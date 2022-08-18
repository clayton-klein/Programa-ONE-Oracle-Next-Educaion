
public class SistemaInterno {
	private int senha = 1234;
	
	public void autentica(Autenticavel pessoa) {
		boolean autenticou = pessoa.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Acesso autorizado...");
		} else {
			System.out.println("Acesso negado, verifique sua senha...");
		}
	}
}
