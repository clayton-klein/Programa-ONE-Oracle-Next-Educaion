		
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		//int valor = 12.5; (fração dentro de variável do tipo int 
		//					 não compila)
		
		//como a variável é do tipo int o resultado será truncado
		//para o número inteiro resultante.
		int divisao = 5 / 2;
		System.out.println(divisao);
		
		//para termos o resultado exato precisamos criar uma variável
		//do tipo double e um dos números deve ser fração.
		double outraDivisao = 5.0 / 2;
		System.out.println(outraDivisao);
	}
}
