package SEM_4;

import java.util.ArrayList;
import java.util.List;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task0 {
    public static List<Integer> createArray(int size){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        createArray(1000000);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
