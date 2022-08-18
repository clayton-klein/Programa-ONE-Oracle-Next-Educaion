public class TesteReferencias {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Clayton");
        gerente.setSalario(5000.0);

        EditorVideo videoEditor = new EditorVideo();
        videoEditor.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(videoEditor);
        controle.registra(designer);

        System.out.println(controle.getSoma());

    }

}