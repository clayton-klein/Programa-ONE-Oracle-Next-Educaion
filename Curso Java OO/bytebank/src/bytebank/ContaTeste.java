package bytebank;

public class ContaTeste {
	public static void main(String[] args) {
		Conta contaClayton = new Conta(123, 456);
		contaClayton.setTitular(new Cliente());
		contaClayton.getTitular().setNome("Clayton");
		
		System.out.println(contaClayton.getTitular().getNome());
		
	}
}
