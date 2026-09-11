package Colection.PartidaRecente;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistoricoPartida {
    private Deque<Partida> partidas = new ArrayDeque<>();

    public Deque<Partida> getPartidas() {
        return partidas;
    }

    public Boolean salvarPartida(Partida partida){
        if(partidas.size() <= 5) return partidas.offerLast(partida);
        else {
            partidas.pollFirst();
            return partidas.offerLast(partida);
        }
    }
    public Partida PartidaRecente(){
        return partidas.peekLast();
    }
    public Partida PartidaAntiga(){
        return partidas.peekFirst();
    }
    public int consultarHistorico(){
        return partidas.size();
    }
    public Partida desfazerPartida(){
        return partidas.pollLast();
    }
}

