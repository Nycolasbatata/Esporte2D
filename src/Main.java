public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Matheus Tomoto");

        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(345);

        jogadora.setNome("Luna");
        surfista.setNome("Isa");

        // Polimorfismo
        qualquer = new Esportista();
        jogadora = (Esportista) new Pessoa();
        ((Esportista) qualquer).setIdFederacao(007);
        System.out.println(((Esportista) qualquer).getIdFederacao());


    }
}