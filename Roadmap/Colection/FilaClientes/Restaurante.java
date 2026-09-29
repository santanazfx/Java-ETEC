package Colection.FilaClientes;

import java.util.*;
import java.util.Comparator;

public class Restaurante {
    private Queue<Pedido> pedidos = new PriorityQueue<>(new ComparatorPedido());

    public Queue<Pedido> mostrarPedidos() {
        return pedidos;
    }

    public boolean adicionarPedido(Pedido pedido){
        if(pedidos.contains(pedido)){
            throw new IllegalArgumentException("Pedido ja na lista");
        }
        return pedidos.offer(pedido);
    }

    public void removerPedidosAbaixoDe(double valor){
        Iterator<Pedido> iterator = pedidos.iterator();
        while (iterator.hasNext()){
            Pedido pedido = iterator.next();
            if(pedido.getValor() < valor){
                iterator.remove();
                }
            }
        }


    static class ComparatorPedido implements Comparator<Pedido>{
        @Override
        public int compare(Pedido o1, Pedido o2) {
            return o1.getValor().compareTo(o2.getValor());
        }
    }
    }



