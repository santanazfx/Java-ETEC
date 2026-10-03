package Colection.Formula1;

public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto(5,"Lecrerc","Ferraros",1, Piloto.Categoria.ROOKIE);
        Piloto p2 = new Piloto(1,"Max","Redbulso",88, Piloto.Categoria.CAMPEAO);
        Piloto p3 = new Piloto(2,"Ramires","Ferraros",55, Piloto.Categoria.EXPERIENTE);
        Piloto p4 = new Piloto(4,"Borboleto","Audi",70, Piloto.Categoria.ROOKIE);
        Piloto p5 = new Piloto(6,"Hamilton","Mercedes",79, Piloto.Categoria.ROOKIE);
        Piloto p6 = new Piloto(7,"Mackenn","Mclaren",86, Piloto.Categoria.EXPERIENTE);
        Piloto p7 = new Piloto(9,"Albino","Mclaren",26, Piloto.Categoria.EXPERIENTE);
        Piloto p8 = new Piloto(10,"MaxJR","Redbulso",40, Piloto.Categoria.CAMPEAO);

        Campeonato c1 = new Campeonato();

        c1.adcionarPiloto(p1);
        c1.adcionarPiloto(p2);
        c1.adcionarPiloto(p3);
        c1.adcionarPiloto(p4);
        c1.adcionarPiloto(p5);
        c1.adcionarPiloto(p6);
        c1.adcionarPiloto(p7);
        c1.adcionarPiloto(p8);

        c1.adicionarEntrevista(p1);
        c1.adicionarEntrevista(p7);
        c1.adicionarEntrevista(p4);
        c1.adicionarEntrevista(p2);

        System.out.println(c1.toString());
        System.out.println("============");
        c1.removerPorCategoria(Piloto.Categoria.ROOKIE);
        System.out.println(c1.listarPorCategoria(Piloto.Categoria.EXPERIENTE));
        System.out.println("============");
        System.out.println(c1.toString());
        c1.realizarEntrevista();
        c1.realizarEntrevista();
        System.out.println("============");


    }
}
