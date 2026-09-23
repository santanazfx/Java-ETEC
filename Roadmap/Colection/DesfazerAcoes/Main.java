package Colection.DesfazerAcoes;

import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Stack<String> editor = new Stack<>();

        editor.push("Escreveu texto");
        editor.push("Colocou imagem");
        editor.push("Mudou fonte");

        if (editor.isEmpty()) throw new IllegalArgumentException("Sem nada a desfazer");
        System.out.println("Liberado: "+editor.pop());
        System.out.println("Proximo: "+editor.peek());
        }
    }

