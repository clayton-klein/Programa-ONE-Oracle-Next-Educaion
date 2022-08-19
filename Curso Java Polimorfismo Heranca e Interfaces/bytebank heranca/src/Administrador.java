
public class Administrador extends Funcionario implements Autenticavel {
	
	private Autenticacao autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticacao();
	}
	
	@Override
	public double getBonificacao() {
		return 0;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
