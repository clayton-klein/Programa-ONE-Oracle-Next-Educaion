
public class TestaConversao {
	public static void main(String[] args) {
		//Esse código não compila, uma vez que estamos tentando atribuir uma 
		//variável double dentro de uma variável int, o que não é possível 
		//na linguagem Java.

		//Lembre-se, entretanto, que o inverso é valido, ou seja, podemos 
		//atribuir um valor do tipo int dentro de uma variável do tipo double.
		double salario = 1270.50;
		//aqui usamos "casting" para converter o valor fracionário da 
		//variável salario em inteiro (perdendo 0.50)
		int valor = (int) salario;
	    System.out.println(valor);
	    
	    //o resultado não é exatamente 0.3, double não é a melhor escolha
	    //para guardar valores monetátios.
	    double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        
        //No exemplo abaixo eremos um erro, já que para o Java, 3.14 é um double. 
        //Esse é o mesmo problema que tivemos quando tentamos guardar um 
        //double dentro de um int. 
        //No tipo double podemos armazenar 64 bits,
        //no float e no int apenas 32 bits. 
        //Isso pode acarretar em perda de 
        //informação, para que esse código funcione, podemos fazer o casting,
        //colocando (float) na frente de 3.14, mas faremos de uma outra forma.
        //Informe ao Java que o valor 3.14 é um float, para isso coloque f 
        //ao final do número.
        float pontoFlutuante = 3.14; //o correto seria 3.14f;
	}
}
