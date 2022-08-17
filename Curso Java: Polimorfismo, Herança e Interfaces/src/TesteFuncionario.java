
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario clayton = new Funcionario();
		
		clayton.setNome("clayton");
		clayton.setCpf("012.345.678-9");
		clayton.setSalario(5000);
		
		System.out.println(clayton.getNome());
		System.out.println(clayton.getBonificacao());
	}

}
