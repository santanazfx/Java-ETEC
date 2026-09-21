package Colection.Exemplos;

import java.util.*;

public class DequeEX {
    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("Primeiro Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Ultimo elemento: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removendo o primeiro elem: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removendo o ultimo Element: " + removedNumber2);

        System.out.println("Updated DequeEX: " + numbers);
    }
}