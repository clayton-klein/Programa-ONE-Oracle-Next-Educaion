
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
        System.out.println(letra);
        
        //o tipo char guarda apenas um caractere da tabela unicode, por isso, quando passamos um valor numérico, teremos como saída o caractere correspondente ao número na tabela unicode.
        char valor = 65;  // Compila!
        System.out.println(valor);
        
        //Nosso código não compila, quando escrevemos essa soma, o Java automaticamente transforma o resultado para o maior tipo, que nesse caso é int, já que o número 1 é um inteiro.
//        valor = valor + 1;         // Não compila!
//        System.out.println(valor);
        
        //Repare que envolvemos a soma com parênteses, dessa forma, dizemos para o Java que queremos transformar o resultado dessa soma em char.
        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);
        
        //Para String, usaremos obrigatóriamente aspas duplas.
        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);
        
        //Repare que o número 2020 aparece no final da frase, isso acontece porque que o Java converte automaticamente o número para String, diferente do que acontecia com os tipos primitivos que vimos anteriormente.
        palavra = palavra + " " + 2020;
        System.out.println(palavra);
	}
}
