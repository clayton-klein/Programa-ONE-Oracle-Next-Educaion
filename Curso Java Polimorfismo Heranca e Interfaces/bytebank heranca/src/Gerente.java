// Gerente eh um Funcionario, ele herda as propriedades e métodos da class Funcionario, porém não herda o construtor, pois construtores não são herdados.

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override // notação que avisa o compilador que esta classe será sobrescrita.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
	    return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}