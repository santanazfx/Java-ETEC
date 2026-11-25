package Enums.SistemaBancario;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("012","nanda");
        ContaBancaria c2 = new ContaBancaria("011","ana");

        Transacao t1 = new Transacao(100,NivelRisco.ALTO,TipoTransacao.DEPOSITO,1);
        Transacao t2 = new Transacao(100,NivelRisco.ALTO,TipoTransacao.DEPOSITO,2);
        c1.depositar(t1);
        c1.depositar(t2);
        Transacao t3 = new Transacao(100,NivelRisco.ALTO,TipoTransacao.TRANSFERENCIA,2);
        c1.tranferir(c2,t3);
        System.out.println(c2.getSaldo());

    }
}
