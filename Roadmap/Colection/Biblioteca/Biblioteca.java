package Colection.Biblioteca;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private Map<Integer, Livro> livrosPorIsbn = new HashMap<>();
    private Queue<Cliente> filaClientes = new PriorityQueue<>(new ClienteComparator());
    private Deque<Venda> realizarVenda = new ArrayDeque<>();

    public Biblioteca() {
    }

    public Boolean cadastrarLivro(Livro livro){
        if (livros.contains(livro) || livrosPorIsbn.containsKey(livro.getIsbn())) {
            throw new IllegalArgumentException("Livro ja adicionado");
        }  else {
            livros.add(livro);
            livrosPorIsbn.put(livro.getIsbn(),livro);
                return true;
        }
    }


    public Livro buscarLivro(int isbn){
        return livrosPorIsbn.get(isbn);
    }

    public boolean removerLivro(int isbn){
        if (!livrosPorIsbn.containsKey(isbn)){
            throw new IllegalArgumentException("Livro nao encontrado");
        }else {
            livros.remove(livrosPorIsbn.get(isbn));
            livrosPorIsbn.remove(isbn);
                return true; //remove e retona o sucesso
        }
    }
    public List<Livro> listarLivros(){
        return livros;
    }

    public List<Livro> buscarPorCategoria(String categoria){
        List<Livro> listaCat = new ArrayList<>();
        for(Livro livro : livros){
            if (livro.getCategorias().contains(categoria)){
                listaCat.add(livro);
            }
        }
        return listaCat;
    }

    public boolean adicinarClienteFila(Cliente cliente){
        if (filaClientes.contains(cliente)){ throw new IllegalArgumentException("Cliente ja esta na fila");}
       else{return filaClientes.offer(cliente);}
    }

    public Cliente verProximoCliente(){
        return filaClientes.peek(); //vai so ver quem e  cliente sem removelo!
    }

    public int quantidadeFila(){
        return filaClientes.size(); //retorna so o tamanho
    }
    public void fecharLoja(){
        while (!filaClientes.isEmpty()) filaClientes.poll();
    }

    public boolean realizarVenda(Venda venda){
        if (realizarVenda.size() >= 10) realizarVenda.pollFirst();
        filaClientes.poll();
        livros.remove(venda.getLivro());
        livrosPorIsbn.remove(venda.getLivro().getIsbn());
            return realizarVenda.offerLast(venda);
    }

    public Deque<Venda> historicoVenda(){
//        for (Venda venda : realizarVenda) System.out.println(venda);
        return realizarVenda;
    }

    static class ClienteComparator implements Comparator<Cliente>{
        @Override
        public int compare(Cliente c1, Cliente c2) {
            return c1.getPrioriade().compareTo(c2.getPrioriade());
        }
    }

    static class LivroComparator implements Comparator<Livro>{
        @Override
        public int compare(Livro o1, Livro o2) {
            return o1.getIsbn().compareTo(o2.getIsbn());
        }
    }
}

