package DZ_SEM_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


//        Задание
//        Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class Main {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();
    static List<Integer> oddList = new ArrayList<>();
    static double arithmeticMean = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
        System.out.println(ints);
        for (int oddNumber :ints) {
            if (oddNumber%2 != 0) {
                oddList.add(oddNumber);
            }

        }
        System.out.println(oddList);
        System.out.println("Максимальное значение : " + Collections.max(ints));
        System.out.println("Минимальное значение : " + Collections.min(ints));


        for (int i = 0; i < ints.size(); i++) {
            arithmeticMean = arithmeticMean + ints.get(i);
        }
        System.out.println("Среднее арифмитическое : " + arithmeticMean/ints.size() );
    }
}
