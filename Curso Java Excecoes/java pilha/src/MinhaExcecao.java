// Uma excecao pode ser "unchecked" (não verificada pelo compilador e extendida de RunTimeException) ou "checked" (extendida da classe mãe de RunTimeException chamada "Exception" e que deve conter a mesma assinatura de Exception utilizando a palavra chave throws e o nome da classe após chamar o método que se queira tratar ou utilizando try/catch para compilar) e a classe mãe de Exception e que realmente contém os métodos utilizados nas exceptions é a "Throwable" (é possível ir navegando entre elas segurando a tecla Ctrl e clicando no nome das classes.

// A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. 
// Exceções são usadas em códigos de aplicação. 
// Erros são usados exclusivamente pela máquina virtual.
// Classes que herdam de Error são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de Error.

public class MinhaExcecao extends RuntimeException {
	
	public MinhaExcecao(String errorMsg) {
		super(errorMsg);
	}

}
