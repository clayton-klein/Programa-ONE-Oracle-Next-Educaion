
public class Cliente implements Autenticavel {
	
	private Autenticacao autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticacao();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
