package SEM_6;

import java.util.*;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
//        1.5. Создайте метод, в который передайте заполненный выше массив,
//        и с помощью Set вычислите процент уникальных значений в данном массиве,
//        и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Task1 {
    private static int[] getArray(){
        Random randomNum = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNum.nextInt(25);
        }
        return array;
    }
    private static float getUniquePercent(int[] arr){
        Set<Integer> integers = new HashSet<>();
        for (int j : arr) {
            integers.add(j);
        }
        return integers.size() * 100f / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(getUniquePercent(getArray()));
    }
}