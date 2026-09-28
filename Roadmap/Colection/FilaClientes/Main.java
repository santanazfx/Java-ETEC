package Colection.FilaClientes;

public class Main {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(1,"ana",20.0);
        Pedido p2 = new Pedido(2,"ana",30.0);
        Pedido p3 = new Pedido(3,"ana",120.0);
        Restaurante r1 = new Restaurante();


        r1.adicionarPedido(p1);
        r1.adicionarPedido(p2);
        r1.adicionarPedido(p3);
        System.out.println(r1.mostrarPedidos());
//        r1.removerPedidosAbaixoDe(50);
        System.out.println("===========");
//        System.out.println(r1.mostrarPedidos());



    }
}
