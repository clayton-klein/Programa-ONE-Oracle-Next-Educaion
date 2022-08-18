public class TesteGerente {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Clayton");
        gerente.setCpf("123.456.789-0");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(007);
        boolean autenticou = gerente.autentica(007);

        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }

}