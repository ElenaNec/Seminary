package DZ_SEM_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class MainTask2 {
    private static LinkedList<Integer> arr = new LinkedList<>();
    static Random random = new Random();


    public static void createLinkedList(){
        arr.add(7);
        arr.add(4);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        System.out.println("исходный список :\n" + arr);
    }

    public static void enqueue(){
        arr.add(arr.size(), random.nextInt(10, 25));
        System.out.println("добавление эл-та в конец очереди :\n" + arr);
    }

    public static void dequeue(){
        arr.pollFirst();
        System.out.println("возвращает первый эл-т из очереди и удаляет его :\n" + arr.pollFirst() + "\n" + arr);
    }


    public static void first(){
        System.out.println("возвращает первый элемент из очереди, не удаляя его:\n" + arr.getFirst() + "\n" + arr);
    }
    public static void main(String[] args) {
        createLinkedList();
        enqueue();
        dequeue();
        first();
    }
}
