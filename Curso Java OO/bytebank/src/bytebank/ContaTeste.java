package bytebank;

public class ContaTeste {
	public static void main(String[] args) {
		Conta contaClayton = new Conta();
		contaClayton.titular = new Cliente();
		contaClayton.titular.nome = "Clayton";
		
		System.out.println(contaClayton.titular.nome);
		
	}
}
