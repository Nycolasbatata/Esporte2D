public class Esportista extends Pessoa{
    private int idFederacao;

    // Construtor

    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    // Getter e Setter


    public int getIdFederacao() {

        return idFederacao;
    }

    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    // Método
    public String sacar(){
        return "Sacando ...";
    }
}
