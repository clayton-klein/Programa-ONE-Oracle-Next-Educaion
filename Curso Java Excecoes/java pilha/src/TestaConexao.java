
public class TestaConexao {
	public static void main(String[] args) {
		
		// forma nova de se fazer try/catch(pós versão 7)
		try(Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch(IllegalStateException exception) {
			System.out.println("Deu erro na conexão!");
		}
		
//		// forma antiga de se fazer try/catch (pré versão 7)
//		
//		Conexao conexao = null; // tirando referencia do bloco para poder repeti-la no try e no finally.
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//			conexao.fecha();
//		} catch(IllegalStateException exception) {
//			System.out.println("Deu erro na conexão!");
//		} finally { // bloco opcional que SEMPRE será executado.
//			conexao.fecha();
//		}
	}

}
