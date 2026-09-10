package Colection.PartidaRecente;

public class Main {
    public static void main(String[] args) {

            Partida p1 = new Partida(1,"Anna","Vitoria");
            Partida p2 = new Partida(2,"Pedro","Derrota");
            Partida p3 = new Partida(3,"Maria","Derrota");
            Partida p4 = new Partida(4,"Maria","Derrota");
            Partida p5 = new Partida(5,"Maria","Derrota");
            Partida p6 = new Partida(6,"Maria","Derrota");

            HistoricoPartida hist = new HistoricoPartida();

            hist.salvarPartida(p1);
            hist.salvarPartida(p2);
            hist.salvarPartida(p3);
            hist.salvarPartida(p4);
            hist.salvarPartida(p5);
            hist.salvarPartida(p6);

        hist.desfazerPartida();
        System.out.println(hist.PartidaRecente());
        System.out.println(hist.PartidaAntiga());
        System.out.println(hist.consultarHistorico());


    }
}
