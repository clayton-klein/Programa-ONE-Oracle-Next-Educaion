
public class Gerente extends Funcionario {
	private int senha;
	
	//class methods
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	//getters and setters
	public int setSenha(int senha) {
		return this.senha = senha; //retornando para o valor poder ser armazenado em uma variável e utilizado futuramente.
	}
}
