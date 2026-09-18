package Colection.Biblioteca;




public class Main {
    public static void main(String[] args) {
        try {

        Livro l1 = new Livro(1234, "Noites Brancas", "Doto");
        Livro l2 = new Livro(1236, "Noite", "Dotor Pedro");
        Livro l3 = new Livro(4336, "Joao e o pe de feijao", "Maria");
        Livro l4 = new Livro(3324, "Joao e o pe de feijao", "Maria");

        Cliente c1 = new Cliente(1, "Maria", 0);
        Cliente c2 = new Cliente(2, "Ana", 1);
        Cliente c3 = new Cliente(3, "Joe", 2);

        Venda v1 = new Venda(1,"12/2/13",l1);
        Venda v2 = new Venda(2,"12/2/13",l3);


        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l3);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l4);
        biblioteca.adicinarClienteFila(c1);
        biblioteca.adicinarClienteFila(c2);
        biblioteca.adicinarClienteFila(c3);

        biblioteca.realizarVenda(v1);
        biblioteca.realizarVenda(v2);
        System.out.println(biblioteca.historicoVenda());


        }catch (IllegalArgumentException | NullPointerException err) {
            System.out.println(err.getMessage());
        }



    }
}
