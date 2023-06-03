package DZ_SEM_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class MainTask1 {
    private static List<Integer> arr = new LinkedList<>();

    public static void createLinkedList(){
        arr.add(7);
        arr.add(4);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        System.out.println(arr);

    }
    public static void reverseList() {
        Collections.reverse(arr);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        createLinkedList();
        reverseList();

    }
}
