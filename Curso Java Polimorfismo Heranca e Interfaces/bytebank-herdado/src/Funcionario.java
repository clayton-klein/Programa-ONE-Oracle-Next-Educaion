// classe abstrata, não pode ser instanciada diretamente, apenas herdada.
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// método sem corpo, não há implementação, apenas a "assinatura" e as classes filhas são obrigadas implementar este métodos.
	public abstract double getBonificacao();
	
	// getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}