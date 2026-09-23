package Colection.Exemplos;

import java.util.*;


public class IteratorEX {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Maca");
        frutas.add("Uva");

        Iterator<String> iterator = frutas.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove(); //remove da lista todos os objeto q entrarem no next
//        }
//        System.out.println(frutas);

        ListIterator<String> listIterator = frutas.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



//        Map<String, String> alunos = new HashMap<>();
//        alunos.put("2","Ana");
//        alunos.put("2","Pedro");

        //pode se usar o iterator com chave e valor individualmente
//        Iterator<String> keyIterator = alunos.keySet().iterator();
//        Iterator<String> valueIterator = alunos.values().iterator();
        //ou entrando no map e o percorrendo
//        Iterator<Map.Entry<String, String>> entryIterator = alunos.entrySet().iterator();


    }
}
