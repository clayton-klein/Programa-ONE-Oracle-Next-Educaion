
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("joao");
		gerente.setCpf("012.345.678-9");
		gerente.setSalario(8000.00);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		int senha = gerente.setSenha(007);
		boolean autenticou = gerente.autentica(senha);
		
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());
		
	}
}
