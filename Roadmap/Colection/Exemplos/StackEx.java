package Colection.Exemplos;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
//
//    Stack stack = new Stack();
//
//    stack.push("primerio objeto");
//    stack.push("Segundo objeto");
//
//    String dois = (String) stack.pop();
//    String um = (String) stack.pop();
//
//    System.out.println(dois);
//    System.out.println(um);
//    System.out.println(stack);

        //Stack com tipo definido
        Stack<String> stack = new Stack<>();

        stack.push("objeto");
        int index1 = stack.search("objeto");

        stack.push("segundo objeto");
        int index2 = stack.search("objeto");

        stack.push("terceiro objeto");
        int index3 = stack.search("objeto");

        int indexerr = stack.search("ABCD");

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(indexerr);


        System.out.println(stack);

    }
}
