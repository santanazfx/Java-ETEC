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

    public Piloto realizarEntrevista(){
        return filaEntrevistas.poll();
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
    //funciona tbm com o codigo abaixo que usar labda mas so funncioa com list e set pelo visto
    //pilotos.removeIf(pilot -> pilot.getCategorias().contains(categoria));

    public List<Piloto> listarPorCategoria(Piloto.Categoria categoria) {
        List<Piloto> pilotsCat = new ArrayList<>();
        Iterator<Piloto> pilotoIterator = pilotos.iterator();
        while(pilotoIterator.hasNext()) {
            Piloto piloto = pilotoIterator.next();
            if(piloto.getCategorias().contains(categoria)){
                pilotsCat.add(piloto);
            }
        }
        return pilotsCat;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "pilotos=" + pilotos +
                ",\nfilaEntrevistas=" + filaEntrevistas +
                '}';
    }
}
