package Colection.FilaClientes;

public class Pedido {
    private Integer id;
    private String cliente;
    private Double valor;

    public Pedido(Integer id, String cliente, Double valor){
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                '}';
    }
}
