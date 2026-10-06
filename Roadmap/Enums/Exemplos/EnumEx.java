package Enums.Exemplos;


import java.util.EnumMap;
import java.util.EnumSet;


public class EnumEx {
    public static void main(String[] args) {

        MesesDoAno mes = MesesDoAno.FEVEREIRO;
        System.out.println("Valor da constante: " + mes +
                "\n" + "Valor numérico do mês: " + mes.getValor() +
                "\n" + "Descrição do mês: " + mes.getDescricao());

        System.out.println(MesesDoAno.JANEIRO.normalize());

        EnumSet enumSet = EnumSet.of(MesesDoAno.JANEIRO, MesesDoAno.FEVEREIRO); //Da pra escolher quais onst vao pro set

        EnumMap<MesesDoAno, String> enumMap = new EnumMap<>(MesesDoAno.class);
        enumMap.put(MesesDoAno.FEVEREIRO, "Fevereiro");







//        enum tamanho{ PEQUENO, MEDIO, GRANDE, EXTRAGRANDE  }//Os numeros dos parenteses sao as const do enum.
//        tamanho tamanhoPizza;
//        tamanhoPizza = tamanho.MEDIO;
//        tamanho.PEQUENO.compareTo(tamanho.MEDIO);// metodos
//        tamanho.PEQUENO.ordinal(); //retorna sua posicao no enum
//        tamanho.PEQUENO.toString(); //retorna a representacao String
//        tamanho.PEQUENO.name();// retorna o nome deifinido do enum
//        tamanho.valueOf("PEQUENO");

//        List<tamanho> enumarray = new ArrayList<>(); retorna um array do tipo do enum
//        switch (tamanhoPizza){
//            case PEQUENO:
//                System.out.println("O pedido foi uma pizza pequena");
//                break;
//            case MEDIO:
//                System.out.println("O pedido foi uma pizza media");
//                break;
//            case GRANDE:
//                System.out.println("O pedido foi uma pizza grande");
//                break;
//            case EXTRAGRANDE:
//                System.out.println("O pedido foi uma pizza extragrande");
//                break;
//            default:
//                System.out.println("Tamanho não valido");
//        }
    }
}




