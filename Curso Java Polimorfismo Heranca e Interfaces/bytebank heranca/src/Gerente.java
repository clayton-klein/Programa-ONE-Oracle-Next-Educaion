// Gerente eh um Funcionario, ele herda as propriedades e métodos da class Funcionario, porém não herda o construtor, pois construtores não são herdados.

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	@Override // notação que avisa o compilador que esta classe será sobrescrita.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
	    return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}