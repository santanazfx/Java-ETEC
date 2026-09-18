package Colection.Biblioteca;

public class Venda {
    private int id;
    private Cliente cliente;
    private String data;
    private Livro livro;

    public Venda(int id, String data, Livro livro) {
        this.id = id;
        this.data = data;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", data='" + data + '\'' +
                ", livro=" + livro +
                '}';
    }
}
