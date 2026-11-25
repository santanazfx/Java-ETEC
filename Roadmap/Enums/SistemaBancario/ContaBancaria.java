package Enums.SistemaBancario;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    //adicionar senha pra integrar com o nivel de risco dps

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void depositar(Transacao TranValor){
        if (TranValor.getTipoTransacao() != TipoTransacao.DEPOSITO) throw new IllegalArgumentException("E apenas possivel realizar depositos.");
        if(TranValor.getValor() <= 0) throw new IllegalArgumentException("Erro ao depositar valor negativo.");
        saldo = saldo + TipoTransacao.DEPOSITO.taxaOperacao(TranValor.getValor());
    }
    public void sacar(Transacao sacar){
        if (sacar.getTipoTransacao() != TipoTransacao.SAQUE) throw new IllegalArgumentException("E apenas possivel realizar saques.");
        if(sacar.getValor() <= 0 || sacar.getValor() > saldo) throw new IllegalArgumentException("Erro ao sacar valor acima do disponivel.");
        saldo = saldo - sacar.getValor();
    }
    public void tranferir(ContaBancaria destino, Transacao TranValor){
        if(TranValor.getTipoTransacao() != TipoTransacao.TRANSFERENCIA) throw new IllegalArgumentException("E apenas possivel realizar tranferencias.");
        if(destino == null || this == destino) throw new IllegalArgumentException("Erro ao Tranferir");
        if(TranValor.getValor() <= 0 || TranValor.getValor() > saldo) throw new IllegalArgumentException("Erro ao transferir valor maior/menor que o saldo.");
        saldo = saldo - TranValor.getValor();
        destino.setSaldo(destino.getSaldo() + TipoTransacao.TRANSFERENCIA.taxaOperacao(TranValor.getValor())); //tentativa de separar o saldos e n alterar o da mesma conta
    }
    public void pagar (Transacao TranValor){
        if (TranValor.getTipoTransacao() != TipoTransacao.PAGAMENTO) throw new IllegalArgumentException("E apenas possivel realizar pagamentos.");
        if(TranValor.getValor() <= 0 ||TranValor.getValor() > saldo) throw new IllegalArgumentException("Vai se foder tbm ne.");
        saldo = saldo - TranValor.getValor();
    }

}
