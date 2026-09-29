package Colection.Exemplos;

import java.util.*;

public class Coletion {
    public  static void main(String[] args) {

        List<String> frutas = new ArrayList<>();
    
        frutas.add("Banana");
        frutas.add("Maca"); //lista ordenada
        frutas.add("Uva");
        frutas.add("Ana");

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println(frutas.get(1));
        frutas.get(1);
        frutas.add("Laranja");
//      frutas.remove(3);
        frutas.contains("Banana"); //retorna true
        frutas.size();
//        frutas.set(1,"Uva");
//        frutas.clear();


//        Set<String> cpf = new HashSet<>(); //Os metodos sao os mesmo porem sem get/set
//        cpf.add("111");
//        cpf.add("111");
//        cpf.add("111");
//        cpf.add("222");
//        cpf.contains("222"); //subtistui o get ja q o set n tem indice
//        System.out.println(cpf);

        Map<Integer,String> alunos = new HashMap<>();
        alunos.put(1,"Ana");
        alunos.put(2,"Pedro");
//        System.out.println(alunos.get(2));
        frutas.remove(alunos.get(1));
        System.out.println("========");
        System.out.println(frutas);
//        alunos.containsKey(2);
//        alunos.containsValue("Pedro");


    }
}
