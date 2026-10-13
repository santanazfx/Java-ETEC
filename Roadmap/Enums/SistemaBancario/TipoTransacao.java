package Enums.SistemaBancario;

public enum TipoTransacao {
    DEPOSITO("Deposito",true){
        @Override
        double taxaOperacao(double valor) {
            return valor * 0.03;
        }
    },
    TRANSFERENCIA("Transferencia",false){
        @Override
        double taxaOperacao(double valor) {
            return valor * 0.1;
        }
    },
    SAQUE("Saque",false){
        @Override
        double taxaOperacao(double valor) {
            return valor * 0.05;
        }
    },
    PAGAMENTO("Pagamento",false){
        @Override
        double taxaOperacao(double valor) {
            return valor * 0.05;
        }
    };

    public final String descricao;
    private final boolean aumentaSaldo;



    public Boolean getAumentaSaldo() {
        return aumentaSaldo;
    }

    TipoTransacao(String descricao,Boolean aumentaSaldo) {
        this.descricao = descricao;
        this.aumentaSaldo = aumentaSaldo;
    }

    abstract double taxaOperacao(double valor);
}
