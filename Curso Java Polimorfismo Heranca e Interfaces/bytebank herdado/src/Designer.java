// Designer eh um Funcionario, ele herda as propriedades e métodos da class Funcionario, porém não herda o construtor, pois construtores não são herdados.

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}	

}