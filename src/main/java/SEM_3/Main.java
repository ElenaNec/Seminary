package SEM_3;

import java.util.*;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class Main {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);
    }
}
