package Colection.Formula1;

import java.util.*;

public class Campeonato {
    private List<Piloto> pilotos = new ArrayList<>();
    private Map<Integer,Piloto> pilotosPorNumero = new HashMap<>();
    private Queue<Piloto> filaEntrevistas = new LinkedList();

    public Boolean adcionarPiloto(Piloto piloto){
        if (pilotos.contains(piloto)) throw new IllegalArgumentException("Piloto ja adicionado");
        pilotosPorNumero.put(piloto.getNumero(),piloto);
        return pilotos.add(piloto);
    }

    public void removerPiloto(Integer numero){
        if (!pilotosPorNumero.containsKey(numero)) throw new IllegalArgumentException("Piloto nao encontrato");
        pilotosPorNumero.remove(numero);
        pilotos.remove(pilotosPorNumero.get(numero));
    }

    public Piloto buscarPiloto(Integer numero){
        return pilotosPorNumero.get(numero);
    }

    public Boolean adicionarEntrevista(Piloto piloto){
        return filaEntrevistas.offer(piloto);
    }

    public void removerPorCategoria(Piloto.Categoria categoria){
        Iterator<Piloto> iterator = pilotos.iterator();
        while (iterator.hasNext()){
            Piloto piloto = iterator.next();
            if (piloto.getCategorias().contains(categoria)) {
                pilotosPorNumero.remove(piloto.getNumero());
                iterator.remove();
            }
        }

    }

    public void listarPorCategoria(Piloto.Categoria categoria){

    }
}
