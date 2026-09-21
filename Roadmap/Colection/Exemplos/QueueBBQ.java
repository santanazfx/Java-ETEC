package Colection.Exemplos    ;

import java.util.LinkedList;
import java.util.*;

public class QueueBBQ {
    public static void main(String[] args) {
        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("maria");
        bbqLine.add("jacson");
        bbqLine.add("Susan");
        bbqLine.poll(); // retira a primeira pessoa na fila
        System.out.println(bbqLine.poll()); //retorna e retira a pessoa retirada
        System.out.println(bbqLine.peek());//retorna a pessoa porem sem tirala da fila
        bbqLine.size();//retorna o tamnaho da fila  (metodo contains pode ser usado)
        System.out.println(bbqLine.toArray()[1]); // retona o valor como se fosse um array

        //PriorytyQueue

        Queue<String> fila = new PriorityQueue<>();


        fila.add("D");
        fila.add("A");
        fila.add("M");

        while (!fila.isEmpty()){
            fila.poll();
        }


// Define the Student class
        class Student{

            String name;
            Integer age;

            Student(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public Integer getAge() {
                return age;
            }

            @Override
            public String toString() {
                return name + " : " + age;
            }
        }

// Comparador de multiplos campos
        class StudentComparator implements Comparator<Student>{

            public int compare(Student s1, Student s2) {
                return s1.getAge().compareTo(s2.getAge());
            }
        }
                List<Student> students = new ArrayList<>();
                students.add(new Student("Ajay", 27));
                students.add(new Student("Sneha", 23));
                students.add(new Student("Simran", 37));

                System.out.println("Original List:");
                for (Student s : students) {
                    System.out.println(s);
                }

                // Sort by name, then by age
//                Collections.sort(students, new StudentComparator());

                students.sort(new StudentComparator()); //Funciona igual em cima
                System.out.println("\nAfter Sorting:");
                for (Student s : students) {
                    System.out.println(s);
                }

                //Exemplo de prirqueue
//        Queue<Livro> ordemIsbn = new PriorityQueue<>(new Biblioteca.LivroComparator().reversed());
//        ordemIsbn.add(new Livro(4187,"Joao e o pe de feijao","Maria"));
//        ordemIsbn.add(new Livro(1235,"Noite","Dotor Pedro"));
//        ordemIsbn.add(new Livro(4336,"Joao e o pe de feijao","Maria"));
//        ordemIsbn.add(new Livro(1234,"Noites Brancas","Doto"));


//        while (!ordemIsbn.isEmpty()){
//            System.out.println(ordemIsbn.poll());
//        }
//        System.out.println("++++++++");
//        for(Livro livros : ordemIsbn){
//            System.out.println(livros);
//        }
//        static class LivroComparator implements Comparator<Livro>{
//            @Override
//            public int compare(Livro o1, Livro o2) {
//                return o1.getIsbn().compareTo(o2.getIsbn());
//            }
//        }
            }
        }

