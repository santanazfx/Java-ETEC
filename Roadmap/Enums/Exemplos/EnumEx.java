package Enums.Exemplos;

import java.util.ArrayList;
import java.util.List;

public class EnumEx {
    public static void main(String[] args) {
        enum tamanho{ PEQUENO, MEDIO, GRANDE, EXTRAGRANDE  }//Os numeros dos parenteses sao as const do enum.
        tamanho tamanhoPizza;
        tamanhoPizza = tamanho.MEDIO;
        tamanho.PEQUENO.compareTo(tamanho.MEDIO);// metodos
        tamanho.PEQUENO.ordinal(); //retorna sua posicao no enum
        tamanho.PEQUENO.toString(); //retorna a representacao String
        tamanho.PEQUENO.name();// retorna o nome deifinido do enum
        tamanho.valueOf("PEQUENO");

        List<tamanho> enumarray = new ArrayList<>(); // retorna um array do tipo do enum



        switch (tamanhoPizza){
            case PEQUENO:
                System.out.println("O pedido foi uma pizza pequena");
                break;
            case MEDIO:
                System.out.println("O pedido foi uma pizza media");
                break;
            case GRANDE:
                System.out.println("O pedido foi uma pizza grande");
                break;
            case EXTRAGRANDE:
                System.out.println("O pedido foi uma pizza extragrande");
                break;
            default:
                System.out.println("Tamanho não valido");
        }
    }
}




