package Colection.Biblioteca;

public class Cliente {
    private int id;
    private String nome;
    private Integer prioriade;


    public Cliente(int id,String nome,Integer prioriade){
        this.nome = nome;
        this.id = id;
        this.prioriade = prioriade;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPrioriade() {
        return prioriade;
    }

    public void setPrioriade(Integer prioriade) {
        this.prioriade = prioriade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prioriade=" + prioriade +
                '}';
    }
}
