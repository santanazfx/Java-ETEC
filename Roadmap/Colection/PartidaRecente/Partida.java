package Colection.PartidaRecente;

public class Partida {
    private int id;
    private String adversario;
    private String resultado;

    public Partida(int id, String adversario, String resultado) {
        this.id = id;
        this.adversario = adversario;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", adversario='" + adversario + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
