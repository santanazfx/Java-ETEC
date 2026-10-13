package Enums.SistemaBancario;

public class Transacao {
    private double valor;
    private NivelRisco nivelRisco;
    private TipoTransacao tipoTransacao;
    private Integer identificador;

    public Transacao(double valor, NivelRisco nivelRisco, TipoTransacao tipoTransacao, Integer identificador) {
        this.valor = valor;
        this.nivelRisco = nivelRisco;
        this.tipoTransacao = tipoTransacao;
        this.identificador = identificador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public NivelRisco getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(NivelRisco nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "valor=" + valor +
                ", nivelRisco=" + nivelRisco +
                ", tipoTransacao=" + tipoTransacao +
                ", identificador=" + identificador +
                '}';
    }
}
